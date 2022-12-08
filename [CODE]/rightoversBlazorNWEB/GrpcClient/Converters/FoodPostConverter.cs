using Domain.Classes;
using Domain.DTOs;
using GrpcCL;
using GrpcClient.IConverters;

namespace GrpcClient.Converters;

public class FoodPostConverter : IFoodPostConverter
{
    public FoodPost GetFoodPost(FoodPostResponse response)
    {
        var timestampPosted = response.TimestampPosted.ToDateTime();
        var sd = response.StartDate;
        var ed = response.EndDate;
        var st = response.StartTime;
        var et = response.EndTime;

        /*
        DateOnly startDate = new DateOnly(sd.Year, sd.Month, sd.Day);
        DateOnly endDate = new DateOnly(ed.Year, ed.Month, ed.Day);
        TimeOnly startTime = new TimeOnly(st.Hour, st.Minutes);
        TimeOnly endTime = new TimeOnly(et.Hour, et.Minutes);
        */
        var startDate = new MyDate(sd.Day, sd.Month, sd.Year);
        var endDate = new MyDate(ed.Day, ed.Month, ed.Year);
        var startTime = new MyTime(st.Hour, st.Minutes);
        var endTime = new MyTime(et.Hour, et.Minutes);


        return new FoodPost(response.FpId,
            response.Title,
            response.Category,
            response.Description,
            response.PictureUrl,
            response.DaysUntilExpired,
            response.FpState,
            timestampPosted,
            startDate,
            endDate,
            startTime,
            endTime,
            new User(response.Username));
    }

    public PickUpRequest GetPickUpRequestFromDto(PickUpDto dto)
    {
        PickUpRequest request = new PickUpRequest
        {
            Id=dto.FoodPostId,
            Username = dto.UsernamePicking
        };
        return request;
    }

    public Report GetReportFromMessage(ReportMessage message)
    {
        Report report = new Report(message.PostId, message.Comment, message.UsernameReporting);
        return report;
    }

    public ReportMessage GetReportMessage(Report report)
    {
        ReportMessage reportMessage = new ReportMessage
        {
            PostId = report.FoodPostId,
            Comment = report.Comment,
            UsernameReporting = report.UsernameReporting
        };
        return reportMessage;
    }
}