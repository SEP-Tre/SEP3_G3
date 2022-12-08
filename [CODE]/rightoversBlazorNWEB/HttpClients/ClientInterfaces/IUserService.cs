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
    Task<ClaimsPrincipal> GetAuthAsync();
    Task<OpeningHours> GetOpeningHoursAsync(string username);
    Task<User> AssignOpeningHoursAsync(OpeningHoursCreationDto dto);
    Task<User> ChangeFirstName(UserUpdateFirstNameDto dto);
    Task<User> ChangePassword(UserUpdatePasswordDto dto);
    Task<User> ChangeAddress(UserUpdateAddressDto dto);
    Task DeleteUserAsync(string username);
    Task<IEnumerable<Report>> GetReportsAgainstUserAsync(string username);
}