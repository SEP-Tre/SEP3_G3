using Application.DAOInterfaces;
using Domain.Classes;
using Domain.DTOs;
using Grpc.Core;
using Grpc.Net.Client;

namespace GrpcCL.DAOs;

public class FoodPostDao : IFoodPostDao
{
    private static GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:9090", new GrpcChannelOptions
    {
        UnsafeUseInsecureChannelCallCredentials = true
    });
    
    private static FoodPostService.FoodPostServiceClient client = new(channel);

    public async Task<FoodPost> Create(FoodPostCreationDTO dto)
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
        AsyncServerStreamingCall<FoodPostResponse> response = client.getAllFoodPosts(new GetAllRequest{
            Filler = true
        });
        // Because it is a stream, lets make a Dto for the current one we are on
        await foreach (var message in response.ResponseStream.ReadAllAsync())
        {
            if (message.Category != null && message.Title != null)
            {
                OverSimpleFoodPostDto simpleFoodPostDto = new OverSimpleFoodPostDto{
                    Title = message.Title,
                    Category = message.Category
                };
                listHolder.Add(simpleFoodPostDto);
                Console.WriteLine("I found a post: " + simpleFoodPostDto.Title + " : " + simpleFoodPostDto.Category);
            }
        }
        return listHolder;
    }
}