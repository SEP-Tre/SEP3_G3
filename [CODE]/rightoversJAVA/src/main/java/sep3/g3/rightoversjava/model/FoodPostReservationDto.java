package sep3.g3.rightoversjava.model;

public class FoodPostReservationDto {
    // TODO: Make join table when the user entity is made for the DB
    public int userId;
    public int foodPostId;

    public FoodPostReservationDto() {
    }

    public FoodPostReservationDto(int userId, int foodPostId) {
        this.userId = userId;
        this.foodPostId = foodPostId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getFoodPostId() {
        return foodPostId;
    }

    public void setFoodPostId(int foodPostId) {
        this.foodPostId = foodPostId;
    }
}
