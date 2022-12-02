using Domain.Classes;
using GrpcCL;

namespace GrpcClient.IConverters;

public interface IFoodPostConverter
{
    FoodPost GetFoodPost(FoodPostResponse response);
}