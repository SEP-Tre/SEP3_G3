using Domain.Classes;
using GrpcCL;
using GrpcClient.IConverters;

namespace GrpcClient.Converters;

public class RatingConverter : IRatingConverter
{
    public RatingMessage getRatingRequestFromRating(Rating rating)
    {
        RatingMessage ratingMessage = new RatingMessage
        {
            Value = rating.Value,
            Comment = rating.Comment,
            RatingType = rating.TypeOfRating,
            UsernameRated = rating.UsernameBeingRated,
            UsernameRating = rating.UsernameMakingRating
        };
        return ratingMessage;
    }

    public Rating getRatingFromRatingRequest(RatingMessage ratingMessage)
    {
        Rating rating = new Rating(
            ratingMessage.UsernameRating,
            ratingMessage.UsernameRated,
            ratingMessage.Value,
            ratingMessage.Comment,
            ratingMessage.RatingType);
        return rating;
    }

    public List<Rating> getRatingsFromRatingsMessageList(RatingMessageList ratingMessageList)
    {
        List<Rating> ratings = new List<Rating>();
        foreach (RatingMessage ratingMessage in ratingMessageList.Ratings)
        {
            ratings.Add(getRatingFromRatingRequest(ratingMessage));
        }

        return ratings;
    }
}