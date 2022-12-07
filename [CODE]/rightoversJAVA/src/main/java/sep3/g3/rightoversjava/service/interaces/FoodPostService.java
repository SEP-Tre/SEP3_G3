package sep3.g3.rightoversjava.service.interaces;

import sep3.g3.rightoversjava.model.FoodPost;
import sep3.g3.rightoversjava.model.Report;
import sep3.g3.rightoversjava.model.dto.FoodPostCreationDTO;
import sep3.g3.rightoversjava.model.dto.PickUpDto;
import sep3.g3.rightoversjava.model.dto.ReportCreationDto;
import sep3.g3.rightoversjava.model.dto.ReservationCreationDto;

import java.util.ArrayList;
import java.util.NoSuchElementException;


public interface FoodPostService {

    FoodPost create(FoodPostCreationDTO dto) throws Exception;

    ArrayList<FoodPost> getAllFoodPosts();

    ArrayList<FoodPost> getAllFoodPostsByUsername(String username) throws Exception;

    FoodPost getSingleFoodPost(int id) throws NoSuchElementException;

    // Should this return something? - CF
    // TODO: Add user


    // Should this return something? - CF
    // TODO: Add user
    void reserve(ReservationCreationDto dto);

    FoodPost pickUp(PickUpDto dto) throws IllegalAccessException;

    void delete(int id);

    Report report(ReportCreationDto dto);//report

    ArrayList<FoodPost> getAllReportedPosts();
}
