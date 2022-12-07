package sep3.g3.rightoversjava.grpc;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Configurable;
import sep3.g3.rightoversjava.grpc.converter.FoodPostConverterImpl;
import sep3.g3.rightoversjava.grpc.converter.UserConverterImpl;
import sep3.g3.rightoversjava.grpc.converter.interaces.FoodPostConverter;
import sep3.g3.rightoversjava.grpc.converter.interaces.UserConverter;
import sep3.g3.rightoversjava.grpc.generated.*;
import sep3.g3.rightoversjava.model.OpeningHours;
import sep3.g3.rightoversjava.model.dto.OpeningHoursCreationDTO;
import sep3.g3.rightoversjava.model.Reservation;
import sep3.g3.rightoversjava.model.User;
import sep3.g3.rightoversjava.model.dto.UserCreationDTO;
import sep3.g3.rightoversjava.model.dto.UserLoginDTO;
import sep3.g3.rightoversjava.service.interaces.UserService;

import java.util.ArrayList;

@Configurable
public class UserServiceGrpcImpl
        extends UserServiceGrpc.UserServiceImplBase {
    private final UserService userService;
    private final UserConverter userConverter;
    private final FoodPostConverter foodPostConverter;

    public UserServiceGrpcImpl() {
        userService = SpringContext.getBean(UserService.class);
        userConverter = SpringContext.getBean(UserConverterImpl.class);
        foodPostConverter = SpringContext.getBean(FoodPostConverterImpl.class);
    }

    @Override
    public void register(UserCreationRequest request,
                         StreamObserver<UserMessage> responseObserver) {
        UserCreationDTO userCreationDTO = userConverter.getUserCreationDtoFromRequest(request);
        User user = userService.registerUser(userCreationDTO);
        UserMessage userMessage = userConverter.getUserMessageFromUser(user);
        responseObserver.onNext(userMessage);
        responseObserver.onCompleted();
    }


    @Override
    public void login(UserLoginRequest request,
                      StreamObserver<UserMessage> responseObserver) {
        UserLoginDTO dto = userConverter.getUserLoginDtoFromRequest(request);
        try {
            User user = userService.login(dto);
            UserMessage userMessage = userConverter.getUserMessageFromUser(user);
            responseObserver.onNext(userMessage);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(
                    io.grpc.Status.INVALID_ARGUMENT
                            .withDescription(e.getMessage())
                            .asRuntimeException());
        }
    }

    @Override
    public void getByUsername(UserRequest request, StreamObserver<UserMessage> responseObserver) {
        String username = request.getUsername();
        try {
            User user = userService.getByUsername(username);
            UserMessage userMessage = userConverter.getUserMessageFromUser(user);
            responseObserver.onNext(userMessage);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(
                    io.grpc.Status.INVALID_ARGUMENT
                            .withDescription(e.getMessage())
                            .asRuntimeException());
        }
    }

    @Override
    public void getReservationsByUsername(UserRequest request, StreamObserver<ReservationMessage> responseObserver) {
        // TODO: Move to converter
        try {
            ArrayList<Reservation> reservations =
                    userService.getReservationsByUsername(request.getUsername());
            ArrayList<ReservationMessage> reservationMessages = new ArrayList<>();
            for (Reservation reservation :
                    reservations) {
                ReservationMessage reservationMessage = ReservationMessage.newBuilder()
                        .setReservationId(reservation.getReservationId())
                        .setFoodPost(foodPostConverter.getFoodPostResponse(
                                reservation.getFoodPost()))
                        .setUser(userConverter.getUserMessageFromUser(
                                reservation.getUser()))
                        .build();
                reservationMessages.add(reservationMessage);
            }
            for (ReservationMessage reservationMessage :
                    reservationMessages) {
                responseObserver.onNext(reservationMessage);
            }
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(
                    io.grpc.Status.INVALID_ARGUMENT
                            .withDescription(e.getMessage())
                            .asRuntimeException());
        }
    }

    @Override
    public void assignOpeningHours(OpeningHoursRequest request, StreamObserver<UserMessage> responseObserver) {

        OpeningHoursCreationDTO dto = userConverter.convertOpeningHours(request);
        try {
            User user = userService.assignOpeningHours(dto);
            UserMessage userMessage = userConverter.getUserMessageFromUser(user);
            responseObserver.onNext(userMessage);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(
                    io.grpc.Status.INVALID_ARGUMENT
                            .withDescription(e.getMessage())
                            .asRuntimeException());
        }
    }

    @Override
    public void getOpeningHours(UserName request, StreamObserver<OpeningHoursResponse> responseObserver) {
        String username=request.getUsername();

        try{
            OpeningHours openingHours = userService.getOpeningHours(username);
            OpeningHoursResponse response= userConverter.getOpeningHoursResponse(openingHours);
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        catch( Exception e)
        {
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription(e.getMessage()).asRuntimeException());
        }
    }
}
