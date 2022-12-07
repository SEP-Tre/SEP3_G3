package sep3.g3.rightoversjava.grpc.converter.interaces;

import sep3.g3.rightoversjava.grpc.generated.*;
import sep3.g3.rightoversjava.model.OpeningHours;
import sep3.g3.rightoversjava.model.User;
import sep3.g3.rightoversjava.model.dto.*;

public interface UserConverter
{
    UserMessage getUserMessageFromUser(User user);
    UserCreationDTO getUserCreationDtoFromRequest(UserCreationRequest request);
    UserLoginDTO getUserLoginDtoFromRequest(UserLoginRequest request);
    OpeningHoursResponse getOpeningHoursResponse(OpeningHours openingHours);

    OpeningHoursCreationDTO convertOpeningHours(OpeningHoursRequest request);
}
