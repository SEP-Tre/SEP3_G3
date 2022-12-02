package sep3.g3.rightoversjava.grpc.converter;

import com.google.protobuf.Timestamp;
import org.springframework.stereotype.Service;
import sep3.g3.rightoversjava.grpc.generated.*;
import sep3.g3.rightoversjava.model.*;
import sep3.g3.rightoversjava.model.Address;
import sep3.g3.rightoversjava.model.FoodPost;
import sep3.g3.rightoversjava.model.User;

import java.time.Instant;

@Service
public class UserConverterImpl implements UserConverter {
    public UserMessage getUserMessageFromUser(User user) {

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
    public UserCreationDTO getUserCreationDtoFromRequest(UserCreationRequest request) {
        UserCreationDTO dto = new UserCreationDTO(
                request.getFirstname(),
                request.getUsername(),
                request.getPassword(),
                request.getAddress().getAddressId(),
                request.getAddress().getStreet(),
                request.getAddress().getStreetNumber(),
                request.getAddress().getPostCode(),
                request.getAddress().getCity(),
                request.getAddress().getLongitude(),
                request.getAddress().getLatitude()
        );
        return dto;
    }

    @Override
    public UserLoginDTO getUserLoginDtoFromRequest(UserLoginRequest request) {
        UserLoginDTO dto = new UserLoginDTO(
                request.getUsername(),
                request.getPassword());
        return dto;
    }
}
