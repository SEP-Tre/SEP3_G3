package sep3.g3.rightoversjava.model;

import javax.persistence.*;

@Entity
public class Reservation {
    //TODO: Add more things like a timestamp

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reservationId;

    @JoinColumn(name="post_id")
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE})
    private FoodPost foodPost;

    @JoinColumn(name="username")
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE})
    private User user;

    public Reservation(){

    }

    public Reservation(int reservationId, FoodPost foodPost, User user) {
        this.reservationId = reservationId;
        this.foodPost = foodPost;
        this.user = user;
    }

    public Reservation(FoodPost foodPost, User user) {
        this.foodPost = foodPost;
        this.user = user;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int id) {
        this.reservationId = id;
    }

    public FoodPost getFoodPost() {
        return foodPost;
    }

    public void setFoodPost(FoodPost foodPost) {
        this.foodPost = foodPost;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
