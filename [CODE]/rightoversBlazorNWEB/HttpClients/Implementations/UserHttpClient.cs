using System.Net.Http.Json;
using System.Security.Claims;
using System.Text.Json;
using Domain.Classes;
using Domain.DTOs;
using HttpClients.ClientInterfaces;

namespace HttpClients.Implementations;

public class UserHttpClient : IUserService
{
    private readonly HttpClient client;
    private readonly IAddressService addressService;
    public Action<ClaimsPrincipal> OnAuthStateChanged { get; set; }
    private static string? Jwt { get; set; } = "";

    public UserHttpClient(HttpClient client, IAddressService addressService)
    {
        this.client = client;
        this.addressService = addressService;
    }

    public async Task LoginAsync(UserLoginDto dto)
    {
        var response = await client.PostAsJsonAsync("/Users/login", dto);
        var content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode) throw new Exception(content);


        string token = content;
        Jwt = token;
        Console.WriteLine(Jwt);
        ClaimsPrincipal principal = CreateClaimsPrincipal();

        OnAuthStateChanged.Invoke(principal);
    }

    public async Task<User> RegisterAsync(UserCreationDto dto)
    {
        AddressCreationDto addressToBeCreated = dto.AddressCreationDto;
        AddressCreationDto createdAddress = await addressService.CreateAsync(addressToBeCreated);

        dto.AddressCreationDto = createdAddress;
        var response = await client.PostAsJsonAsync("/Users/register", dto);
        var content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode) throw new Exception(content);
        User user =
            JsonSerializer.Deserialize<User>(content, new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            })!;
        return user;
    }

    public Task LogoutAsync()
    {
        Jwt = null;
        ClaimsPrincipal principal = new();
        OnAuthStateChanged.Invoke(principal);
        return Task.CompletedTask;
    }

    public Task<ClaimsPrincipal> GetAuthAsync()
    {
        ClaimsPrincipal principal = CreateClaimsPrincipal();
        return Task.FromResult(principal);
    }


    // Below methods stolen from https://github.com/SteveSandersonMS/presentation-2019-06-NDCOslo/blob/master/demos/MissionControl/MissionControl.Client/Util/ServiceExtensions.cs
    private static IEnumerable<Claim> ParseClaimsFromJwt(string jwt)
    {
        string payload = jwt.Split('.')[1];
        byte[] jsonBytes = ParseBase64WithoutPadding(payload);
        Dictionary<string, object>? keyValuePairs = JsonSerializer.Deserialize<Dictionary<string, object>>(jsonBytes);
        return keyValuePairs!.Select(kvp => new Claim(kvp.Key, kvp.Value.ToString()!));
    }

    private static byte[] ParseBase64WithoutPadding(string base64)
    {
        switch (base64.Length % 4)
        {
            case 2:
                base64 += "==";
                break;
            case 3:
                base64 += "=";
                break;
        }

        return Convert.FromBase64String(base64);
    }

    private static ClaimsPrincipal CreateClaimsPrincipal()
    {
        if (string.IsNullOrEmpty(Jwt))
        {
            return new ClaimsPrincipal();
        }

        IEnumerable<Claim> claims = ParseClaimsFromJwt(Jwt);

        ClaimsIdentity identity = new(claims, "jwt");

        ClaimsPrincipal principal = new(identity);
        return principal;
    }
}