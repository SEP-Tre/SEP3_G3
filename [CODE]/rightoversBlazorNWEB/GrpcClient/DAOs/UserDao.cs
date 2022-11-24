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
        throw new NotImplementedException();
    }
    

    public Task<User> RegisterAsync(UserCreationDto dto)
    {
        throw new NotImplementedException();
    }
}