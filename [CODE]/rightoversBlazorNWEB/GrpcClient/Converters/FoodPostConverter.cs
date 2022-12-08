using Domain.Classes;
using Domain.DTOs;
using Google.Protobuf.WellKnownTypes;
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

    public FoodPostResponse GetFoodPostResponse(FoodPost foodPost)
    {
        Timestamp ts = Timestamp.FromDateTime(foodPost.TimestampPosted);
        Time st = new Time{
            Hour = foodPost.StartTime.Hour,
            Minutes = foodPost.StartTime.Minutes
        };
        Time et = new Time{
            Hour = foodPost.EndTime.Hour,
            Minutes = foodPost.EndTime.Minutes
        };
        Date sd = new Date{
            Day = foodPost.StartDate.Day,
            Month = foodPost.StartDate.Month,
            Year = foodPost.StartDate.Year
        };
        Date ed = new Date
        {
            Day = foodPost.EndDate.Day,
            Month = foodPost.EndDate.Month,
            Year = foodPost.EndDate.Year
        };
        FoodPostResponse response = new FoodPostResponse{
            Title = foodPost.Title,
            Category = foodPost.Category,
            DaysUntilExpired = foodPost.DaysUntilExpired,
            Description = foodPost.Description,
            EndDate = ed,
            EndTime = et,
            FpId = foodPost.PostId,
            FpState = foodPost.PostState,
            PictureUrl = foodPost.PictureUrl,
            StartDate = sd,
            StartTime = st,
            TimestampPosted = ts,
            Username = foodPost.User.UserName
        };

        return response;
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
        Report report = new Report(message.PostId, message.Comment, message.UsernameReporting, message.ReportId);
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