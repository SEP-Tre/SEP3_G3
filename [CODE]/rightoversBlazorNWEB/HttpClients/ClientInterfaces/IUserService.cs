using System.Security.Claims;
using Domain.Classes;
using Domain.DTOs;

namespace HttpClients.ClientInterfaces;

public interface IUserService
{
    Task LoginAsync(UserLoginDto dto);
    Task<User> RegisterAsync(UserCreationDto dto);

    Task LogoutAsync();
    Task<User> GetUserByUsername(String username);
    Task<IEnumerable<Reservation>> GetAllReservationsByUser(String username);
    Task<IEnumerable<Rating>> GetAllRatingsToUser(String username);
    public Task<ClaimsPrincipal> GetAuthAsync();

    public Action<ClaimsPrincipal> OnAuthStateChanged { get; set; }
}