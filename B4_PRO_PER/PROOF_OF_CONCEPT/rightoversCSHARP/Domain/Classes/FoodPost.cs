namespace Domain.Classes;

public class FoodPost
{
    public int PostId { get; }
    public string Title { get; }
    public string Category { get; }
    public string Description { get; }
    public string PictureUrl { get; }
    public int DaysUntilExpired { get; }
    public string PostState { get; }

    public FoodPost(int postId, string title, string category, string description, string pictureUrl, int daysUntilExpired, string postState)
    {
        PostId = postId;
        Title = title;
        Category = category;
        Description = description;
        PictureUrl = pictureUrl;
        DaysUntilExpired = daysUntilExpired;
        PostState = postState;
    }
}