package sep3.g3.rightoversjava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sep3.g3.rightoversjava.model.FoodPost;
import sep3.g3.rightoversjava.model.FoodPostCreationDTO;
import sep3.g3.rightoversjava.repository.FoodPostRepository;

@Service
public class FoodPostServiceImp implements FoodPostService {

    @Autowired
    FoodPostRepository fpRepository;

    public FoodPost create(FoodPostCreationDTO dto) {
        FoodPost fpObj = new FoodPost(dto.getTitle(), dto.getCategory_(), dto.getDescription(), dto.getPictureUrl(), dto.getDaysUntilExpired());
        return fpRepository.save(fpObj);
    }
}
