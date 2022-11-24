using Domain.Classes;
using Domain.DTOs;

namespace Application.LogicInterfaces;

public interface IUserLogic
{
    Task<User> LoginAsync(UserLoginDto dto);
    Task<User> RegisterAsync(UserCreationDto dto);
}