package sep3.g3.rightoversjava.model;

public class UserCreationDTO {
    private String firstName;
    private String username;
    private String password;
    private AddressCreationDTO addressCreationDTO;

    public UserCreationDTO(String firstName, String userName, String password, String streetName, String streetNumber,
                           int postalCode, String cityName) {
        this.firstName = firstName;
        this.username = userName;
        this.password = password;
        this.addressCreationDTO = new AddressCreationDTO(streetNumber, streetName, cityName, postalCode);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public AddressCreationDTO getAddressCreationDTO() {
        return addressCreationDTO;
    }
}
