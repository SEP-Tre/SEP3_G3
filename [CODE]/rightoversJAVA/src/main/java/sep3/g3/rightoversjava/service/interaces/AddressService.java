package sep3.g3.rightoversjava.service.interaces;

import sep3.g3.rightoversjava.model.Address;
import sep3.g3.rightoversjava.model.dto.AddressCreationDTO;

import java.util.ArrayList;

public interface AddressService {
    Address create(AddressCreationDTO dto);

    ArrayList<Address> getAllAddresses();
}
