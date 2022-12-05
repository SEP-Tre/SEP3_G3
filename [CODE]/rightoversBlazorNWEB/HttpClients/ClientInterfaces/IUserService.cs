using System.Security.Claims;
using Domain.Classes;
using Domain.DTOs;

namespace HttpClients.ClientInterfaces;

public interface IUserService
{

    public Action<ClaimsPrincipal> OnAuthStateChanged { get; set; }
    Task LoginAsync(UserLoginDto dto);
    Task<User> RegisterAsync(UserCreationDto dto);

    Task LogoutAsync();
    Task<User> GetUserByUsername(string username);
    Task<IEnumerable<Reservation>> GetAllReservationsByUser(string username);
    Task<IEnumerable<Rating>> GetAllRatingsToUser(string username);
    public Task<ClaimsPrincipal> GetAuthAsync();

    public Task<OpeningHours> GetOpeningHoursAsync(string username);

    public Task<User> AssignOpeningHoursAsync(OpeningHoursCreationDto dto);
}