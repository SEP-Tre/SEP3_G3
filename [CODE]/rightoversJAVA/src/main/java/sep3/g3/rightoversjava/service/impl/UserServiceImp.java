package sep3.g3.rightoversjava.service.impl;

import com.sun.xml.bind.v2.runtime.unmarshaller.IntArrayData;
import org.springframework.stereotype.Service;
import sep3.g3.rightoversjava.model.Address;
import sep3.g3.rightoversjava.model.OpeningHours;
import sep3.g3.rightoversjava.model.dto.*;
import sep3.g3.rightoversjava.model.Reservation;
import sep3.g3.rightoversjava.model.User;
import sep3.g3.rightoversjava.model.*;
import sep3.g3.rightoversjava.model.dto.OpeningHoursCreationDTO;
import sep3.g3.rightoversjava.model.dto.UserCreationDTO;
import sep3.g3.rightoversjava.model.dto.UserLoginDTO;
import sep3.g3.rightoversjava.repository.*;
import sep3.g3.rightoversjava.service.interaces.UserService;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;
    private final AddressRepository addressRepository;
    private final FoodPostRepository foodPostRepository;
    private final ReservationRepository reservationRepository;
    private final RatingRepository ratingRepository;

    private final OpeningHoursRepository openingHoursRepository;
    private final ReportRepository reportRepository;

    public UserServiceImp(UserRepository userRepository, AddressRepository addressRepository,
                          FoodPostRepository foodPostRepository, OpeningHoursRepository openingHoursRepository,
                          ReservationRepository reservationRepository, ReportRepository reportRepository, RatingRepository ratingRepository) {
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
        this.foodPostRepository = foodPostRepository;
        this.reservationRepository = reservationRepository;
        this.openingHoursRepository = openingHoursRepository;
        this.reportRepository = reportRepository;
        this.ratingRepository = ratingRepository;
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
        Optional<User> user = userRepository.findById(dto.username);
        if (user.get().isBusiness()) {
            OpeningHours openingHours = new OpeningHours(dto, user.get());
            openingHoursRepository.save(openingHours);
            return user.get();
        } else throw new IllegalAccessException("Only businesses may have opening hours.");

    }

    @Override
    public User changeFirstName(UserUpdateFirstNameDto dto) throws Exception {
        User user = getByUsername(dto.getUsername());
        user.setFirstName(dto.getNewFirstName());
        return userRepository.save(user);
    }

    @Override
    public User changePassword(UserUpdatePasswordDto dto) throws Exception {
        User user = getByUsername(dto.getUsername());

        if (!dto.getOldPassword().equals(user.password)) {
            throw new IllegalArgumentException("Wrong old password.");
        }

        user.setPassword(dto.getNewPassword());
        return userRepository.save(user);
    }

    @Override
    public User changeAddress(UserUpdateAddressDto dto) throws Exception {
       User user = getByUsername(dto.getUsername());

        Address newAddress = new Address(user.address.getAddressId(), dto.getNewStreetNumber(), dto.getNewStreetName(), dto.getNewCity(), dto.getNewPostalCode());
        user.setAddress(newAddress);
        return userRepository.save(user);
    }


    @Override
    public void deleteUser(String username) {
        // For cascade
        /*
        if (userRepository.existsById(username))
        {
            userRepository.deleteById(username);
        }
        else
        {
            throw new IllegalArgumentException("That user does not exist!");
        }

         */

        // Workaround
        Optional<User> user = userRepository.findById(username);
        if (user.isPresent())
        {
            ArrayList<Report> reports = reportRepository.findAllByUserReporting(user.get());
            if (reports.size() > 0)
            {
                reportRepository.deleteAll(reports);
            }
            ArrayList<Reservation> reservations = (ArrayList<Reservation>) reservationRepository.findAllByUser(user.get());
            if (reservations.size() > 0)
            {
                reservationRepository.deleteAll(reservations);
            }
            ArrayList<Rating> ratings = ratingRepository.findAllByUserRated(user.get());
            ratings.addAll(ratingRepository.findAllByUserRating(user.get()));
            if (ratings.size() > 0)
            {
                ratingRepository.deleteAll(ratings);
            }
            OpeningHours openingHours = openingHoursRepository.findByUser(user.get());
            if (openingHours != null)
            {
                openingHoursRepository.delete(openingHours);
            }
            ArrayList<FoodPost> foodPosts = (ArrayList<FoodPost>) foodPostRepository.getFoodPostsByUser(user.get());
            if (foodPosts.size() > 0)
            {
                foodPostRepository.deleteAll(foodPosts);
            }
            userRepository.deleteById(username);
        }
    }

    @Override
    public ArrayList<Report> getAllReportsAgainstUser(String username) {
        return reportRepository.findAllByFoodPost_User_Username(username);
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

    @Override
    public OpeningHours getOpeningHours(String username){
        Optional<User> user=userRepository.findById(username);

        return openingHoursRepository.getOpeningHoursByUser(user.get());
    }


}
