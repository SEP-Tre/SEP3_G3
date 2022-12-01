package sep3.g3.rightoversjava.grpc.converter;

import org.springframework.stereotype.Service;
import sep3.g3.rightoversjava.grpc.generated.AddressMessage;
import sep3.g3.rightoversjava.grpc.generated.UserCreationRequest;
import sep3.g3.rightoversjava.grpc.generated.UserLoginRequest;
import sep3.g3.rightoversjava.grpc.generated.UserMessage;
import sep3.g3.rightoversjava.model.Address;
import sep3.g3.rightoversjava.model.User;
import sep3.g3.rightoversjava.model.UserCreationDTO;
import sep3.g3.rightoversjava.model.UserLoginDTO;

@Service
public class UserConverterImpl implements UserConverter
{
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
    public UserCreationDTO getUserCreationDtoFromRequest(UserCreationRequest request)
    {
        UserCreationDTO dto =new UserCreationDTO(
                request.getFirstname(),
                request.getUsername(),
                request.getPassword(),
                request.getAddress().getAddressId(),
                request.getAddress().getStreet(),
                request.getAddress().getStreetNumber(),
                request.getAddress().getPostCode(),
                request.getAddress().getCity(),
                request.getAddress().getLongitude(),
                request.getAddress().getLatitude(),
                request.getIsBusiness()

        );
        return dto;
    }

    @Override
    public UserLoginDTO getUserLoginDtoFromRequest(UserLoginRequest request)
    {
        UserLoginDTO dto = new UserLoginDTO(
                request.getUsername(),
                request.getPassword());
        return dto;
    }


}
