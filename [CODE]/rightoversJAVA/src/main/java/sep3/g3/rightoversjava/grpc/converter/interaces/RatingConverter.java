package sep3.g3.rightoversjava.grpc.converter.interaces;

import sep3.g3.rightoversjava.grpc.generated.RatingMessage;
import sep3.g3.rightoversjava.grpc.generated.RatingMessageList;
import sep3.g3.rightoversjava.model.Rating;
import sep3.g3.rightoversjava.model.dto.RatingCreationDto;

import java.util.ArrayList;

public interface RatingConverter
{
    RatingCreationDto getRatingDtoFromRatingRequest(RatingMessage ratingMessage);
    RatingMessage getRatingMessageFromRating(Rating rating);
    RatingMessageList getRatingMessageListFromRating(ArrayList<Rating> ratings);
}
