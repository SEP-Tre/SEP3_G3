namespace Domain.DTOs;

public class OverSimpleFoodPostDto
{
    public OverSimpleFoodPostDto()
    {
    }

    public OverSimpleFoodPostDto(string title, string category)
    {
        Title = title;
        Category = category;
    }

    public string Title { get; set; }
    public string Category { get; set; }
}