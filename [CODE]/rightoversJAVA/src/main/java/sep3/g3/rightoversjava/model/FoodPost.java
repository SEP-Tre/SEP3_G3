package sep3.g3.rightoversjava.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

@Entity
@Table(name = "food_post")
public class FoodPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int post_id;
    private String title;
    private String category_;
    private String description;
    private String pictureUrl;
    private int daysUntilExpired;
    private String postState;
    @Column(name = "timestamp_posted", columnDefinition = "TIMESTAMP")
    private Timestamp timestamp_posted;
    @Column(name = "pickup_start_date", columnDefinition = "DATE")
    private LocalDate startDate;
    @Column(name = "pickup_end_date", columnDefinition = "DATE")
    private LocalDate endDate;
    @Column(name = "pickup_start_time", columnDefinition = "TIME")
    private LocalTime startTime;
    @Column(name = "pickup_end_time", columnDefinition = "TIME")
    private LocalTime endTime;
    @ManyToOne
    @JoinColumn(name = "username")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public FoodPost(int post_id, String title, String category_, String description, String pictureUrl, int daysUntilExpired, String postState, Timestamp timestamp_posted, LocalDate startDate, LocalDate endDate, LocalTime startTime, LocalTime endTime, User user) {
        this.post_id = post_id;
        this.title = title;
        this.category_ = category_;
        this.description = description;
        this.pictureUrl = pictureUrl;
        this.daysUntilExpired = daysUntilExpired;
        this.postState = postState;
        this.timestamp_posted = timestamp_posted;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.user = user;
    }

    public FoodPost(FoodPostCreationDTO dto) {
        this.title = dto.getTitle();
        this.category_ = dto.getCategory_();
        this.description = dto.getDescription();
        this.pictureUrl = dto.getPictureUrl();
        this.daysUntilExpired = dto.getDaysUntilExpired();
        this.postState = "posted";
        this.timestamp_posted = Timestamp.valueOf(LocalDateTime.now());
        this.startDate = dto.getStartDate();
        this.endDate = dto.getEndDate();
        this.startTime = dto.getStartTime();
        this.endTime = dto.getEndTime();
        this.user = new User(dto.getUsername()); //TODO this feels wrong but oh well
    }

    public FoodPost() {

    }

    public int getPost_id() {
        return post_id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory_() {
        return category_;
    }

    public String getDescription() {
        return description;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public int getDaysUntilExpired() {
        return daysUntilExpired;
    }

    public String getPostState() {
        return postState;
    }

    // TODO: Change to enum for validation
    public void setPostState(String postState) {
        this.postState = postState;
    }

    public Timestamp getTimestamp_posted() {
        return timestamp_posted;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FoodPost foodPost)) return false;

        if (post_id != foodPost.post_id) return false;
        if (daysUntilExpired != foodPost.daysUntilExpired) return false;
        if (!Objects.equals(title, foodPost.title)) return false;
        if (!Objects.equals(category_, foodPost.category_)) return false;
        if (!Objects.equals(description, foodPost.description))
            return false;
        if (!Objects.equals(pictureUrl, foodPost.pictureUrl)) return false;
        return Objects.equals(postState, foodPost.postState);
    }

    @Override
    public String toString() {
        return "FoodPost{" +
                "post_id=" + post_id +
                ", title='" + title + '\'' +
                ", category='" + category_ + '\'' +
                ", description='" + description + '\'' +
                ", pictureUrl='" + pictureUrl + '\'' +
                ", daysUntilExpired=" + daysUntilExpired +
                ", postState='" + postState + '\'' +
                '}';
    }
}
