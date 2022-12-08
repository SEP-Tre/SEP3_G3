using Domain.Classes;
using Domain.DTOs;

namespace Application.LogicInterfaces;

public interface IUserLogic
{
    Task<User> LoginAsync(UserLoginDto dto);
    Task<User> RegisterAsync(UserCreationDto dto);
    Task<User> GetByUsername(string username);
    Task<IEnumerable<Reservation>> GetAllReservationsByUser(string username);
    Task<IEnumerable<Rating>> GetAllRatingsToUser(string username);
    Task<OpeningHours> GetOpeningHoursAsync(string username);
    Task<User> AssignOpeningHoursAsync(OpeningHoursCreationDto dto);
    Task<User> ChangeFirstName(UserUpdateFirstNameDto dto);
    Task<User> ChangePassword(UserUpdatePasswordDto dto);
    Task<User> ChangeAddress(UserUpdateAddressDto dto);
    Task DeleteUserAsync(string username);
    Task<IEnumerable<Report>> GetReportsAgainstUserAsync(string username);
}