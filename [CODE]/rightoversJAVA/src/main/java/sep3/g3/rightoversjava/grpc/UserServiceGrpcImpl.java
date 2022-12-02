package sep3.g3.rightoversjava.grpc;

import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Configurable;
import sep3.g3.rightoversjava.grpc.converter.FoodPostConverter;
import sep3.g3.rightoversjava.grpc.converter.FoodPostConverterImpl;
import sep3.g3.rightoversjava.grpc.converter.UserConverter;
import sep3.g3.rightoversjava.grpc.converter.UserConverterImpl;
import sep3.g3.rightoversjava.grpc.generated.*;
import sep3.g3.rightoversjava.model.FoodPost;
import sep3.g3.rightoversjava.model.User;
import sep3.g3.rightoversjava.model.UserCreationDTO;
import sep3.g3.rightoversjava.model.UserLoginDTO;
import sep3.g3.rightoversjava.service.UserService;

import java.util.ArrayList;

@Configurable
public class UserServiceGrpcImpl
        extends UserServiceGrpc.UserServiceImplBase
{
    private UserService userService;
    private UserConverter userConverter;

    public UserServiceGrpcImpl()
    {
        userService = SpringContext.getBean(UserService.class);
        userConverter = SpringContext.getBean(UserConverterImpl.class);
    }

    @Override
    public void register(UserCreationRequest request,
                         StreamObserver<UserMessage> responseObserver)
    {
        UserCreationDTO userCreationDTO = userConverter.getUserCreationDtoFromRequest(request);
        User user = userService.registerUser(userCreationDTO);
        UserMessage userMessage = userConverter.getUserMessageFromUser(user);
        responseObserver.onNext(userMessage);
        responseObserver.onCompleted();
    }


    @Override
    public void login(UserLoginRequest request,
                      StreamObserver<UserMessage> responseObserver)
    {
        UserLoginDTO dto = userConverter.getUserLoginDtoFromRequest(request);
        try
        {
            User user = userService.login(dto);
            UserMessage userMessage = userConverter.getUserMessageFromUser(user);
            responseObserver.onNext(userMessage);
            responseObserver.onCompleted();
        } catch (Exception e)
        {
            responseObserver.onError(
                    io.grpc.Status.INVALID_ARGUMENT
                            .withDescription(e.getMessage())
                            .asRuntimeException());
        }
    }

    @Override
    public void getByUsername(UserRequest request, StreamObserver<UserMessage> responseObserver) {
        String username = request.getUsername();
        try
        {
            User user = userService.getByUsername(username);
            UserMessage userMessage = userConverter.getUserMessageFromUser(user);
            responseObserver.onNext(userMessage);
            responseObserver.onCompleted();
        } catch (Exception e)
        {
            responseObserver.onError(
                    io.grpc.Status.INVALID_ARGUMENT
                            .withDescription(e.getMessage())
                            .asRuntimeException());
        }
    }

}
