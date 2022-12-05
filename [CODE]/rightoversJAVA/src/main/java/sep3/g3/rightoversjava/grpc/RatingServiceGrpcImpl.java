package sep3.g3.rightoversjava.grpc;

import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Configurable;
import sep3.g3.rightoversjava.grpc.converter.RatingConverterImpl;
import sep3.g3.rightoversjava.grpc.converter.interaces.RatingConverter;
import sep3.g3.rightoversjava.grpc.generated.RatingMessage;
import sep3.g3.rightoversjava.grpc.generated.RatingMessageList;
import sep3.g3.rightoversjava.grpc.generated.RatingServiceGrpc;
import sep3.g3.rightoversjava.grpc.generated.UsernameRequest;
import sep3.g3.rightoversjava.model.Rating;
import sep3.g3.rightoversjava.model.dto.RatingCreationDto;
import sep3.g3.rightoversjava.service.interaces.RatingService;

import java.util.ArrayList;

@Configurable
public class RatingServiceGrpcImpl extends RatingServiceGrpc.RatingServiceImplBase {

    private final RatingService ratingService;
    private final RatingConverter converter;

    public RatingServiceGrpcImpl() {
        ratingService = SpringContext.getBean(RatingService.class);
        converter = SpringContext.getBean(RatingConverterImpl.class);
    }

    @Override
    public void addRating(RatingMessage request, StreamObserver<RatingMessage> responseObserver) {
        RatingCreationDto dto = converter.getRatingDtoFromRatingRequest(request);
        Rating rating = ratingService.addRating(dto);
        RatingMessage ratingMessage = converter.getRatingMessageFromRating(rating);
        responseObserver.onNext(ratingMessage);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllByUserRated(UsernameRequest request, StreamObserver<RatingMessageList> responseObserver) {
        String usernameRated = request.getUsername();
        ArrayList<Rating> ratings = ratingService.getAllByUserRated(usernameRated);
        RatingMessageList list = converter.getRatingMessageListFromRating(ratings);
        responseObserver.onNext(list);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllByUserRating(UsernameRequest request, StreamObserver<RatingMessageList> responseObserver) {
        String usernameRating = request.getUsername();
        ArrayList<Rating> ratings = ratingService.getAllByUserRating(usernameRating);
        RatingMessageList list = converter.getRatingMessageListFromRating(ratings);
        responseObserver.onNext(list);
        responseObserver.onCompleted();
    }
}
