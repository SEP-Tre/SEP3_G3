namespace Domain.DTOs;

public class FoodPostCreationDTO
{
    public string Title { get; }
    public string Category { get; }
    public string Description { get; }
    public string PictureUrl { get; }
    public int DaysUntilExpired { get; }

    public FoodPostCreationDTO(string title, string category, string description, string pictureUrl, int daysUntilExpired)
    {
        Title = title;
        Category = category;
        Description = description;
        PictureUrl = pictureUrl;
        DaysUntilExpired = daysUntilExpired;
    }
}