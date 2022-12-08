package sep3.g3.rightoversjava.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;

@Entity
public class Reservation {
    //TODO: Add more things like a timestamp

    @Id
    // The strategy below scales better, but must have the initial value set upon a batch update
    /*
    @GeneratedValue(generator = "sequence-generator")
    @GenericGenerator(
            name = "sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "user_sequence"),
                    @Parameter(name = "initial_value", value = "6"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
     */
    // Performance isn't as good, but we don't have to set the initial value
    @GeneratedValue(generator = "reservation-sequence-generator")
    @GenericGenerator(
            name = "reservation-sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "schema", value = "rightovers"),
                    @Parameter(name = "sequence_name", value = "reservation_reservation_id_seq"),
                    @Parameter(name = "initial_value", value = "5"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    private int reservationId;

    @JoinColumn(name = "post_id")
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE})
    private FoodPost foodPost;

    @JoinColumn(name = "username")
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE})
    private User user;

    public Reservation() {

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
