namespace Domain.DTOs;

public class OverSimpleFoodPostDto
{
    public OverSimpleFoodPostDto()
    {
    }

    public OverSimpleFoodPostDto(string title, string category, int id,int daysUntilExpired, string postState)
    {
        this.id = id;
        Title = title;
        Category = category;
        DaysUntilExpired = daysUntilExpired;
        Console.WriteLine(DaysUntilExpired);
    }

    public int id { get; set; }
    public string Title { get; set; }
    public string Category { get; set; }
    public int DaysUntilExpired { get; set; }
    
    public string PostState { get; set; }
    
}