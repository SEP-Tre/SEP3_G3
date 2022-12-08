package sep3.g3.rightoversjava.model.dto;

public class UserUpdateAddressDto {
    private String username;

    private String newStreetName;
    private String newStreetNumber;
    private int newPostalCode;
    private String newCity;

    public UserUpdateAddressDto(String username, String newStreetName, String newStreetNumber, int newPostalCode, String newCity) {
        this.username = username;
        this.newStreetName = newStreetName;
        this.newStreetNumber = newStreetNumber;
        this.newPostalCode = newPostalCode;
        this.newCity = newCity;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNewStreetName() {
        return newStreetName;
    }

    public void setNewStreetName(String newStreetName) {
        this.newStreetName = newStreetName;
    }

    public String getNewStreetNumber() {
        return newStreetNumber;
    }

    public void setNewStreetNumber(String newStreetNumber) {
        this.newStreetNumber = newStreetNumber;
    }

    public int getNewPostalCode() {
        return newPostalCode;
    }

    public void setNewPostalCode(int newPostalCode) {
        this.newPostalCode = newPostalCode;
    }

    public String getNewCity() {
        return newCity;
    }

    public void setNewCity(String newCity) {
        this.newCity = newCity;
    }
}
