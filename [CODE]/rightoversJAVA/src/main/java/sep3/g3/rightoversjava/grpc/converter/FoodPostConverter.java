package sep3.g3.rightoversjava.grpc.converter;

import sep3.g3.rightoversjava.grpc.generated.FoodPostResponse;
import sep3.g3.rightoversjava.model.FoodPost;


public interface FoodPostConverter {
    FoodPostResponse getFoodPostResponse(FoodPost created);
}
