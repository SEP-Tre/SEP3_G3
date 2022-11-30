namespace Domain.DTOs;

public class FoodPostCreationDto
{
    public FoodPostCreationDto(string title, string category, string description, string pictureUrl,
        int daysUntilExpired)
    {
        Title = title;
        Category = category;
        Description = description;
        PictureUrl = pictureUrl;
        DaysUntilExpired = daysUntilExpired;
    }

    public FoodPostCreationDto()
    {
    }

    public string Title { get; }
    public string Category { get; }
    public string Description { get; }
    public string PictureUrl { get; }
    public int DaysUntilExpired { get; }
}