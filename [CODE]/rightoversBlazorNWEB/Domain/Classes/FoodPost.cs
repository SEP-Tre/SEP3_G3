namespace Domain.Classes;

public class FoodPost
{
    public FoodPost(int postId, string title, string category, string description, string pictureUrl,
        int daysUntilExpired, string postState, DateTime timestampPosted, MyDate startDate, MyDate endDate,
        MyTime startTime, MyTime endTime, User user)
    {
        PostId = postId;
        Title = title; //1
        Category = category; //2
        Description = description;
        PictureUrl = pictureUrl; //3
        DaysUntilExpired = daysUntilExpired;
        PostState = postState;
        TimestampPosted = timestampPosted;
        StartDate = startDate;
        EndDate = endDate;
        StartTime = startTime; //4 togela
        EndTime = endTime; //4 togela
        User = user; //5 username
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

    public override string ToString()
    {
        return $"PostId: {PostId}, Title: {Title}, Category: {Category}, Description: {Description}, PictureUrl: {PictureUrl}, DaysUntilExpired: {DaysUntilExpired}, PostState: {PostState}, TimestampPosted: {TimestampPosted}, StartDate: {StartDate}, EndDate: {EndDate}, StartTime: {StartTime}, EndTime: {EndTime}, User: {User}";
    }
}