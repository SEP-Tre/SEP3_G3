using Domain.Classes;
using Domain.DTOs;

namespace Application.DAOInterfaces;

public interface IUserDao
{
    Task<User> LoginAsync(UserLoginDto dto);
    Task<User> RegisterAsync(UserCreationDto dto);
    Task<User> GetByUsername(String username);
    Task<IEnumerable<Reservation>> GetAllReservationsByUser(String username);
    Task<IEnumerable<Rating>> GetAllRatingsToUser(String username);

    public Task<OpeningHours> GetOpeningHoursAsync(string username);
    public Task<User> CreateOpeningHoursAsync(OpeningHoursCreationDto dto);
}