using Domain.Classes;
using Domain.DTOs;
using GrpcCL;

namespace GrpcClient.IConverters;

public interface IFoodPostConverter
{
    FoodPost GetFoodPost(FoodPostResponse response);
    public FoodPostResponse GetFoodPostResponse(FoodPost foodPost);
    PickUpRequest GetPickUpRequestFromDto(PickUpDto dto);

    Report GetReportFromMessage(ReportMessage message);
    ReportMessage GetReportMessage(Report report);
}