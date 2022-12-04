using Domain.Classes;
using Domain.DTOs;

namespace Application.LogicInterfaces;

public interface IUserLogic
{
    Task<User> LoginAsync(UserLoginDto dto);
    Task<User> RegisterAsync(UserCreationDto dto);
    Task<OpeningHours> GetOpeningHoursAsync(string username);
    Task<User> AssignOpeningHoursAsync(OpeningHoursCreationDto dto);
}