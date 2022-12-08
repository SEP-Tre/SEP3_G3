package sep3.g3.rightoversjava.model.dto;

public class UserUpdatePhoneNumberDto {
    private String username;
    private String newPhoneNumber;

    public UserUpdatePhoneNumberDto(String username, String newPhoneNumber) {
        this.username = username;
        this.newPhoneNumber = newPhoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNewPhoneNumber() {
        return newPhoneNumber;
    }

    public void setNewPhoneNumber(String newPhoneNumber) {
        this.newPhoneNumber = newPhoneNumber;
    }
}
