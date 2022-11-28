package sep3.g3.rightoversjava.service;

import org.springframework.stereotype.Service;
import sep3.g3.rightoversjava.model.FoodPost;
import sep3.g3.rightoversjava.model.FoodPostCreationDTO;
import sep3.g3.rightoversjava.model.FoodPostReservationDto;
import sep3.g3.rightoversjava.repository.FoodPostRepository;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class FoodPostServiceImp implements FoodPostService
{

    private final FoodPostRepository fpRepository;

    public FoodPostServiceImp(FoodPostRepository fpRepository)
    {
        this.fpRepository = fpRepository;
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
    public void reserve(FoodPostReservationDto dto) {
        // Simplify with custom query
        // TODO: save the user in the join table
        FoodPost selected = fpRepository.findById(dto.getFoodPostId()).get();
        selected.setPostState("reserved");
        fpRepository.save(selected);
    }
}
