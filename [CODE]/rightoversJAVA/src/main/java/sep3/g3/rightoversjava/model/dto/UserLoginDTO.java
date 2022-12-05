package sep3.g3.rightoversjava.model.dto;

public class UserLoginDTO {
    private final String username;
    private final String password;

    public UserLoginDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
