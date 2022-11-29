namespace Domain.Classes;

public class FoodPost
{
    public FoodPost(int postId, string title, string category, string description, string pictureUrl,
        int daysUntilExpired, string postState)
    {
        PostId = postId;
        Title = title;
        Category = category;
        Description = description;
        PictureUrl = pictureUrl;
        DaysUntilExpired = daysUntilExpired;
        PostState = postState;
    }

    public FoodPost()
    {
    }

    public int PostId { get; set; }
    public string Title  { get; set; }
    public string Category  { get; set; }
    public string Description  { get; set; }
    public string PictureUrl  { get; set; }
    public int DaysUntilExpired  { get; set; }
    public string PostState  { get; set; }
}