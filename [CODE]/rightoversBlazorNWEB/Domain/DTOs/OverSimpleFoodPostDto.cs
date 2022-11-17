namespace Domain.DTOs;

public class OverSimpleFoodPostDto
{
    public OverSimpleFoodPostDto()
    {
    }

    public OverSimpleFoodPostDto(string title, string category, int id)
    {
        this.id = id;
        Title = title;
        Category = category;
    }

    public int id { get; set; }
    public string Title { get; set; }
    public string Category { get; set; }
}