using Application.DAOInterfaces;
using Application.LogicInterfaces;
using Domain.Classes;

namespace Application.Logic;

public class RatingLogic:IRatingLogic
{
    private readonly IRatingDao ratingDao;

    public RatingLogic(IRatingDao ratingDao)
    {
        this.ratingDao = ratingDao;
    }
    
    public async Task<Rating> AddRating(Rating rating)
    {
        Rating savedRating = await ratingDao.AddRating(rating);
        return savedRating;
    }

    public  async Task<List<Rating>> GetAllByUserRated(string username)
    {
        List<Rating> ratings = await ratingDao.GetAllByUserRated(username);
        return ratings;
    }

    public async Task<List<Rating>> GetAllByUserRating(string username)
    {
        List<Rating> ratings = await ratingDao.GetAllByUserRated(username);
        return ratings;
    }
}