using Application.DAOInterfaces;
using Domain.Classes;
using Domain.DTOs;
using Grpc.Core;
using Grpc.Net.Client;
using GrpcCL;
using GrpcClient.IConverters;

namespace GrpcClient.DAOs;

public class FoodPostDao : IFoodPostDao
{
    private readonly static GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:9090", new GrpcChannelOptions
    {
        UnsafeUseInsecureChannelCallCredentials = true
    });

    private readonly static FoodPostService.FoodPostServiceClient client =
        new FoodPostService.FoodPostServiceClient(channel);

    private readonly IFoodPostConverter converter;

    public FoodPostDao(IFoodPostConverter converter)
    {
        this.converter = converter;
    }

    public async Task<FoodPost> Create(FoodPostCreationDto dto)
    {
        var response = await client.postAsync(new FoodPostRequest
        {
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

        var fp = converter.GetFoodPost(response);

        return fp;
    }

    public async Task<IEnumerable<FoodPost>> GetAsync()
    {
        // Missing an await, but where?
        var listHolder = new List<FoodPost>();
        AsyncServerStreamingCall<FoodPostResponse> response = client.getAllFoodPosts(new GetAllRequest
        {
            Filler = true
        });
        // Because it is a stream, lets make a Dto for the current one we are on
        await foreach (var message in response.ResponseStream.ReadAllAsync())
            if (message.Category != null && message.Title != null)
            {
                var fp = converter.GetFoodPost(message);
                listHolder.Add(fp);
            }

        return listHolder;
    }

    public async Task<IEnumerable<FoodPost>> GetAllFoodPostsByUser(string username)
    {
        var userRequest = new FPByUsernameRequest
        {
            Username = username
        };

        // Missing an await, but where?
        var listHolder = new List<FoodPost>();
        AsyncServerStreamingCall<FoodPostResponse> response = client.getFoodPostsByUsername(userRequest);
        // Because it is a stream, lets make a Dto for the current one we are on
        await foreach (var message in response.ResponseStream.ReadAllAsync())
            if (message.Category != null && message.Title != null)
            {
                var fp = converter.GetFoodPost(message);
                listHolder.Add(fp);
            }

        return listHolder;
    }

    public async Task<FoodPost> PickUp(PickUpDto dto)
    {
        var request = converter.GetPickUpRequestFromDto(dto);

        FoodPostResponse response = await client.pickUpAsync(request);
        FoodPost foodPost = converter.GetFoodPost(response);
        return foodPost;
    }

    public async Task DeleteAsync(int id)
    {
        await client.deleteAsync(new FoodPostID { Id = id });
    }


    public async Task<FoodPost> GetSingleAsync(int id)
    {
        var response = await client.getSingleFoodPostAsync(new FoodPostID
        {
            Id = id
        });

        var foodPost = converter.GetFoodPost(response);

        return foodPost;
    }

    public async Task Reserve(FoodPostReservationDto dto)
    {
        try
        {
            var response = await client.reserveAsync(new FoodPostReservation
            {
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

    public async Task<IEnumerable<FoodPost>> GetAllReportedPostsAsync()
    {
        try
        {
            // This is a filler request
            ReservationResponse filler = new ReservationResponse
            {
                Filler = true
            };
            var listHolder = new List<FoodPost>();
            AsyncServerStreamingCall<FoodPostResponse> response = client.getAllReportedPosts(filler);
            // Because it is a stream, lets make a Dto for the current one we are on
            await foreach (var message in response.ResponseStream.ReadAllAsync())
                if (message.Category != null && message.Title != null)
                {
                    var fp = converter.GetFoodPost(message);
                    listHolder.Add(fp);
                }

            return listHolder;
        }
        catch (Exception e)
        {
            Console.WriteLine(e);

            throw;
        }
    }
}