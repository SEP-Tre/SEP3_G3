package sep3.g3.rightoversjava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sep3.g3.rightoversjava.model.FoodPost;
import sep3.g3.rightoversjava.model.FoodPostCreationDTO;
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
}
