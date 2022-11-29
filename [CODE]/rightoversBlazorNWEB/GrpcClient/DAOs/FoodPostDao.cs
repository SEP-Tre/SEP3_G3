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
    private static GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:9090", new GrpcChannelOptions
    {
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
        FoodPostResponse response = await client.postAsync(new FoodPostRequest
        {
            Category = dto.Category,
            DaysUntilExpired = dto.DaysUntilExpired,
            Description = dto.Description,
            PictureUrl = dto.PictureUrl,
            Title = dto.Title
        });

        FoodPost fp = new FoodPost(response.FpId, response.Title, response.Category, response.Category,
            response.PictureUrl, response.DaysUntilExpired, response.FpState);

        return fp;
    }

    public async Task<IEnumerable<OverSimpleFoodPostDto>> GetAsync()
    {
        // Missing an await, but where?
        List<OverSimpleFoodPostDto> listHolder = new List<OverSimpleFoodPostDto>();
        AsyncServerStreamingCall<FoodPostResponse> response = client.getAllFoodPosts(new GetAllRequest
        {
            Filler = true
        });
        // Because it is a stream, lets make a Dto for the current one we are on
        await foreach (var message in response.ResponseStream.ReadAllAsync())
        {
            Console.WriteLine($"This is found id: {message.FpId}");
            if (message.Category != null && message.Title != null)
            {
                OverSimpleFoodPostDto simpleFoodPostDto = new OverSimpleFoodPostDto
                {
                    id = message.FpId,
                    Title = message.Title,
                    Category = message.Category,
                    DaysUntilExpired = message.DaysUntilExpired
                };
                listHolder.Add(simpleFoodPostDto);
                Console.WriteLine("I found a post: " + simpleFoodPostDto.Title + " : " + simpleFoodPostDto.Category);
            }
        }

        return listHolder;
    }

    public async Task<FoodPost> GetSingleAsync(int id)
    {
        FoodPostResponse response = await client.getSingleFoodPostAsync(new FoodPostID
        {
            Id = id
        });

        FoodPost foodPost = converter.getFoodPost(response);
        return foodPost;
    }
    
    public async Task Reserve(FoodPostReservationDto dto)
    {
        ReservationResponse response = await client.reserveAsync(new FoodPostReservation
        {
            FoodpostId = dto.FoodPostId,
            Username = dto.Username
        });
        // Response is unused because it is filler
    }
}