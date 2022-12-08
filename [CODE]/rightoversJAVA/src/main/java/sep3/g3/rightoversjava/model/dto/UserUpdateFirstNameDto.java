package sep3.g3.rightoversjava.model.dto;

public class UserUpdateFirstNameDto {
    private String username;
    private String newFirstName;


    public UserUpdateFirstNameDto(String username, String newFirstName) {
        this.username = username;
        this.newFirstName = newFirstName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNewFirstName() {
        return newFirstName;
    }

    public void setNewFirstName(String newFirstName) {
        this.newFirstName = newFirstName;
    }
}
