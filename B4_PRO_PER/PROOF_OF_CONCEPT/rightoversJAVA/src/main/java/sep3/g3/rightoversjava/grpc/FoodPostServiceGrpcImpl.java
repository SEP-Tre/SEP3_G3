package sep3.g3.rightoversjava.grpc;

import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import sep3.g3.rightoversjava.grpc.generated.FoodPostRequest;
import sep3.g3.rightoversjava.grpc.generated.FoodPostResponse;
import sep3.g3.rightoversjava.grpc.generated.FoodPostServiceGrpc;
import sep3.g3.rightoversjava.model.FoodPost;
import sep3.g3.rightoversjava.model.FoodPostCreationDTO;
import sep3.g3.rightoversjava.service.FoodPostService;

@Configurable
public class FoodPostServiceGrpcImpl extends FoodPostServiceGrpc.FoodPostServiceImplBase {

    @Autowired
    private FoodPostService service;

    public FoodPostServiceGrpcImpl() {
        service = SpringContext.getBean(FoodPostService.class);
    }

    @Override
    public void post(FoodPostRequest request, StreamObserver<FoodPostResponse> responseObserver) {
        FoodPostCreationDTO dto = new FoodPostCreationDTO(request.getTitle(), request.getCategory(), request.getDescription(), request.getPictureUrl(), request.getDaysUntilExpired());
        FoodPost created = service.create(dto);
        FoodPostResponse response = FoodPostResponse.newBuilder().setFpId(created.getPost_id()).setTitle(created.getTitle()).setCategory(created.getCategory_()).setDescription(created.getDescription()).setPictureUrl(created.getPictureUrl()).setDaysUntilExpired(created.getDaysUntilExpired()).setFpState(created.getPostState()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
