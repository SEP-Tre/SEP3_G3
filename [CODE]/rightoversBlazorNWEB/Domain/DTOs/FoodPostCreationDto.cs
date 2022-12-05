using Domain.Classes;

namespace Domain.DTOs;

public class FoodPostCreationDto
{

    public FoodPostCreationDto(string title, string category, string description, string pictureUrl,
        int daysUntilExpired, MyDate startDate, MyDate endDate, MyTime startTime, MyTime endTime, string username)
    {
        Title = title;
        Category = category;
        Description = description;
        PictureUrl = pictureUrl;
        DaysUntilExpired = daysUntilExpired;
        StartDate = startDate;
        EndDate = endDate;
        StartTime = startTime;
        EndTime = endTime;
        Username = username;
    }

    public FoodPostCreationDto()
    {
    }

    public string Title { get; set; }
    public string Category { get; set; }
    public string Description { get; set; }
    public string PictureUrl { get; set; }
    public int DaysUntilExpired { get; set; }
    public MyDate StartDate { get; set; }
    public MyDate EndDate { get; set; }
    public MyTime StartTime { get; set; }
    public MyTime EndTime { get; set; }
    public string Username { get; set; }

    public override string ToString()
    {
        return
            $"Title: {Title}, Category: {Category}, Description: {Description}, PictureUrl: {PictureUrl}, DaysUntilExpired: {DaysUntilExpired}, StartDate: {StartDate}, EndDate: {EndDate}, StartTime: {StartTime}, EndTime: {EndTime}, Username: {Username}";
    }
}