package sep3.g3.rightoversjava.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Rating {
    //value int
    @Column(name = "value_")
    public int value;
    @Column(name = "comment_")
    public String comment;
    @Column(name = "rating_type")
    public String ratingType;
    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "username_rating")
    public User userRating;
    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "username_rated")
    public User userRated;
    @Id
    @GeneratedValue(generator = "rating-sequence-generator")
    @GenericGenerator(
            name = "rating-sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = "schema", value = "rightovers"),
                    @org.hibernate.annotations.Parameter(name = "sequence_name", value = "rating_rating_id_seq"),
                    @org.hibernate.annotations.Parameter(name = "initial_value", value = "2"),
                    @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
            }
    )
    private int ratingId;

    public Rating(int value, String comment, String ratingType, User userRating, User userRated) {
        this.value = value;
        this.comment = comment;
        this.ratingType = ratingType;
        this.userRating = userRating;
        this.userRated = userRated;
    }

    public Rating() {
    }

    public int getRatingId() {
        return ratingId;
    }

    public void setRatingId(int ratingId) {
        this.ratingId = ratingId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRatingType() {
        return ratingType;
    }

    public void setRatingType(String ratingType) {
        this.ratingType = ratingType;
    }

    public User getUserRating() {
        return userRating;
    }

    public void setUserRating(User userRating) {
        this.userRating = userRating;
    }

    public User getUserRated() {
        return userRated;
    }

    public void setUserRated(User userRated) {
        this.userRated = userRated;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "ratingId=" + ratingId +
                ", value=" + value +
                ", comment='" + comment + '\'' +
                ", ratingType='" + ratingType + '\'' +
                ", userRating=" + userRating +
                ", userRated=" + userRated +
                '}';
    }
}
