package sep3.g3.rightoversjava.model.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class FoodPostCreationDTO {

    private final String title;
    private final String category_;
    private final String description;
    private final String pictureUrl;
    private final int daysUntilExpired;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final LocalTime startTime;
    private final LocalTime endTime;
    private final String username;

    public FoodPostCreationDTO(String title, String category_, String description, String pictureUrl, int daysUntilExpired, LocalDate startDate, LocalDate endDate, LocalTime startTime, LocalTime endTime, String username) {
        this.title = title;
        this.category_ = category_;
        this.description = description;
        this.pictureUrl = pictureUrl;
        this.daysUntilExpired = daysUntilExpired;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.username = username;
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

    public String getUsername() {
        return username;
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
