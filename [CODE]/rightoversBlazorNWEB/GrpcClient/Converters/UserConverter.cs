using Domain.Classes;
using Domain.DTOs;
using GrpcCL;
using GrpcClient.IConverters;

namespace GrpcClient.Converters;

public class UserConverter : IUserConverter
{
    private FoodPostConverter foodPostConverter = new FoodPostConverter();
    public UserRequest GetUserRequestFromUsername(string username)
    {
        var userRequest = new UserRequest{
            Username = username
        };

        return userRequest;
    }

    public UserCreationRequest GetUserCreationRequestFromDto(UserCreationDto dto)
    {
        var addressDto = dto.AddressCreationDto;
        var userCreationRequest = new UserCreationRequest{
            Firstname = dto.FirstName,
            Password = dto.Password,
            Username = dto.UserName,
            IsBusiness = dto.IsBusiness,
            PhoneNumber = dto.PhoneNumber,
            Address = new AddressMessage{
                AddressId = addressDto.AddressId,
                City = addressDto.City,
                Latitude = addressDto.Latitude,
                Longitude = addressDto.Longitude,
                PostCode = addressDto.PostCode,
                Street = addressDto.Street,
                StreetNumber = addressDto.StreetNumber
            }
            
        };

        return userCreationRequest;
    }

    public Reservation GetReservationFromReservationMessage(ReservationMessage message)
    {
        Reservation reservation = new Reservation
        {
            FoodPost = foodPostConverter.GetFoodPost(message.FoodPost),
            ReservationId = message.ReservationId,
            User = GetUserFromUserMessage(message.User)
        };
        return reservation;
    }

    public MyTime TimeConverter(OCTime time)
    {
        var converted = new MyTime(time.Hour, time.Minutes);

        return converted;
    }


    public User GetUserFromUserMessage(UserMessage userMessage)
    {
        var addressMessage = userMessage.Address;
        var user = new User{
            FirstName = userMessage.Firstname,
            UserName = userMessage.Username,
            Password = userMessage.Password,
            PhoneNumber = userMessage.PhoneNumber,
            Address = new Address(addressMessage.AddressId, addressMessage.StreetNumber, addressMessage.Street,
                addressMessage.PostCode, addressMessage.City, addressMessage.Longitude, addressMessage.Latitude),
            IsBusiness = userMessage.IsBusiness
        };

        return user;
    }

    public UserLoginRequest GetUserLoginRequestFromDto(UserLoginDto dto)
    {
        var request = new UserLoginRequest{
            Username = dto.UserName,
            Password = dto.Password
        };

        return request;
    }

    public ChangeFirstNameRequest GetChangeFirstNameRequestFromDto(UserUpdateFirstNameDto dto)
    {
        var request = new ChangeFirstNameRequest
        {
            Username = dto.Username,
            NewFirstName = dto.NewFirstName
        };
        return request;
    }
    public ChangePasswordRequest GetChangePasswordRequestFromDto(UserUpdatePasswordDto dto)
    {
        var request = new ChangePasswordRequest()
        {
            Username = dto.Username,
            OldPassword = dto.OldPassword,
            NewPassword = dto.NewPassword
        };
        return request;
    }
    public ChangeAddressRequest GetChangeAddressRequestFromDto(UserUpdateAddressDto dto)
    {
        var request = new ChangeAddressRequest()
        {
            Username = dto.Username,
            StreetName = dto.NewStreetName,
            StreetNumber = dto.NewStreetNumber,
            City = dto.NewCity,
            PostalCode = dto.NewPostalCode
        };
        return request;
    }
}