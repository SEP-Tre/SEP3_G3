package sep3.g3.rightoversjava.grpc.converter;

import com.google.protobuf.Timestamp;
import org.springframework.stereotype.Service;
import sep3.g3.rightoversjava.grpc.generated.*;
import sep3.g3.rightoversjava.model.*;
import sep3.g3.rightoversjava.model.Address;
import sep3.g3.rightoversjava.model.FoodPost;
import sep3.g3.rightoversjava.model.User;

import java.time.LocalTime;

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
                request.getAddress().getLatitude(),
                request.getIsBusiness()
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

    @Override
    public OpeningHoursCreationDTO getOpeningHours(OpeningHoursRequest request) {

        Time mondayOpening = request.getOpeningHours().getMondayOpening();
        Time mondayClosing = request.getOpeningHours().getMondayClosing();
        Time tuesdayOpening = request.getOpeningHours().getTuesdayOpening();
        Time tuesdayClosing = request.getOpeningHours().getTuesdayClosing();
        Time wednesdayOpening = request.getOpeningHours().getWednesdayOpening();
        Time wednesdayClosing = request.getOpeningHours().getWednesdayClosing();
        Time thursdayOpening = request.getOpeningHours().getThursdayOpening();
        Time thursdayClosing = request.getOpeningHours().getThursdayClosing();
        Time fridayOpening = request.getOpeningHours().getFridayOpening();
        Time fridayClosing = request.getOpeningHours().getFridayClosing();
        Time saturdayOpening = request.getOpeningHours().getSaturdayOpening();
        Time saturdayClosing = request.getOpeningHours().getSaturdayClosing();
        Time sundayOpening = request.getOpeningHours().getSundayOpening();
        Time sundayClosing = request.getOpeningHours().getSundayClosing();


        LocalTime mondayOpeningTime = LocalTime.of(mondayOpening.getHour(), mondayOpening.getMinutes());
        LocalTime mondayClosingTime = LocalTime.of(mondayClosing.getHour(), mondayClosing.getMinutes());
        LocalTime tuesdayOpeningTime = LocalTime.of(tuesdayOpening.getHour(), tuesdayOpening.getMinutes());
        LocalTime tuesdayClosingTime = LocalTime.of(tuesdayClosing.getHour(), tuesdayClosing.getMinutes());
        LocalTime wednesdayOpeningTime = LocalTime.of(wednesdayOpening.getHour(), wednesdayOpening.getMinutes());
        LocalTime wednesdayClosingTime = LocalTime.of(wednesdayClosing.getHour(), wednesdayClosing.getMinutes());
        LocalTime thursdayOpeningTime = LocalTime.of(thursdayOpening.getHour(), thursdayOpening.getMinutes());
        LocalTime thursdayClosingTime = LocalTime.of(thursdayClosing.getHour(), thursdayClosing.getMinutes());
        LocalTime fridayOpeningTime = LocalTime.of(fridayOpening.getHour(), fridayOpening.getMinutes());
        LocalTime fridayClosingTime = LocalTime.of(fridayClosing.getHour(), fridayClosing.getMinutes());
        LocalTime saturdayOpeningTime = LocalTime.of(saturdayOpening.getHour(), saturdayOpening.getMinutes());
        LocalTime saturdayClosingTime = LocalTime.of(saturdayClosing.getHour(), saturdayClosing.getMinutes());
        LocalTime sundayOpeningTime = LocalTime.of(sundayOpening.getHour(), sundayOpening.getMinutes());
        LocalTime sundayClosingTime = LocalTime.of(sundayClosing.getHour(), sundayClosing.getMinutes());


        OpeningHoursCreationDTO dto = new OpeningHoursCreationDTO(


                request.getUsername(),
                mondayOpeningTime,
                mondayClosingTime,
                tuesdayOpeningTime,
                tuesdayClosingTime,
                wednesdayOpeningTime,
                wednesdayClosingTime,
                thursdayOpeningTime,
                thursdayClosingTime,
                fridayOpeningTime,
                fridayClosingTime,
                saturdayOpeningTime,
                saturdayClosingTime,
                sundayOpeningTime,
                sundayClosingTime

        );

        return dto;
    }


}
