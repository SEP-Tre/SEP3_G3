package sep3.g3.rightoversjava.service;

import sep3.g3.rightoversjava.model.FoodPost;
import sep3.g3.rightoversjava.model.FoodPostCreationDTO;

import java.util.ArrayList;
import java.util.NoSuchElementException;


public interface FoodPostService {

    FoodPost create(FoodPostCreationDTO dto);

    ArrayList<FoodPost> getAllFoodPosts();

    FoodPost getSingleFoodPost(int id) throws NoSuchElementException;
}
