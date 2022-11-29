package sep3.g3.rightoversjava.grpc;

import io.grpc.Metadata;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Configurable;
import sep3.g3.rightoversjava.grpc.generated.*;
import sep3.g3.rightoversjava.model.Address;
import sep3.g3.rightoversjava.model.User;
import sep3.g3.rightoversjava.model.UserCreationDTO;
import sep3.g3.rightoversjava.model.UserLoginDTO;
import sep3.g3.rightoversjava.service.UserService;

@Configurable
public class UserServiceGrpcImpl
        extends UserServiceGrpc.UserServiceImplBase {
    private UserService userService;

    public UserServiceGrpcImpl() {
        userService = SpringContext.getBean(UserService.class);
    }

    @Override
    public void register(UserCreationRequest request,
                         StreamObserver<UserMessage> responseObserver) {
        User user = userService.registerUser(new UserCreationDTO(
                request.getFirstname(),
                request.getUsername(),
                request.getPassword(),
                request.getStreetName(),
                request.getStreetNumber(),
                request.getPostalCode(),
                request.getCityName()
        ));
        UserMessage userMessage = getUserMessageFromUser(user);
        responseObserver.onNext(userMessage);
        responseObserver.onCompleted();
    }

    private UserMessage getUserMessageFromUser(User user) {

        Address address = user.getAddress();

        AddressMessage addressMessage = AddressMessage.newBuilder()
                .setAddressId(address.getAddressId())
                .setStreet(address.getStreet())
                .setStreetNumber(address.getStreetNumber())
                .setPostCode(address.getPostCode())
                .setCity(address.getCity())
                .setLongitude(address.getLongitude())
                .setLatitude(address.getLatitude())
                .build();

        UserMessage userMessage = UserMessage.newBuilder()
                .setUsername(user.getUsername())
                .setFirstname(user.getFirstName())
                .setPassword(user.getPassword())
                .setAddress(addressMessage)
                .build();

        return userMessage;
    }

    @Override
    public void login(UserLoginRequest request,
                      StreamObserver<UserMessage> responseObserver) {
        UserLoginDTO dto = new UserLoginDTO(
                request.getUsername(),
                request.getPassword());
        try {
            User user = userService.login(dto);
            UserMessage userMessage = getUserMessageFromUser(user);
            responseObserver.onNext(userMessage);
            responseObserver.onCompleted();
        }
        catch (Exception e) {
            responseObserver.onError(
                    io.grpc.Status.INVALID_ARGUMENT
                            .withDescription(e.getMessage())
                    .asRuntimeException());
        }
    }
}
