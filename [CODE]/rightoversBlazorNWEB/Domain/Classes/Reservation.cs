namespace Domain.Classes;

public class Reservation
{
    public int ReservationId { get; set; }
    public FoodPost FoodPost { get; set; }
    public User User { get; set; }

    public Reservation(int reservationId, FoodPost foodPost, User user)
    {
        ReservationId = reservationId;
        FoodPost = foodPost;
        User = user;
    }
}