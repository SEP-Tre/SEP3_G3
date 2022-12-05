using Domain.Classes;
using Domain.DTOs;

namespace Application.LogicInterfaces;

public interface IUserLogic
{
    Task<User> LoginAsync(UserLoginDto dto);
    Task<User> RegisterAsync(UserCreationDto dto);
    Task<User> GetByUsername(String username);
    Task<IEnumerable<Reservation>> GetAllReservationsByUser(String username);
    Task<IEnumerable<Rating>> GetAllRatingsToUser(String username);
    Task<OpeningHours> GetOpeningHoursAsync(string username);
    Task<User> AssignOpeningHoursAsync(OpeningHoursCreationDto dto);
}