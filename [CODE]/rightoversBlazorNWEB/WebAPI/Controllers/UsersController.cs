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
    private readonly IConfiguration config;
    private readonly IUserLogic userLogic;

    public UsersController(IConfiguration config, IUserLogic userLogic)
    {
        this.config = config;
        this.userLogic = userLogic;
    }

    [HttpGet]
    public async Task<ActionResult<User>> GetByUsername([FromQuery] string username)
    {
        try
        {
            var user = await userLogic.GetByUsername(username);

            return Ok(user);
        }
        catch (Exception e)
        {
            return BadRequest(e.Message);
        }
    }

    [HttpGet]
    [Route("Reservations")]
    public async Task<ActionResult<IEnumerable<Reservation>>> GetReservationsByUsername([FromQuery] string username)
    {
        try
        {
            var reservations = await userLogic.GetAllReservationsByUser(username);

            return Ok(reservations);
        }
        catch (Exception e)
        {
            return BadRequest(e.Message);
        }
    }

    [HttpGet]
    [Route("Ratings")]
    public async Task<ActionResult<IEnumerable<Rating>>> GetAllRatingsToUsername([FromQuery] string username)
    {
        try
        {
            var ratings = await userLogic.GetAllRatingsToUser(username);

            return Ok(ratings);
        }
        catch (Exception e)
        {
            return BadRequest(e.Message);
        }
    }

    [HttpPost]
    [Route("hours")]
    public async Task<ActionResult> AssignOpeningHoursAsync(OpeningHoursCreationDto dto)
    {
        try
        {
            var user = await userLogic.AssignOpeningHoursAsync(dto);

            return Ok(user);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);

            throw;
        }
    }

    [HttpGet]
    [Route("hours")]
    public async Task<ActionResult> GetOpeningHoursAsync(string username)
    {
        try
        {
            var openingHours = await userLogic.GetOpeningHoursAsync(username);

            return Ok(openingHours);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);

            throw;
        }
    }

    [HttpPost]
    [Route("login")]
    public async Task<ActionResult> LoginAsync(UserLoginDto dto)
    {
        try
        {
            var user = await userLogic.LoginAsync(dto);
            string token = GenerateJwt(user);

            return Ok(token);
        }
        catch (Exception e)
        {
            return BadRequest(e.Message);
        }
    }

    [HttpPost]
    [Route("register")]
    public async Task<ActionResult> RegisterAsync(UserCreationDto dto)
    {
        try
        {
            var user = await userLogic.RegisterAsync(dto);

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
            new Claim("UserName", user.UserName),
            new Claim("FirstName", user.FirstName),
            new Claim("AddressId", user.Address.AddressId.ToString()),
            new Claim("StreetName", user.Address.Street),
            new Claim("StreetNumber", user.Address.StreetNumber),
            new Claim("PostalCode", user.Address.PostCode.ToString()),
            new Claim("City", user.Address.City),
            new Claim("Longitude", user.Address.Longitude.ToString()),
            new Claim("Latitude", user.Address.Latitude.ToString()),
            new Claim("IsBusiness", user.IsBusiness.ToString())
            //@context.User.Longitude <- This is a string.
        };

        return claims.ToList();
    }

    private string GenerateJwt(User user)
    {
        var claims = GenerateClaims(user);

        var key = new SymmetricSecurityKey(Encoding.UTF8.GetBytes(config["Jwt:Key"]));
        var signIn = new SigningCredentials(key, SecurityAlgorithms.HmacSha512);

        var header = new JwtHeader(signIn);

        var payload = new JwtPayload(
            config["Jwt:Issuer"],
            config["Jwt:Audience"],
            claims,
            null,
            DateTime.UtcNow.AddMinutes(60));

        var token = new JwtSecurityToken(header, payload);

        string serializedToken = new JwtSecurityTokenHandler().WriteToken(token);

        return serializedToken;
    }
}