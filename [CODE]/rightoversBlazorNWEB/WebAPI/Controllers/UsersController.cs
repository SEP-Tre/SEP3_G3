using System.IdentityModel.Tokens.Jwt;
using System.Security.Claims;
using System.Text;
using Application.LogicInterfaces;
using Domain.Classes;
using Domain.DTOs;
using Microsoft.AspNetCore.Mvc;
using Microsoft.IdentityModel.Tokens;
using JwtRegisteredClaimNames = Microsoft.IdentityModel.JsonWebTokens.JwtRegisteredClaimNames;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class UsersController : ControllerBase
{
    private readonly IUserLogic userLogic;
    private readonly IConfiguration config;

    public UsersController(IConfiguration config, IUserLogic userLogic)
    {
        this.config = config;
        this.userLogic = userLogic;
    }

    [HttpPost, Route("login")]
    public async Task<ActionResult> LoginAsync(UserLoginDto dto)
    {
        try
        {
            User user = await userLogic.LoginAsync(dto);
            string token = GenerateJwt(user);

            return Ok(token);
        }
        catch (Exception e)
        {
            return BadRequest(e.Message);
        }
    }

    [HttpPost, Route("register")]
    public async Task<ActionResult> RegisterAsync(UserCreationDto dto)
    {
        try
        {
            User user = await userLogic.RegisterAsync(dto);

            return Ok(user);
        }
        catch (Exception e)
        {
            return BadRequest(e.Message);
        }
    }


    private List<Claim> GenerateClaims(User user)
    {
        var claims = new[]{
            new Claim(JwtRegisteredClaimNames.Sub, config["Jwt:Subject"]),
            new Claim(JwtRegisteredClaimNames.Jti, Guid.NewGuid().ToString()),
            new Claim(JwtRegisteredClaimNames.Iat, DateTime.UtcNow.ToString()),
            new Claim("Id", user.Id.ToString()),
            new Claim("UserName", user.UserName),
            new Claim("FirstName", user.FirstName),
            new Claim("AddressId", user.Address.AddressId.ToString()),
            new Claim("StreetName", user.Address.Street),
            new Claim("StreetNumber", user.Address.StreetNumber),
            new Claim("PostalCode", user.Address.PostCode.ToString()),
            new Claim("City", user.Address.City),
            new Claim("Longitude", user.Address.Longitude.ToString()),
            new Claim("Latitude", user.Address.Latitude.ToString())
            //@context.User.Longitude <- This is a string.
        };

        return claims.ToList();
    }

    private string GenerateJwt(User user)
    {
        List<Claim> claims = GenerateClaims(user);

        SymmetricSecurityKey key = new SymmetricSecurityKey(Encoding.UTF8.GetBytes(config["Jwt:Key"]));
        SigningCredentials signIn = new SigningCredentials(key, SecurityAlgorithms.HmacSha512);

        JwtHeader header = new JwtHeader(signIn);

        JwtPayload payload = new JwtPayload(
            config["Jwt:Issuer"],
            config["Jwt:Audience"],
            claims,
            null,
            DateTime.UtcNow.AddMinutes(60));

        JwtSecurityToken token = new JwtSecurityToken(header, payload);

        string serializedToken = new JwtSecurityTokenHandler().WriteToken(token);

        return serializedToken;
    }
}