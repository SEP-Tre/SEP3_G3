package sep3.g3.rightoversjava.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sep3.g3.rightoversjava.model.FoodPost;

@Repository
public interface FoodPostRepository extends CrudRepository<FoodPost, Integer> {
}
