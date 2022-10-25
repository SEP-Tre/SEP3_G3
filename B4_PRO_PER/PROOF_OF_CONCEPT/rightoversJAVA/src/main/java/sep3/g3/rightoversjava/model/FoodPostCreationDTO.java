package sep3.g3.rightoversjava.model;

public class FoodPostCreationDTO {

    private String title;
    private String category_;
    private String description;
    private String pictureUrl;
    private int daysUntilExpired;

    public FoodPostCreationDTO(String title, String category, String description, String pictureUrl, int daysUntilExpired) {
        this.title = title;
        this.category_ = category;
        this.description = description;
        this.pictureUrl = pictureUrl;
        this.daysUntilExpired = daysUntilExpired;
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

    @Override
    public String toString() {
        return "FoodPostCreationDTO{" +
                "title='" + title + '\'' +
                ", category_='" + category_ + '\'' +
                ", description='" + description + '\'' +
                ", pictureUrl='" + pictureUrl + '\'' +
                ", daysUntilExpired=" + daysUntilExpired +
                '}';
    }
}
