package sep3.g3.rightoversjava.service.interaces;

import sep3.g3.rightoversjava.model.FoodPost;
import sep3.g3.rightoversjava.model.dto.FoodPostCreationDTO;
import sep3.g3.rightoversjava.model.dto.ReservationCreationDto;

import java.util.ArrayList;
import java.util.NoSuchElementException;


public interface FoodPostService {

    FoodPost create(FoodPostCreationDTO dto) throws Exception;

    ArrayList<FoodPost> getAllFoodPosts();

    FoodPost getSingleFoodPost(int id) throws NoSuchElementException;

    // Should this return something? - CF
    // TODO: Add user


    // Should this return something? - CF
    // TODO: Add user
    void reserve(ReservationCreationDto dto);
}
