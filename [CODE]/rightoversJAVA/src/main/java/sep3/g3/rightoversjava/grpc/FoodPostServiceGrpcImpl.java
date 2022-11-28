package sep3.g3.rightoversjava.grpc;

import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import sep3.g3.rightoversjava.grpc.converter.FoodPostConverter;
import sep3.g3.rightoversjava.grpc.converter.FoodPostConverterImpl;
import sep3.g3.rightoversjava.grpc.generated.*;
import sep3.g3.rightoversjava.grpc.generated.FoodPostRequest;
import sep3.g3.rightoversjava.grpc.generated.FoodPostResponse;
import sep3.g3.rightoversjava.grpc.generated.FoodPostServiceGrpc;
import sep3.g3.rightoversjava.grpc.generated.GetAllRequest;
import sep3.g3.rightoversjava.model.FoodPost;
import sep3.g3.rightoversjava.model.FoodPostCreationDTO;
import sep3.g3.rightoversjava.service.FoodPostService;

import java.util.ArrayList;
import java.util.NoSuchElementException;

@Configurable
public class FoodPostServiceGrpcImpl extends FoodPostServiceGrpc.FoodPostServiceImplBase {

    @Autowired
    private FoodPostService service;
    @Autowired
    private FoodPostConverter converter;

    public FoodPostServiceGrpcImpl() {
        service = SpringContext.getBean(FoodPostService.class);
        converter = SpringContext.getBean(FoodPostConverter.class);
    }

    @Override
    public void post(FoodPostRequest request, StreamObserver<FoodPostResponse> responseObserver) {
        FoodPostCreationDTO dto = new FoodPostCreationDTO(request.getTitle(), request.getCategory(), request.getDescription(), request.getPictureUrl(), request.getDaysUntilExpired());
        FoodPost created = service.create(dto);
        FoodPostResponse response = FoodPostResponse.newBuilder().setFpId(created.getPost_id()).setTitle(created.getTitle()).setCategory(created.getCategory_()).setDescription(created.getDescription()).setPictureUrl(created.getPictureUrl()).setDaysUntilExpired(created.getDaysUntilExpired()).setFpState(created.getPostState()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllFoodPosts(GetAllRequest request,
                                StreamObserver<FoodPostResponse> responseObserver) {
        ArrayList<FoodPost> allPosts = service.getAllFoodPosts();
        // System.out.println("All posts: " + allPosts.toString());
        for (int i = 0; i < allPosts.size(); i++)
        {
            FoodPost foodPost =allPosts.get(i);
            FoodPostResponse response = converter.getFoodPostResponse(foodPost);

            responseObserver.onNext(response);
        };
        responseObserver.onCompleted();
    }

    @Override
    public void getSingleFoodPost(FoodPostID request, StreamObserver<FoodPostResponse> responseObserver)
    {
        try
        {
            FoodPost foodPost = service.getSingleFoodPost(request.getId());
            FoodPostResponse response = converter.getFoodPostResponse(foodPost);
            responseObserver.onNext(response);
            responseObserver.onCompleted();

        }
        catch (NoSuchElementException e)
        {
            responseObserver.onError(e);
        }
    }
}
