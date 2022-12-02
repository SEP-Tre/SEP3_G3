using Domain.Classes;
using Domain.DTOs;

namespace Application.DAOInterfaces;

public interface IRatingDao
{
    Task<Rating> addRating(Rating rating);
    Task<List<Rating>> getAllByUserRated(string username);
    Task<List<Rating>> getAllByUserRating(string username);
    
}