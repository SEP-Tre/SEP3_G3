namespace Domain.DTOs;

public class FoodPostReservationDto
{

    public FoodPostReservationDto(string username, int foodPostId)
    {
        Username = username;
        FoodPostId = foodPostId;
    }

    public string Username { get; set; }
    public int FoodPostId { get; set; }
}