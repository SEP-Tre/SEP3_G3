package sep3.g3.rightoversjava.service.interaces;

import sep3.g3.rightoversjava.model.OpeningHours;
import sep3.g3.rightoversjava.model.dto.OpeningHoursCreationDTO;
import sep3.g3.rightoversjava.model.Reservation;
import sep3.g3.rightoversjava.model.User;
import sep3.g3.rightoversjava.model.dto.UserCreationDTO;
import sep3.g3.rightoversjava.model.dto.UserLoginDTO;

import java.util.ArrayList;

public interface UserService {
    User registerUser(UserCreationDTO dto);

    User login(UserLoginDTO dto) throws Exception;

    User getByUsername(String username) throws Exception;

    ArrayList<Reservation> getReservationsByUsername(String username);

    User assignOpeningHours(OpeningHoursCreationDTO dto) throws IllegalAccessException;

    OpeningHours getOpeningHours(String username);
}
