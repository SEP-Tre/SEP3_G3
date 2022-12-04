using Domain.Classes;
using Domain.DTOs;

namespace Application.DAOInterfaces;

public interface IUserDao
{
    Task<User> LoginAsync(UserLoginDto dto);
    Task<User> RegisterAsync(UserCreationDto dto);
    
    public Task<OpeningHours> GetOpeningHoursAsync(string username);
    public Task<User> CreateOpeningHoursAsync(OpeningHoursCreationDto dto);
}