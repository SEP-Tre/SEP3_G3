package sep3.g3.rightoversjava.service.impl;

import org.springframework.stereotype.Service;
import sep3.g3.rightoversjava.model.FoodPost;
import sep3.g3.rightoversjava.model.Reservation;
import sep3.g3.rightoversjava.model.User;
import sep3.g3.rightoversjava.model.dto.FoodPostCreationDTO;
import sep3.g3.rightoversjava.model.dto.ReservationCreationDto;
import sep3.g3.rightoversjava.repository.FoodPostRepository;
import sep3.g3.rightoversjava.repository.ReservationRepository;
import sep3.g3.rightoversjava.repository.UserRepository;
import sep3.g3.rightoversjava.service.interaces.FoodPostService;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class FoodPostServiceImp implements FoodPostService {

    private final FoodPostRepository fpRepository;
    private final UserRepository userRepository;
    private final ReservationRepository reservationRepository;

    public FoodPostServiceImp(FoodPostRepository fpRepository, UserRepository userRepository, ReservationRepository reservationRepository) {
        this.fpRepository = fpRepository;
        this.userRepository = userRepository;
        this.reservationRepository = reservationRepository;
    }

    public FoodPost create(FoodPostCreationDTO dto) throws Exception {
        Optional<User> desiredUser = userRepository.findById(dto.getUsername());
        if (desiredUser.isEmpty()) {
            throw new Exception("This user does not exist.");
        }
        User user = desiredUser.get();
        Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now());

        FoodPost fpObj = new FoodPost(
                0, //placeholder hopefully?
                dto.getTitle(),
                dto.getCategory_(),
                dto.getDescription(),
                dto.getPictureUrl(),
                dto.getDaysUntilExpired(),
                "posted",
                timestamp,
                dto.getStartDate(),
                dto.getEndDate(),
                dto.getStartTime(),
                dto.getEndTime(),
                user
        );
        return fpRepository.save(fpObj);
    }

    @Override
    public ArrayList<FoodPost> getAllFoodPosts() {
        return (ArrayList<FoodPost>) fpRepository.findAll();
    }

    @Override
    public ArrayList<FoodPost> getAllFoodPostsByUsername(String username) throws Exception {
        Optional<User> existingUser = userRepository.findById(username);
        if (existingUser == null) {
            throw new Exception("User not found.");
        }
        return new ArrayList<>(fpRepository.getFoodPostsByUser(existingUser.get()));
    }

    @Override
    public FoodPost getSingleFoodPost(int id) throws NoSuchElementException {
        Optional<FoodPost> foodPostOptional = fpRepository.findById(id);
        if (foodPostOptional.isEmpty()) {
            throw new NoSuchElementException("Food post with such ID does not exist.");
        }
        return foodPostOptional.get();
    }

    // Should this return something? - CF
    // TODO: Add user
    @Override
    public void reserve(ReservationCreationDto dto) {
        // Change the state of the post
        FoodPost foodPost = fpRepository.findById(dto.getFoodPostId()).get();
        if (!foodPost.getPostState().equals("posted")) {
            throw new IllegalArgumentException("This post is not available to reserve");
        }

        // Save the reservation to the table
        User user = userRepository.findById(dto.getUsername()).get();
        if (user.isBusiness())
        {
            throw new IllegalArgumentException("As a business, you cannot reserve food. " +
                    "Please use a personal account");
        }
        foodPost.setPostState("reserved");
        // Because of the matching id, this should update instead of add a new tuple
        fpRepository.save(foodPost);
        Reservation reservation = new Reservation(foodPost, user);
        reservationRepository.save(reservation);
    }
}
