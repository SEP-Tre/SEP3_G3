using Domain.Classes;
using GrpcCL;
using GrpcClient.IConverters;

namespace GrpcClient.Converters;

public class RatingConverter : IRatingConverter
{
    public RatingMessage getRatingRequestFromRating(Rating rating)
    {
        var ratingMessage = new RatingMessage{
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
        var rating = new Rating(
            ratingMessage.UsernameRating,
            ratingMessage.UsernameRated,
            ratingMessage.Value,
            ratingMessage.Comment,
            ratingMessage.RatingType);

        return rating;
    }

    public List<Rating> getRatingsFromRatingsMessageList(RatingMessageList ratingMessageList)
    {
        var ratings = new List<Rating>();
        foreach (var ratingMessage in ratingMessageList.Ratings) ratings.Add(getRatingFromRatingRequest(ratingMessage));

        return ratings;
    }
}