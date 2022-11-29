namespace Domain.DTOs;

public class FoodPostReservationDto
{
    public string Username { get; set; }
    public int FoodPostId { get; set; }

    public FoodPostReservationDto(string username, int foodPostId)
    {
        Username = username;
        FoodPostId = foodPostId;
    }
}