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

    private IUserConverter converter;
    private static UserService.UserServiceClient client = new(channel);

    public UserDao(IUserConverter converter)
    {
        this.converter = converter;
    }

    public async Task<User> LoginAsync(UserLoginDto dto)
    {
        try
        {
            UserLoginRequest request = converter.GetUserLoginRequestFromDto(dto);
            UserMessage userMessage = await client.loginAsync(request);
            User user = converter.GetUserFromUserMessage(userMessage);
            return user;
        }
        catch (Exception e)
        {
            Console.WriteLine("GRPC CLIENT: " + e);
            throw;
        }
    }


    public async Task<User> RegisterAsync(UserCreationDto dto)
    {
        try
        {
            UserCreationRequest request = converter.GetUserCreationRequestFromDto(dto);
            UserMessage userMessage = await client.registerAsync(request);
            User user = converter.GetUserFromUserMessage(userMessage);

            return user;
        }
        catch (Exception e)
        {
            Console.WriteLine("GRPC CLIENT: " + e);
            throw;
        }
    }
}