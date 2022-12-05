package sep3.g3.rightoversjava.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sep3.g3.rightoversjava.model.Address;
import sep3.g3.rightoversjava.model.dto.AddressCreationDTO;
import sep3.g3.rightoversjava.repository.AddressRepository;
import sep3.g3.rightoversjava.service.interaces.AddressService;

import java.util.ArrayList;

@Service
public class AddressServiceImp implements AddressService {
    @Autowired
    AddressRepository addressRepository;
    @Override
    public Address create(AddressCreationDTO dto) {
        return addressRepository.save(new Address(dto));
    }
    @Override
    public ArrayList<Address> getAllAddresses() {
        return (ArrayList<Address>) addressRepository.findAll();
    }
}
