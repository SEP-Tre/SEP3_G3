using Domain.Classes;
using GrpcCL;

namespace GrpcClient.IConverters;

public interface IRatingConverter
{
    RatingMessage getRatingRequestFromRating(Rating rating);
    Rating getRatingFromRatingRequest(RatingMessage ratingMessage);
    List<Rating> getRatingsFromRatingsMessageList(RatingMessageList ratingMessageList);
}