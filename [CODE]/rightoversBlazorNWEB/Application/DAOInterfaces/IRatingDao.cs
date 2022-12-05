using Domain.Classes;

namespace Application.DAOInterfaces;

public interface IRatingDao
{
    Task<Rating> AddRating(Rating rating);
    Task<List<Rating>> GetAllByUserRated(string username);
    Task<List<Rating>> GetAllByUserRating(string username);
}