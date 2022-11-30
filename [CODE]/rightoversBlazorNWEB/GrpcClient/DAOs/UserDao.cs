using Application.DAOInterfaces;
using Domain.Classes;
using Domain.DTOs;
using Grpc.Net.Client;
using GrpcCL;
using GrpcClient.IConverters;

namespace GrpcClient.DAOs;

public class UserDao : IUserDao
{
    private static GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:9090", new GrpcChannelOptions{
        UnsafeUseInsecureChannelCallCredentials = true
    });

    /*
    private static FoodPostService.FoodPostServiceClient client = new(channel);

    private readonly IFoodPostConverter converter;

    public FoodPostDao(IFoodPostConverter converter)
    {
        this.converter = converter;
    }
    */
    public Task<User> LoginAsync(UserLoginDto dto)
    {
        //TODO change those two methods.
        User user = new User();
        user.Id = 0;
        user.UserName = dto.UserName;
        user.Password = dto.Password;
        user.FirstName = "KamiloTest";
        user.Address = new Address(0, "The great street",
            "16B/1", 8700, "Horsens", 0, 0);

        return Task.FromResult(user);
    }


    public Task<User> RegisterAsync(UserCreationDto dto)
    {
        User user = new User();
        user.UserName = dto.UserName;
        user.Password = dto.Password;
        user.Address = new Address(0,
            dto.AddressCreationDto.StreetNumber,
            dto.AddressCreationDto.Street,
            dto.AddressCreationDto.PostCode,
            dto.AddressCreationDto.City,
            0, 0);

        return Task.FromResult(user);
    }
}