package sep3.g3.rightoversjava.service.interaces;

import sep3.g3.rightoversjava.model.Rating;
import sep3.g3.rightoversjava.model.dto.RatingCreationDto;

import java.util.ArrayList;

public interface RatingService {
    Rating addRating(RatingCreationDto rating);

    ArrayList<Rating> getAllByUserRated(String username);

    ArrayList<Rating> getAllByUserRating(String username);
}
