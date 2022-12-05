package sep3.g3.rightoversjava.service;

import org.springframework.stereotype.Service;
import sep3.g3.rightoversjava.model.*;
import sep3.g3.rightoversjava.repository.AddressRepository;
import sep3.g3.rightoversjava.repository.FoodPostRepository;
import sep3.g3.rightoversjava.repository.ReservationRepository;
import sep3.g3.rightoversjava.repository.OpeningHoursRepository;
import sep3.g3.rightoversjava.repository.UserRepository;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    private UserRepository userRepository;
    private AddressRepository addressRepository;
    private FoodPostRepository foodPostRepository;
    private ReservationRepository reservationRepository;

    private OpeningHoursRepository openingHoursRepository;

    public UserServiceImp(UserRepository userRepository, AddressRepository addressRepository,
                          FoodPostRepository foodPostRepository, OpeningHoursRepository openingHoursRepository,
                ReservationRepository reservationRepository) {
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
        this.foodPostRepository = foodPostRepository;
        this.reservationRepository = reservationRepository;
        this.openingHoursRepository=openingHoursRepository;
    }

    @Override
    public User registerUser(UserCreationDTO dto) {
        User user = new User(dto);
        user.setBusiness(dto.isBusiness());
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

    @Override
    public User assignOpeningHours(OpeningHoursCreationDTO dto) throws IllegalAccessException {
        Optional<User> user=userRepository.findById(dto.username);
        if (user.get().isBusiness()){
            System.out.println("IS IT A BUSINESS???? "+user.get().isBusiness);
            OpeningHours openingHours=new OpeningHours(dto,user.get());
            openingHoursRepository.save(openingHours);
            return user.get();
        }
        else throw new IllegalAccessException("Only businesses may have opening hours.");

    }



    @Override
    public User getByUsername(String username) throws Exception {
        Optional<User> existingUser = userRepository.findById(username);
        if (existingUser.isEmpty()) {
            throw new Exception("User not found.");
        }
        User user = existingUser.get();
        return user;
    }

    @Override
    public ArrayList<Reservation> getReservationsByUsername(String username) {
        User user = userRepository.findById(username).get();
        ArrayList<Reservation> reservations = (ArrayList<Reservation>) reservationRepository.findAllByUser(user);
        return reservations;
    }


}
