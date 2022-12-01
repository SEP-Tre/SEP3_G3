using Domain.Classes;
using Google.Protobuf.WellKnownTypes;
using GrpcCL;
using GrpcClient.IConverters;

namespace GrpcClient.Converters;

public class FoodPostConverter : IFoodPostConverter
{
    public FoodPost getFoodPost(FoodPostResponse response)
    {
        DateTime timestampPosted = response.TimestampPosted.ToDateTime();
        Date sd = response.StartDate;
        Date ed = response.EndDate;
        Time st = response.StartTime;
        Time et = response.EndTime;

        /*
        DateOnly startDate = new DateOnly(sd.Year, sd.Month, sd.Day);
        DateOnly endDate = new DateOnly(ed.Year, ed.Month, ed.Day);
        TimeOnly startTime = new TimeOnly(st.Hour, st.Minutes);
        TimeOnly endTime = new TimeOnly(et.Hour, et.Minutes);
        */
        MyDate startDate = new MyDate(sd.Day, sd.Month, sd.Year);
        MyDate endDate = new MyDate(ed.Day, ed.Month, ed.Year);
        MyTime startTime = new MyTime(st.Hour, st.Minutes);
        MyTime endTime = new MyTime(et.Hour, et.Minutes);
        
        
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
}