namespace Domain.DTOs;

public class FoodPostReservationDto
{
    public int UserId { get; set; }
    public int FoodPostId { get; set; }

    public FoodPostReservationDto()
    {
    }

    public FoodPostReservationDto(int userId, int foodPostId)
    {
        UserId = userId;
        FoodPostId = foodPostId;
    }
}