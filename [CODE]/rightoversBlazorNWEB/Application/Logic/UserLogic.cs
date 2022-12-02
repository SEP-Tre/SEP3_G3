using System.Collections;
using Application.DAOInterfaces;
using Application.LogicInterfaces;
using Domain.Classes;
using Domain.DTOs;

namespace Application.Logic;

public class UserLogic : IUserLogic
{
    private readonly IUserDao userDao;

    public UserLogic(IUserDao userDao)
    {
        this.userDao = userDao;
    }

    public async Task<User> LoginAsync(UserLoginDto dto)
    {
        User user = await userDao.LoginAsync(dto);

        return user;
    }

    public async Task<User> RegisterAsync(UserCreationDto dto)
    {
        ValidateRegister(dto);
        User user = await userDao.RegisterAsync(dto);

        return user;
    }

    public Task<User> GetByUsername(string username)
    {
        return userDao.GetByUsername(username);
    }

    public Task<IEnumerable<Reservation>> GetAllReservationsByUser(string username)
    {
        return userDao.GetAllReservationsByUser(username);
    }

    public Task<IEnumerable<Rating>> GetAllRatingsToUser(string username)
    {
        return userDao.GetAllRatingsToUser(username);
    }


    private void ValidateRegister(UserCreationDto dto)
    {
        if (dto.Password.ToLower().Contains(dto.UserName.ToLower()) ||
            dto.Password.ToLower().Contains(dto.FirstName.ToLower()))
        {
            throw new Exception("Password cannot contain username or first name.");
        }

        if (dto.Password.Length < 6)
        {
            throw new Exception("Password has to contain more than six characters.");
        }
    }
}