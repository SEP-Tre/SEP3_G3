using Domain.Classes;
using GrpcCL;
using GrpcClient.IConverters;

namespace GrpcClient.Converters;

public class FoodPostConverter : IFoodPostConverter
{
    public FoodPost getFoodPost(FoodPostResponse response)
    {
        return new FoodPost(response.FpId, response.Title, response.Category, response.Description,
            response.PictureUrl,response.DaysUntilExpired, response.FpState);
    }
}