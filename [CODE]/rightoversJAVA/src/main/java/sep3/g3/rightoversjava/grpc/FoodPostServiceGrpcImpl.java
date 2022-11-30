package sep3.g3.rightoversjava.grpc;

import com.google.protobuf.Timestamp;
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

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;
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
        Date sd = request.getStartDate();
        Date ed = request.getEndDate();
        Time st = request.getStartTime();
        Time et = request.getEndTime();
        LocalDate startDate = LocalDate.of(sd.getYear(), sd.getMonth(), sd.getDay());
        LocalDate endDate = LocalDate.of(ed.getYear(), ed.getMonth(), ed.getDay());
        LocalTime startTime = LocalTime.of(st.getHour(), st.getMinutes());
        LocalTime endTime = LocalTime.of(et.getHour(), et.getMinutes());

        FoodPostCreationDTO dto = new FoodPostCreationDTO(
                request.getTitle(), request.getCategory(),
                request.getDescription(), request.getPictureUrl(),
                request.getDaysUntilExpired(), startDate, endDate,
                startTime, endTime, request.getUsername());
        try {
            FoodPost created = service.create(dto);
            FoodPostResponse response = converter.getFoodPostResponse(created);
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        catch (Exception e) {
            responseObserver.onError(e);
        }
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
