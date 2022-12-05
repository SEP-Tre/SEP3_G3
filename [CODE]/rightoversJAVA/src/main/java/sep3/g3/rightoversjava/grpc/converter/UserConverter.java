package sep3.g3.rightoversjava.grpc.converter;

import sep3.g3.rightoversjava.grpc.generated.OpeningHoursRequest;
import sep3.g3.rightoversjava.grpc.generated.UserCreationRequest;
import sep3.g3.rightoversjava.grpc.generated.UserLoginRequest;
import sep3.g3.rightoversjava.grpc.generated.UserMessage;
import sep3.g3.rightoversjava.model.OpeningHoursCreationDTO;
import sep3.g3.rightoversjava.grpc.generated.*;
import sep3.g3.rightoversjava.model.FoodPost;
import sep3.g3.rightoversjava.model.User;
import sep3.g3.rightoversjava.model.UserCreationDTO;
import sep3.g3.rightoversjava.model.UserLoginDTO;

public interface UserConverter
{
    UserMessage getUserMessageFromUser(User user);
    UserCreationDTO getUserCreationDtoFromRequest(UserCreationRequest request);
    UserLoginDTO getUserLoginDtoFromRequest(UserLoginRequest request);

    OpeningHoursCreationDTO getOpeningHours(OpeningHoursRequest request);


}
