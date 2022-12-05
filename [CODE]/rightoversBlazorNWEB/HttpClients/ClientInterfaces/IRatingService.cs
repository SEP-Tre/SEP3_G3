using Domain.Classes;

namespace HttpClients.ClientInterfaces;

public interface IRatingService
{
    Task<Rating> AddRating(Rating rating);
    Task<List<Rating>> GetAllByUserRated(string username);
    Task<List<Rating>> GetAllByUserRating(string username);
}