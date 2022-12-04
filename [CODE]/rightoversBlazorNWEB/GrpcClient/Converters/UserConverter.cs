using Domain.Classes;
using Domain.DTOs;
using GrpcCL;
using GrpcClient.IConverters;

namespace GrpcClient.Converters;

public class UserConverter : IUserConverter
{
    public UserCreationRequest GetUserCreationRequestFromDto(UserCreationDto dto)
    {
        AddressCreationDto addressDto = dto.AddressCreationDto;
        UserCreationRequest userCreationRequest = new UserCreationRequest
        {
            Firstname = dto.FirstName,
            Password = dto.Password,
            Username = dto.UserName,
            IsBusiness = dto.IsBusiness,
            Address = new AddressMessage
            {
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

    public MyTime TimeConverter(OCTime time)
    {
        MyTime converted = new MyTime(time.Hour,time.Minutes);
        return converted;
    }
    

    public User GetUserFromUserMessage(UserMessage userMessage)
    {
        AddressMessage addressMessage = userMessage.Address;
        User user = new User
        {
            FirstName = userMessage.Firstname,
            UserName = userMessage.Username,
            Password = userMessage.Password,
            Address = new Address(addressMessage.AddressId,  addressMessage.StreetNumber, addressMessage.Street, addressMessage.PostCode, addressMessage.City, addressMessage.Longitude, addressMessage.Latitude)
        };
        return user;
    }

    public UserLoginRequest GetUserLoginRequestFromDto(UserLoginDto dto)
    {
        UserLoginRequest request = new UserLoginRequest
        {
            Username = dto.UserName,
            Password = dto.Password
        };
        return request;
    }
}