package sep3.g3.rightoversjava.grpc.converter;

import org.springframework.stereotype.Service;
import sep3.g3.rightoversjava.grpc.converter.interaces.RatingConverter;
import sep3.g3.rightoversjava.grpc.generated.RatingMessage;
import sep3.g3.rightoversjava.grpc.generated.RatingMessageList;
import sep3.g3.rightoversjava.model.Rating;
import sep3.g3.rightoversjava.model.dto.RatingCreationDto;

import java.util.ArrayList;

@Service
public class RatingConverterImpl implements RatingConverter
{
    @Override
    public RatingCreationDto getRatingDtoFromRatingRequest(RatingMessage ratingMessage)
    {
        RatingCreationDto rating = new RatingCreationDto(
                ratingMessage.getValue(),
                ratingMessage.getComment(),
                ratingMessage.getRatingType(),
                ratingMessage.getUsernameRating(),
                ratingMessage.getUsernameRated()
        );
        return rating;
    }

    @Override
    public RatingMessage getRatingMessageFromRating(Rating rating)
    {
        RatingMessage ratingMessage = RatingMessage.newBuilder()
                .setValue(rating.getValue())
                .setComment(rating.getComment())
                .setRatingType(rating.getRatingType())
                .setUsernameRating(rating.getUserRating().getUsername())
                .setUsernameRated(rating.getUserRated().getUsername()).build();
        return ratingMessage;

    }

    @Override
    public RatingMessageList getRatingMessageListFromRating(ArrayList<Rating> ratings)
    {
        ArrayList<RatingMessage> ratingMessages = new ArrayList<>();
        ratings.forEach(rating -> {
            ratingMessages.add(getRatingMessageFromRating(rating));
        });
        RatingMessageList list = RatingMessageList.newBuilder().addAllRatings(ratingMessages).build();
        return list;
    }
}
