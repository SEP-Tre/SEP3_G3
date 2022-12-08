package sep3.g3.rightoversjava.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sep3.g3.rightoversjava.model.OpeningHours;
import sep3.g3.rightoversjava.model.User;

@Repository
public interface OpeningHoursRepository extends CrudRepository<OpeningHours, Integer> {
    OpeningHours findByUser(User user);

    OpeningHours getOpeningHoursByUser(User user);
}
