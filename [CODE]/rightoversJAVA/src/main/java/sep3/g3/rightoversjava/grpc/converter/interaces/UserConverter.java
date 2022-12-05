package sep3.g3.rightoversjava.grpc.converter.interaces;

import sep3.g3.rightoversjava.grpc.generated.OpeningHoursRequest;
import sep3.g3.rightoversjava.grpc.generated.UserCreationRequest;
import sep3.g3.rightoversjava.grpc.generated.UserLoginRequest;
import sep3.g3.rightoversjava.grpc.generated.UserMessage;
import sep3.g3.rightoversjava.model.User;
import sep3.g3.rightoversjava.model.dto.*;

public interface UserConverter
{
    UserMessage getUserMessageFromUser(User user);
    UserCreationDTO getUserCreationDtoFromRequest(UserCreationRequest request);
    UserLoginDTO getUserLoginDtoFromRequest(UserLoginRequest request);
    OpeningHoursCreationDTO getOpeningHours(OpeningHoursRequest request);
}
