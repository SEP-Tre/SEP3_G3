package sep3.g3.rightoversjava.service;

import sep3.g3.rightoversjava.model.User;
import sep3.g3.rightoversjava.model.UserCreationDTO;
import sep3.g3.rightoversjava.model.UserLoginDTO;

public interface UserService {
    User registerUser(UserCreationDTO dto);

    User login(UserLoginDTO dto) throws Exception;
}
