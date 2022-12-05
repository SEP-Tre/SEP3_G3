package sep3.g3.rightoversjava.model;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
