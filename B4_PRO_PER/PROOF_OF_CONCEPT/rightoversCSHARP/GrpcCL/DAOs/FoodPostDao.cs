using Application.DAOInterfaces;
using Domain.Classes;
using Domain.DTOs;
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
}