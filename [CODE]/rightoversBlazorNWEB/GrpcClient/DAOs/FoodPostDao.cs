using System.Text.Json;
using System.Text.Json.Serialization;
using Application.DAOInterfaces;
using Domain.Classes;
using Domain.DTOs;
using Grpc.Core;
using Grpc.Net.Client;
using GrpcCL;
using GrpcClient.Converters;
using GrpcClient.IConverters;

namespace GrpcClient.DAOs;

public class FoodPostDao : IFoodPostDao
{
    private static GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:9090", new GrpcChannelOptions{
        UnsafeUseInsecureChannelCallCredentials = true
    });

    private static FoodPostService.FoodPostServiceClient client = new(channel);

    private readonly IFoodPostConverter converter;

    public FoodPostDao(IFoodPostConverter converter)
    {
        this.converter = converter;
    }

    public async Task<FoodPost> Create(FoodPostCreationDto dto)
    {
        FoodPostResponse response = await client.postAsync(new FoodPostRequest{
            Category = dto.Category,
            DaysUntilExpired = dto.DaysUntilExpired,
            Description = dto.Description,
            PictureUrl = dto.PictureUrl,
            Title = dto.Title,
            StartDate = new Date
            {
                Day = dto.StartDate.Day,
                Month = dto.StartDate.Month,
                Year = dto.StartDate.Year
            },
            EndDate = new Date
            {
            Day = dto.EndDate.Day,
            Month = dto.EndDate.Month,
            Year = dto.EndDate.Year 
            },
            StartTime = new Time
            {
                Hour = dto.StartTime.Hour,
                Minutes = dto.StartTime.Minutes
            },
            EndTime = new Time
            {
                Hour = dto.EndTime.Hour,
                Minutes = dto.EndTime.Minutes
            },
            Username = dto.Username
        });

        FoodPost fp = converter.GetFoodPost(response);
        return fp;
    }

    public async Task<IEnumerable<FoodPost>> GetAsync()
    {
        // Missing an await, but where?
        List<FoodPost> listHolder = new List<FoodPost>();
        AsyncServerStreamingCall<FoodPostResponse> response = client.getAllFoodPosts(new GetAllRequest{
            Filler = true
        });
        // Because it is a stream, lets make a Dto for the current one we are on
        await foreach (var message in response.ResponseStream.ReadAllAsync())
        {
            if (message.Category != null && message.Title != null)
            {
                FoodPost fp = converter.GetFoodPost(message);
                listHolder.Add(fp);
                Console.WriteLine("I found a post: " + fp.Title + " : " + fp.Category);
            }
        }

        return listHolder;
    }
    
    public async Task<IEnumerable<FoodPost>> GetAllFoodPostsByUser(string username)
    {
        FPByUsernameRequest userRequest = new FPByUsernameRequest
        {
            Username = username
        };
        
        // Missing an await, but where?
        List<FoodPost> listHolder = new List<FoodPost>();
        AsyncServerStreamingCall<FoodPostResponse> response = client.getFoodPostsByUsername(userRequest);
        // Because it is a stream, lets make a Dto for the current one we are on
        await foreach (var message in response.ResponseStream.ReadAllAsync())
        {
            if (message.Category != null && message.Title != null)
            {
                FoodPost fp = converter.GetFoodPost(message);
                listHolder.Add(fp);
                Console.WriteLine("I found a post: " + fp.Title + " : " + fp.Category);
            }
        }
        return listHolder;
    }
   

    public async Task<FoodPost> GetSingleAsync(int id)
    {
        FoodPostResponse response = await client.getSingleFoodPostAsync(new FoodPostID{
            Id = id
        });

        FoodPost foodPost = converter.GetFoodPost(response);

        return foodPost;
    }

    public async Task Reserve(FoodPostReservationDto dto)
    {
        try
        {

            ReservationResponse response = await client.reserveAsync(new FoodPostReservation{
                FoodpostId = dto.FoodPostId,
                Username = dto.Username
            });
            // Response is unused because it is filler
        }
        catch (Exception e)
        {
            Console.WriteLine("GRPC CLIENT: " + e);

            throw;
        }
    }
}