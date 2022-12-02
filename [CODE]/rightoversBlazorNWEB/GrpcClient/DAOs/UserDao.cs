using Application.DAOInterfaces;
using Domain.Classes;
using Domain.DTOs;
using Grpc.Core;
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

    public async Task<User> GetByUsername(string username)
    {
        UserRequest userRequest = converter.GetUserRequestFromUsername(username);
        UserMessage userMessage = await client.getByUsernameAsync(userRequest);
        User user = converter.GetUserFromUserMessage(userMessage);
        return user;
    }

    public Task<IEnumerable<Reservation>> GetAllReservationsByUser(string username)
    {
        //TODO GRPC FOR GETTING ALL RESERVATIONS BY ONE USER
        throw new NotImplementedException();
    }

    public Task<IEnumerable<Rating>> GetAllRatingsToUser(string username)
    {
        //TODO GRPC FOR GETTING ALL RATINGS TO A USER
        throw new NotImplementedException();
    }
}