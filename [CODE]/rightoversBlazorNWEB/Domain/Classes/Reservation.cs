namespace Domain.Classes;

public class Reservation
{

    public Reservation(int reservationId, FoodPost foodPost, User user)
    {
        ReservationId = reservationId;
        FoodPost = foodPost;
        User = user;
    }

    public Reservation()
    {
        
    }

    public int ReservationId { get; set; }
    public FoodPost FoodPost { get; set; }
    public User User { get; set; }
}