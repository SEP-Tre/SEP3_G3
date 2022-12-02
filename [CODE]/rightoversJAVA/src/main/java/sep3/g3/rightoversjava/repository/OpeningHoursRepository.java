package sep3.g3.rightoversjava.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sep3.g3.rightoversjava.model.OpeningHours;

@Repository
public interface OpeningHoursRepository extends CrudRepository<OpeningHours,Integer> {

}
