package sep3.g3.rightoversjava.repository;

import org.springframework.data.repository.CrudRepository;
import sep3.g3.rightoversjava.model.User;

public interface UserRepository extends CrudRepository<User, String> {
}
