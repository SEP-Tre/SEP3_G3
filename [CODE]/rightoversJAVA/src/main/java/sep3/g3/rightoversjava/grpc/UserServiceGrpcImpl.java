package sep3.g3.rightoversjava.grpc;

import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Configurable;
import sep3.g3.rightoversjava.grpc.converter.interaces.UserConverter;
import sep3.g3.rightoversjava.grpc.converter.UserConverterImpl;
import sep3.g3.rightoversjava.grpc.generated.*;
import sep3.g3.rightoversjava.model.User;
import sep3.g3.rightoversjava.model.dto.UserCreationDTO;
import sep3.g3.rightoversjava.model.dto.UserLoginDTO;
import sep3.g3.rightoversjava.service.interaces.UserService;

@Configurable
public class UserServiceGrpcImpl
        extends UserServiceGrpc.UserServiceImplBase
{
    private UserService userService;
    private UserConverter converter;

    public UserServiceGrpcImpl()
    {
        userService = SpringContext.getBean(UserService.class);
        converter = SpringContext.getBean(UserConverterImpl.class);
    }

    @Override
    public void register(UserCreationRequest request,
                         StreamObserver<UserMessage> responseObserver)
    {
        UserCreationDTO userCreationDTO = converter.getUserCreationDtoFromRequest(request);
        User user = userService.registerUser(userCreationDTO);
        UserMessage userMessage = converter.getUserMessageFromUser(user);
        responseObserver.onNext(userMessage);
        responseObserver.onCompleted();
    }


    @Override
    public void login(UserLoginRequest request,
                      StreamObserver<UserMessage> responseObserver)
    {
        UserLoginDTO dto = converter.getUserLoginDtoFromRequest(request);
        try
        {
            User user = userService.login(dto);
            UserMessage userMessage = converter.getUserMessageFromUser(user);
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
