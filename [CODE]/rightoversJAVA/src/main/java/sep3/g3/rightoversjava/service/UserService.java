package sep3.g3.rightoversjava.service;

import sep3.g3.rightoversjava.model.*;

import java.util.ArrayList;
import sep3.g3.rightoversjava.model.*;

public interface UserService {
    User registerUser(UserCreationDTO dto);

    User login(UserLoginDTO dto) throws Exception;
    User getByUsername(String username) throws Exception;
    ArrayList<Reservation> getReservationsByUsername(String username);

    User assignOpeningHours(OpeningHoursCreationDTO dto) throws IllegalAccessException;
}
