package sep3.g3.rightoversjava.service;

import sep3.g3.rightoversjava.model.Address;
import sep3.g3.rightoversjava.model.AddressDTO;

import java.util.ArrayList;

public interface AddressService {
    Address create(AddressDTO dto);
    ArrayList<Address> getAllAddresses();
}
