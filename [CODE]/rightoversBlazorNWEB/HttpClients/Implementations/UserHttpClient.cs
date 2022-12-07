using System.Net.Http.Json;
using System.Security.Claims;
using System.Text.Json;
using Domain.Classes;
using Domain.DTOs;
using HttpClients.ClientInterfaces;

namespace HttpClients.Implementations;

public class UserHttpClient : IUserService
{
    private readonly IAddressService addressService;
    private readonly HttpClient client;

    public UserHttpClient(HttpClient client, IAddressService addressService)
    {
        this.client = client;
        this.addressService = addressService;
    }


    private static string? Jwt { get; set; } = "";
    public Action<ClaimsPrincipal> OnAuthStateChanged { get; set; }

    public async Task LoginAsync(UserLoginDto dto)
    {
        var response = await client.PostAsJsonAsync("/Users/login", dto);
        string content = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }


        string token = content;
        Jwt = token;
        Console.WriteLine(Jwt);
        var principal = CreateClaimsPrincipal();

        OnAuthStateChanged.Invoke(principal);
    }

    public async Task<User> AssignOpeningHoursAsync(OpeningHoursCreationDto dto)
    {
        var response = await client.PostAsJsonAsync("/Users/hour", dto);
        string content = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        var user = JsonSerializer.Deserialize<User>(content, new JsonSerializerOptions{
            PropertyNameCaseInsensitive = true
        })!;

        return user;
    }

    public async Task<User> RegisterAsync(UserCreationDto dto)
    {
        var addressToBeCreated = dto.AddressCreationDto;
        var createdAddress = await addressService.CreateAsync(addressToBeCreated);

        dto.AddressCreationDto = createdAddress;
        var response = await client.PostAsJsonAsync("/Users/register", dto);
        string content = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        var user =
            JsonSerializer.Deserialize<User>(content, new JsonSerializerOptions{
                PropertyNameCaseInsensitive = true
            })!;

        return user;
    }

    public Task LogoutAsync()
    {
        Jwt = null;
        ClaimsPrincipal principal = new ClaimsPrincipal();
        OnAuthStateChanged.Invoke(principal);

        return Task.CompletedTask;
    }

    public async Task<User> GetUserByUsername(string username)
    {
        var response = await client.GetAsync($"/Users?username={username}");
        string content = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        var user =
            JsonSerializer.Deserialize<User>(content, new JsonSerializerOptions{
                PropertyNameCaseInsensitive = true
            })!;

        return user;
    }

    public async Task<OpeningHours> GetOpeningHoursAsync(string username)
    {
        var response = await client.GetAsync($"/Users/OpeningHours?username={username}");
        string content = await response.Content.ReadAsStringAsync();

        Console.WriteLine("GET OPENING HOURS USERHTTPCLIENT");
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        Console.WriteLine("USERHTTPCLIENT IS TRYING TO CREATE THE OPENING HOURS OBJECT");
        var openingHours = JsonSerializer.Deserialize<OpeningHours>(content, new JsonSerializerOptions{
            PropertyNameCaseInsensitive = true
        })!;
    
        Console.WriteLine("USERHTTPCLIENT IS RETURNING THE OPENINGHRS OBJECT "+openingHours.MondayOpeningHours.Hour+":"+openingHours.MondayOpeningHours.Minutes);
        return openingHours;
    }

    public async Task<IEnumerable<Reservation>> GetAllReservationsByUser(string username)
    {
        
        var response = await client.GetAsync($"/Users/Reservations?username={username}");
        string content = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        var reservations =
            JsonSerializer.Deserialize<IEnumerable<Reservation>>(content, new JsonSerializerOptions{
                PropertyNameCaseInsensitive = true
            })!;

        return reservations;
    }

    public Task<IEnumerable<Rating>> GetAllRatingsToUser(string username)
    {
        throw new NotImplementedException();
    }

    public Task<ClaimsPrincipal> GetAuthAsync()
    {
        var principal = CreateClaimsPrincipal();

        return Task.FromResult(principal);
    }


    // Below methods stolen from https://github.com/SteveSandersonMS/presentation-2019-06-NDCOslo/blob/master/demos/MissionControl/MissionControl.Client/Util/ServiceExtensions.cs
    private static IEnumerable<Claim> ParseClaimsFromJwt(string jwt)
    {
        string payload = jwt.Split('.')[1];
        byte[] jsonBytes = ParseBase64WithoutPadding(payload);
        var keyValuePairs = JsonSerializer.Deserialize<Dictionary<string, object>>(jsonBytes);

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

        var claims = ParseClaimsFromJwt(Jwt);

        ClaimsIdentity identity = new ClaimsIdentity(claims, "jwt");

        ClaimsPrincipal principal = new ClaimsPrincipal(identity);

        return principal;
    }
}