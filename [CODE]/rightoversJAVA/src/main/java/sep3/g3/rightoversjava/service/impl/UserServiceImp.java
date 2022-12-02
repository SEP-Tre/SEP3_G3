package sep3.g3.rightoversjava.service.impl;

import org.springframework.stereotype.Service;
import sep3.g3.rightoversjava.model.User;
import sep3.g3.rightoversjava.model.dto.UserCreationDTO;
import sep3.g3.rightoversjava.model.dto.UserLoginDTO;
import sep3.g3.rightoversjava.repository.AddressRepository;
import sep3.g3.rightoversjava.repository.UserRepository;
import sep3.g3.rightoversjava.service.interaces.UserService;

import java.util.Optional;

@Service
public class UserServiceImp implements UserService
{

    private UserRepository userRepository;
    private AddressRepository addressRepository;

    public UserServiceImp(UserRepository userRepository, AddressRepository addressRepository) {
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
    }

    @Override
    public User registerUser(UserCreationDTO dto) {
        User user = new User(dto);
        return userRepository.save(user);
    }

    @Override
    public User login(UserLoginDTO dto) throws Exception {
        Optional<User> user = userRepository.findById(dto.getUsername());

        if (user.isEmpty()) {
            throw new Exception("There is no such user.");
        }

        if (!user.get().password.equals(dto.getPassword())) {
            throw new Exception("Password mismatch");
        }

        return user.get();
    }
}
