package sep3.g3.rightoversjava.service.interaces;

import sep3.g3.rightoversjava.model.dto.*;
import sep3.g3.rightoversjava.model.Reservation;
import sep3.g3.rightoversjava.model.User;

import java.util.ArrayList;

public interface UserService {
    User registerUser(UserCreationDTO dto);

    User login(UserLoginDTO dto) throws Exception;

    User getByUsername(String username) throws Exception;

    ArrayList<Reservation> getReservationsByUsername(String username);

    User assignOpeningHours(OpeningHoursCreationDTO dto) throws IllegalAccessException;

    User changeFirstName(UserUpdateFirstNameDto dto) throws Exception;
    User changePassword(UserUpdatePasswordDto dto) throws Exception;
    User changeAddress(UserUpdateAddressDto dto) throws Exception;
}
