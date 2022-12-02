package sep3.g3.rightoversjava.service;

import sep3.g3.rightoversjava.model.*;

public interface UserService {
    User registerUser(UserCreationDTO dto);

    User login(UserLoginDTO dto) throws Exception;

    User assignOpeningHours(OpeningHoursCreationDTO dto) throws IllegalAccessException;
}
