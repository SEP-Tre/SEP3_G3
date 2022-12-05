using Domain.Classes;

namespace Application.LogicInterfaces;

public interface IRatingLogic
{
    Task<Rating> AddRating(Rating rating);
    Task<List<Rating>> GetAllByUserRated(string username);
    Task<List<Rating>> GetAllByUserRating(string username);
}