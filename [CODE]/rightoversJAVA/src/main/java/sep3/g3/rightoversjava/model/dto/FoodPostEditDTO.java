package sep3.g3.rightoversjava.model.dto;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;

public class FoodPostEditDTO {
    private final int id;
    private final String title;
    private final String category_;
    private final String description;
    private final String pictureUrl;
    private final int daysUntilExpired;
    private final String postState;
    private final Timestamp createdTimestamp;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final LocalTime startTime;
    private final LocalTime endTime;
    private final String username;

    public FoodPostEditDTO(int id, String title, String category_, String description, String pictureUrl, int daysUntilExpired, String postState, Timestamp createdTimestamp,LocalDate startDate, LocalDate endDate, LocalTime startTime, LocalTime endTime, String username) {
        this.id = id;
        this.title = title;
        this.category_ = category_;
        this.description = description;
        this.pictureUrl = pictureUrl;
        this.daysUntilExpired = daysUntilExpired;
        this.postState = postState;
        this.createdTimestamp = createdTimestamp;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.username = username;
    }

    public int getId() {
        return id;
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
}
