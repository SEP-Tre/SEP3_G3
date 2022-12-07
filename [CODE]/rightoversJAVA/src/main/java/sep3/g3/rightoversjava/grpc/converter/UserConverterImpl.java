package sep3.g3.rightoversjava.grpc.converter;

import org.springframework.stereotype.Service;
import sep3.g3.rightoversjava.grpc.converter.interaces.UserConverter;
import sep3.g3.rightoversjava.grpc.generated.*;
import sep3.g3.rightoversjava.model.Address;
import sep3.g3.rightoversjava.model.OpeningHours;
import sep3.g3.rightoversjava.model.dto.OpeningHoursCreationDTO;
import sep3.g3.rightoversjava.model.User;
import sep3.g3.rightoversjava.model.dto.UserCreationDTO;
import sep3.g3.rightoversjava.model.dto.UserLoginDTO;

import java.time.LocalTime;

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
    public OpeningHoursResponse getOpeningHoursResponse(OpeningHours openingHours) {
        Time mondayOpening= Time.newBuilder().setHour(openingHours.getMondayOpeningHours().getHour()).setMinutes(openingHours.getMondayOpeningHours().getMinute()).build();
        Time mondayClosing= Time.newBuilder().setHour(openingHours.getMondayClosingHours().getHour()).setMinutes(openingHours.getMondayClosingHours().getMinute()).build();

        Time tuesdayOpening=Time.newBuilder().setHour(openingHours.getTuesdayOpeningHours().getHour()).setMinutes(openingHours.getTuesdayOpeningHours().getMinute()).build();
        Time tuesdayClosing=Time.newBuilder().setHour(openingHours.getTuesdayClosingHours().getHour()).setMinutes(openingHours.getTuesdayClosingHours().getMinute()).build();

        Time wednesdayOpening=Time.newBuilder().setHour(openingHours.getWednesdayOpeningHours().getHour()).setMinutes(openingHours.getWednesdayOpeningHours().getMinute()).build();
        Time wednesdayClosing=Time.newBuilder().setHour(openingHours.getWednesdayClosingHours().getHour()).setMinutes(openingHours.getWednesdayClosingHours().getMinute()).build();

        Time thursdayOpening=Time.newBuilder().setHour(openingHours.getThursdayOpeningHours().getHour()).setMinutes(openingHours.getThursdayOpeningHours().getMinute()).build();
        Time thursdayClosing=Time.newBuilder().setHour(openingHours.getThursdayClosingHours().getHour()).setMinutes(openingHours.getThursdayClosingHours().getMinute()).build();

        Time fridayOpening=Time.newBuilder().setHour(openingHours.getFridayOpeningHours().getHour()).setMinutes(openingHours.getFridayClosingHours().getMinute()).build();
        Time fridayClosing=Time.newBuilder().setHour(openingHours.getFridayClosingHours().getHour()).setMinutes(openingHours.getFridayClosingHours().getMinute()).build();

        Time saturdayOpening=Time.newBuilder().setHour(openingHours.getSaturdayOpeningHours().getHour()).setMinutes(openingHours.getSaturdayOpeningHours().getMinute()).build();
        Time saturdayClosing=Time.newBuilder().setHour(openingHours.getSaturdayClosingHours().getHour()).setMinutes(openingHours.getSaturdayClosingHours().getMinute()).build();


        Time sundayOpening=Time.newBuilder().setHour(openingHours.getSundayOpeningHours().getHour()).setMinutes(openingHours.getSundayOpeningHours().getMinute()).build();
        Time sundayClosing=Time.newBuilder().setHour(openingHours.getSundayClosingHours().getHour()).setMinutes(openingHours.getSundayClosingHours().getMinute()).build();



        OpeningHoursResponse response=  OpeningHoursResponse.newBuilder()
                .setMondayOpening(mondayOpening).setMondayClosing(mondayClosing)
                .setTuesdayOpening(tuesdayClosing).setTuesdayClosing(tuesdayClosing)
                .setWednesdayOpening(wednesdayOpening).setWednesdayClosing(wednesdayClosing)
                .setThursdayOpening(thursdayOpening).setThursdayClosing(thursdayClosing)
                .setFridayOpening(fridayOpening).setFridayClosing(fridayClosing)
                .setSaturdayOpening(saturdayOpening).setSaturdayClosing(saturdayClosing)
                .setSundayOpening(sundayOpening).setSundayClosing(sundayClosing).build();

        return response;

    }

    @Override
    public OpeningHoursCreationDTO convertOpeningHours(OpeningHoursRequest request) {

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
