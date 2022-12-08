package sep3.g3.rightoversjava.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sep3.g3.rightoversjava.model.FoodPost;
import sep3.g3.rightoversjava.model.Reservation;
import sep3.g3.rightoversjava.model.User;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Integer> {
    Iterable<Reservation> findAllByUser(User user);
    Reservation findByFoodPost(FoodPost foodPost);

}
