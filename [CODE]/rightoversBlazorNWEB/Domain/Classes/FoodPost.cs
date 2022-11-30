using System.Text.Json.Serialization;
using AspNetCoreDateAndTimeOnly.Json;

namespace Domain.Classes;

public class FoodPost
{
    public FoodPost(int postId, string title, string category, string description, string pictureUrl,
        int daysUntilExpired, string postState, DateTime timestampPosted, MyDate startDate, MyDate endDate,
        MyTime startTime, MyTime endTime, User user)
    {
        PostId = postId;
        Title = title;
        Category = category;
        Description = description;
        PictureUrl = pictureUrl;
        DaysUntilExpired = daysUntilExpired;
        PostState = postState;
        TimestampPosted = timestampPosted;
        StartDate = startDate;
        EndDate = endDate;
        StartTime = startTime;
        EndTime = endTime;
        User = user;
    }

    public FoodPost()
    {
    }

    public int PostId { get; set; }
    public string Title { get; set; }
    public string Category { get; set; }
    public string Description { get; set; }
    public string PictureUrl { get; set; }
    public int DaysUntilExpired { get; set; }
    public string PostState { get; set; }
    public DateTime TimestampPosted { get; set; }

    public MyDate StartDate { get; set; }

    public MyDate EndDate { get; set; }

    public MyTime StartTime { get; set; }

    public MyTime EndTime { get; set; }

    public User User { get; set; }
}