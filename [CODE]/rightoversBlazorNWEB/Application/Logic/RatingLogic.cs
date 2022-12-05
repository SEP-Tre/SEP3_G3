using Application.DAOInterfaces;
using Application.LogicInterfaces;
using Domain.Classes;

namespace Application.Logic;

public class RatingLogic : IRatingLogic
{
    private readonly IRatingDao ratingDao;

    public RatingLogic(IRatingDao ratingDao)
    {
        this.ratingDao = ratingDao;
    }

    public async Task<Rating> AddRating(Rating rating)
    {
        var savedRating = await ratingDao.AddRating(rating);

        return savedRating;
    }

    public async Task<List<Rating>> GetAllByUserRated(string username)
    {
        var ratings = await ratingDao.GetAllByUserRated(username);

        return ratings;
    }

    public async Task<List<Rating>> GetAllByUserRating(string username)
    {
        var ratings = await ratingDao.GetAllByUserRating(username);

        return ratings;
    }
}