package sep3.g3.rightoversjava.service;

import org.springframework.stereotype.Service;
import sep3.g3.rightoversjava.model.*;
import sep3.g3.rightoversjava.repository.FoodPostRepository;
import sep3.g3.rightoversjava.repository.ReservationRepository;
import sep3.g3.rightoversjava.repository.UserRepository;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class FoodPostServiceImp implements FoodPostService
{

    private final FoodPostRepository fpRepository;
    private final UserRepository userRepository;
    private final ReservationRepository reservationRepository;

    public FoodPostServiceImp(FoodPostRepository fpRepository, UserRepository userRepository, ReservationRepository reservationRepository) {
        this.fpRepository = fpRepository;
        this.userRepository = userRepository;
        this.reservationRepository = reservationRepository;
    }

    public FoodPost create(FoodPostCreationDTO dto)
    {
        FoodPost fpObj = new FoodPost(dto.getTitle(), dto.getCategory_(), dto.getDescription(), dto.getPictureUrl(), dto.getDaysUntilExpired());
        return fpRepository.save(fpObj);
    }

    @Override
    public ArrayList<FoodPost> getAllFoodPosts()
    {
        return (ArrayList<FoodPost>) fpRepository.findAll();
    }

    @Override
    public FoodPost getSingleFoodPost(int id) throws NoSuchElementException
    {
        Optional<FoodPost> foodPostOptional = fpRepository.findById(id);
        if (foodPostOptional.isEmpty())
        {
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
        foodPost.setPostState("reserved");
        // Because of the matching id, this should update instead of add a new tuple
        fpRepository.save(foodPost);

        // Save the reservation to the table
        User user = userRepository.findById(dto.getUsername()).get();
        Reservation reservation = new Reservation(foodPost, user);
        reservationRepository.save(reservation);
    }
}
