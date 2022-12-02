package sep3.g3.rightoversjava.service.impl;

import org.springframework.stereotype.Service;
import sep3.g3.rightoversjava.model.Rating;
import sep3.g3.rightoversjava.model.User;
import sep3.g3.rightoversjava.model.dto.RatingCreationDto;
import sep3.g3.rightoversjava.repository.RatingRepository;
import sep3.g3.rightoversjava.repository.UserRepository;
import sep3.g3.rightoversjava.service.interaces.RatingService;

import java.util.ArrayList;

@Service
public class RatingServiceImp implements RatingService
{
    private RatingRepository ratingRepository;
    private UserRepository userRepository;

    public RatingServiceImp(RatingRepository ratingRepository, UserRepository userRepository)
    {
        this.ratingRepository = ratingRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Rating addRating(RatingCreationDto rating)
    {
        User userRating = userRepository.findById(rating.getUsernameRating()).get();
        User userRated = userRepository.findById(rating.getUsernameRated()).get();

        Rating ratingToBeSaved = new Rating
                (rating.getValue(), rating.getComment(),
                        rating.getRatingType(), userRating, userRated );
        Rating savedRating = ratingRepository.save(ratingToBeSaved);
        return savedRating;
    }

    @Override
    public ArrayList<Rating> getAllByUserRated(String username)
    {
        User user = userRepository.findById(username).get();
        ArrayList<Rating> ratings = ratingRepository.findAllByUserRated(user);
        return ratings;
    }

    @Override
    public ArrayList<Rating> getAllByUserRating(String username)
    {
        User user = userRepository.findById(username).get();
        ArrayList<Rating> ratings = ratingRepository.findAllByUserRating(user);
        return ratings;
    }
}
