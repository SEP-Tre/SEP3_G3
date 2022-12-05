package sep3.g3.rightoversjava.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sep3.g3.rightoversjava.model.FoodPost;
import sep3.g3.rightoversjava.model.User;

import java.util.List;

@Repository
public interface FoodPostRepository extends CrudRepository<FoodPost, Integer> {
    List<FoodPost> getFoodPostsByUser(User user);
}
