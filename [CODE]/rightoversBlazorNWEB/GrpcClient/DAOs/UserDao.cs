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
    private readonly static GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:9090", new GrpcChannelOptions{
        UnsafeUseInsecureChannelCallCredentials = true
    });

    private readonly static UserService.UserServiceClient client = new UserService.UserServiceClient(channel);

    private readonly IUserConverter converter;

    public UserDao(IUserConverter converter)
    {
        this.converter = converter;
    }

    public async Task<User> LoginAsync(UserLoginDto dto)
    {
        try
        {
            var request = converter.GetUserLoginRequestFromDto(dto);
            var userMessage = await client.loginAsync(request);
            var user = converter.GetUserFromUserMessage(userMessage);

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
            var request = converter.GetUserCreationRequestFromDto(dto);
            var userMessage = await client.registerAsync(request);
            var user = converter.GetUserFromUserMessage(userMessage);

            return user;
        }
        catch (Exception e)
        {
            Console.WriteLine("GRPC CLIENT: " + e);

            throw;
        }
    }

    public async Task<OpeningHours> GetOpeningHoursAsync(string username)
    {
        var openingHours = new OpeningHours();

        var response = await client.GetOpeningHoursAsync(new UserName{
            Username = username
        });

        openingHours.MondayOpeningHours = converter.TimeConverter(response.MondayOpening);
        openingHours.MondayClosingHours = converter.TimeConverter(response.MondayClosing);
        openingHours.TuesdayOpeningHours = converter.TimeConverter(response.TuesdayOpening);
        openingHours.TuesdayClosingHours = converter.TimeConverter(response.TuesdayClosing);
        openingHours.WednesdayOpeningHours = converter.TimeConverter(response.WednesdayOpening);
        openingHours.WednesdayClosingHours = converter.TimeConverter(response.WednesdayClosing);
        openingHours.ThursdayOpeningHours = converter.TimeConverter(response.ThursdayOpening);
        openingHours.ThursdayClosingHours = converter.TimeConverter(response.ThursdayClosing);
        openingHours.FridayOpeningHours = converter.TimeConverter(response.FridayOpening);
        openingHours.FridayClosingHours = converter.TimeConverter(response.FridayClosing);
        openingHours.SaturdayOpeningHours = converter.TimeConverter(response.SaturdayOpening);
        openingHours.SaturdayClosingHours = converter.TimeConverter(response.SaturdayClosing);
        openingHours.SundayOpeningHours = converter.TimeConverter(response.SundayOpening);
        openingHours.SundayClosingHours = converter.TimeConverter(response.SundayClosing);

        return openingHours;
    }

    public async Task<User> CreateOpeningHoursAsync(OpeningHoursCreationDto dto)
    {
        var response = await client.assignOpeningHoursAsync(new OpeningHoursRequest{
            Username = dto.Username,
            OpeningHours = new OpeningHoursResponse{
                MondayOpening = new OCTime{
                    Hour = dto.MondayOpeningHours.Hour,
                    Minutes = dto.MondayOpeningHours.Minutes
                },
                MondayClosing = new OCTime{
                    Hour = dto.MondayClosingHours.Hour,
                    Minutes = dto.MondayClosingHours.Minutes
                },
                TuesdayOpening = new OCTime{
                    Hour = dto.TuesdayOpeningHours.Hour,
                    Minutes = dto.TuesdayOpeningHours.Minutes
                },
                TuesdayClosing = new OCTime{
                    Hour = dto.TuesdayClosingHours.Hour,
                    Minutes = dto.TuesdayClosingHours.Minutes
                },
                WednesdayOpening = new OCTime{
                    Hour = dto.WednesdayOpeningHours.Hour,
                    Minutes = dto.WednesdayOpeningHours.Minutes
                },
                WednesdayClosing = new OCTime{
                    Hour = dto.WednesdayClosingHours.Hour,
                    Minutes = dto.WednesdayClosingHours.Minutes
                },
                ThursdayOpening = new OCTime{
                    Hour = dto.ThursdayOpeningHours.Hour,
                    Minutes = dto.ThursdayOpeningHours.Minutes
                },
                ThursdayClosing = new OCTime{
                    Hour = dto.ThursdayClosingHours.Hour,
                    Minutes = dto.ThursdayClosingHours.Minutes
                },
                FridayOpening = new OCTime{
                    Hour = dto.FridayOpeningHours.Hour,
                    Minutes = dto.FridayOpeningHours.Minutes
                },
                FridayClosing = new OCTime{
                    Hour = dto.FridayClosingHours.Hour,
                    Minutes = dto.FridayClosingHours.Minutes
                },
                SaturdayOpening = new OCTime{
                    Hour = dto.SaturdayOpeningHours.Hour,
                    Minutes = dto.SaturdayOpeningHours.Minutes
                },
                SaturdayClosing = new OCTime{
                    Hour = dto.SaturdayClosingHours.Hour,
                    Minutes = dto.SaturdayClosingHours.Minutes
                },
                SundayOpening = new OCTime{
                    Hour = dto.SundayOpeningHours.Hour,
                    Minutes = dto.SundayOpeningHours.Minutes
                },
                SundayClosing = new OCTime{
                    Hour = dto.SundayClosingHours.Hour,
                    Minutes = dto.SundayClosingHours.Minutes
                }
            }
        });
        var user = converter.GetUserFromUserMessage(response);

        return user;
    }

    public async Task<User> ChangeFirstName(UserUpdateFirstNameDto dto)
    {
        try
        {
            var request = converter.GetChangeFirstNameRequestFromDto(dto);
            var userMessage = await client.changeFirstNameAsync(request);
            var user = converter.GetUserFromUserMessage(userMessage);

            return user;
        }
        catch (Exception e)
        {
            Console.WriteLine("GRPC CLIENT: " + e);

            throw;
        }
    }

    public async Task<User> ChangePassword(UserUpdatePasswordDto dto)
    {
        try
        {
            var request = converter.GetChangePasswordRequestFromDto(dto);
            var userMessage = await client.changePasswordAsync(request);
            var user = converter.GetUserFromUserMessage(userMessage);

            return user;
        }
        catch (Exception e)
        {
            Console.WriteLine("GRPC CLIENT: " + e);

            throw;
        }
    }

    public async Task<User> ChangeAddress(UserUpdateAddressDto dto)
    {
        try
        {
            var request = converter.GetChangeAddressRequestFromDto(dto);
            var userMessage = await client.changeAddressAsync(request);
            var user = converter.GetUserFromUserMessage(userMessage);

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
        var userRequest = converter.GetUserRequestFromUsername(username);
        var userMessage = await client.getByUsernameAsync(userRequest);
        var user = converter.GetUserFromUserMessage(userMessage);

        return user;
    }

    public async Task<IEnumerable<Reservation>> GetAllReservationsByUser(string username)
    {
        var userRequest = converter.GetUserRequestFromUsername(username);
        var listHolder = new List<Reservation>();
        AsyncServerStreamingCall<ReservationMessage> response = client.getReservationsByUsername(userRequest);
        
        await foreach (var message in response.ResponseStream.ReadAllAsync())
            if (message.User != null && message.FoodPost != null)
            {
                var reservation = converter.GetReservationFromReservationMessage(message);
                listHolder.Add(reservation);
            }

        return listHolder;
    }

    public Task<IEnumerable<Rating>> GetAllRatingsToUser(string username)
    {
        //TODO GRPC FOR GETTING ALL RATINGS TO A USER
        throw new NotImplementedException();
    }
}