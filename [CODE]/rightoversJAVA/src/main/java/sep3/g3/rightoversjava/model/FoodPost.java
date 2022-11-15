package sep3.g3.rightoversjava.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="food_post")
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

    public FoodPost(int post_id, String title, String category, String description, String pictureUrl, int daysUntilExpired, String postState) {
        this.post_id = post_id;
        this.title = title;
        this.category_ = category;
        this.description = description;
        this.pictureUrl = pictureUrl;
        this.daysUntilExpired = daysUntilExpired;
        this.postState = postState;
    }

    public FoodPost(String title, String category, String description, String pictureUrl, int daysUntilExpired) {
        this.post_id = 0;
        this.title = title;
        this.category_ = category;
        this.description = description;
        this.pictureUrl = pictureUrl;
        this.daysUntilExpired = daysUntilExpired;
        this.postState = "posted";
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
