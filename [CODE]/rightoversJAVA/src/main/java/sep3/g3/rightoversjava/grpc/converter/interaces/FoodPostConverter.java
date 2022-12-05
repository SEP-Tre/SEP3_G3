package sep3.g3.rightoversjava.grpc.converter.interaces;

import sep3.g3.rightoversjava.grpc.generated.FoodPostResponse;
import sep3.g3.rightoversjava.grpc.generated.PickUpRequest;
import sep3.g3.rightoversjava.model.FoodPost;
import sep3.g3.rightoversjava.model.dto.PickUpDto;


public interface FoodPostConverter {
    FoodPostResponse getFoodPostResponse(FoodPost created);
    PickUpDto getPickUpDtoFromPickUpRequest(PickUpRequest request);
}
