using Domain.Classes;
using GrpcCL;

namespace GrpcClient.IConverters;

public interface IFoodPostConverter
{
    FoodPost getFoodPost(FoodPostResponse response);
}