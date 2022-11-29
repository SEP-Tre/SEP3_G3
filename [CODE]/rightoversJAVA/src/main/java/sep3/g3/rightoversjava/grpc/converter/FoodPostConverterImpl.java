package sep3.g3.rightoversjava.grpc.converter;

import org.springframework.stereotype.Service;
import sep3.g3.rightoversjava.grpc.generated.FoodPostResponse;
import sep3.g3.rightoversjava.model.FoodPost;

@Service
public class FoodPostConverterImpl implements FoodPostConverter {
    public FoodPostResponse getFoodPostResponse(FoodPost created) {
        return FoodPostResponse.newBuilder().setFpId(created.getPost_id()).setTitle(created.getTitle()).setCategory(created.getCategory_()).setDescription(created.getDescription()).setPictureUrl(created.getPictureUrl()).setDaysUntilExpired(created.getDaysUntilExpired()).setFpState(created.getPostState()).build();
    }
}
