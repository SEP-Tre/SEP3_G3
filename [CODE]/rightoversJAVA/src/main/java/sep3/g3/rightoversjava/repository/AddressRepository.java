package sep3.g3.rightoversjava.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sep3.g3.rightoversjava.model.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {
    Address findByLongitudeAndLatitude(double longitude, double latitude);
}
