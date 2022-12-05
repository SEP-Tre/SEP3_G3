namespace Domain.DTOs;

public class PickUpDto
{
    public int FoodPostId { get; set; }
    public string  UsernamePicking { get; set; }

    public PickUpDto(int foodPostId, string usernamePicking)
    {
        FoodPostId = foodPostId;
        UsernamePicking = usernamePicking;
    }

    public PickUpDto()
    {
    }
}