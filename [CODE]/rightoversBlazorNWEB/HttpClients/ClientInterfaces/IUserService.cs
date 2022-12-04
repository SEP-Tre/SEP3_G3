using System.Security.Claims;
using Domain.Classes;
using Domain.DTOs;

namespace HttpClients.ClientInterfaces;

public interface IUserService
{
    Task LoginAsync(UserLoginDto dto);
    Task<User> RegisterAsync(UserCreationDto dto);

    Task LogoutAsync();
    public Task<ClaimsPrincipal> GetAuthAsync();

    public Action<ClaimsPrincipal> OnAuthStateChanged { get; set; }

    public Task<OpeningHours> GetOpeningHoursAsync(string username);

    public Task<User> AssignOpeningHoursAsync(OpeningHoursCreationDto dto);
}