package sep3.g3.rightoversjava.model.dto;

public class ReservationCreationDto {
    private int foodPostId;
    private String username;

    public ReservationCreationDto() {
    }

    public ReservationCreationDto(int foodPostId, String username) {
        this.foodPostId = foodPostId;
        this.username = username;
    }

    public int getFoodPostId() {
        return foodPostId;
    }

    public void setFoodPostId(int foodPostId) {
        this.foodPostId = foodPostId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
