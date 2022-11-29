using Application.DAOInterfaces;
using Domain.Classes;
using Domain.DTOs;
using Grpc.Net.Client;
using GrpcCL;
using GrpcClient.IConverters;

namespace GrpcClient.DAOs;

public class UserDao : IUserDao
{
    private static GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:9090", new GrpcChannelOptions
    {
        UnsafeUseInsecureChannelCallCredentials = true
    });

    
    private static UserService.UserServiceClient client = new(channel);

    //private readonly IFoodPostConverter converter;
    /*
    public FoodPostDao(IFoodPostConverter converter)
    {
        this.converter = converter;
    }
    */
    public Task<User> LoginAsync(UserLoginDto dto)
    {
        //TODO change those two methods.
        throw new NotImplementedException();
    }


    public async Task<User> RegisterAsync(UserCreationDto dto)
    {
        
        AddressCreationDto addressDto = dto.AddressCreationDto;
        UserMessage userMessage = await client.registerAsync(new UserCreationRequest
        {
            Firstname = dto.FirstName,
            Password = dto.Password,
            Username = dto.UserName,
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
        });
        AddressMessage addressMessage = userMessage.Address;
        User user = new User
        {
            //Todo user ID is missing.
            Id = 0,
            FirstName = userMessage.Firstname,
            UserName = userMessage.Username,
            Password = userMessage.Password,
            Address = new Address(addressMessage.AddressId,  addressMessage.StreetNumber, addressMessage.Street, addressMessage.PostCode, addressMessage.City, addressMessage.Longitude, addressMessage.Latitude)
        };
        return user;
    }
}