package sep3.g3.rightoversjava.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sep3.g3.rightoversjava.model.Rating;
import sep3.g3.rightoversjava.model.User;

import java.util.ArrayList;

@Repository
public interface RatingRepository extends CrudRepository<Rating, Integer> {
    ArrayList<Rating> findAllByUserRated(User userRated);

    ArrayList<Rating> findAllByUserRating(User userRated);
}
