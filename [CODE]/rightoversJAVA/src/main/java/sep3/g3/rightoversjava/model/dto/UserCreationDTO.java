package sep3.g3.rightoversjava.model.dto;

public class UserCreationDTO
{
    private String firstName;
    private String username;
    private String password;
    private AddressCreationDTO addressCreationDTO;

    public UserCreationDTO(String firstName, String userName,
                           String password, int addressId, String streetName,
                           String streetNumber,
                           int postalCode, String cityName, double longitude, double latitude)
    {
        this.firstName = firstName;
        this.username = userName;
        this.password = password;
        this.addressCreationDTO = new AddressCreationDTO(addressId,
                streetNumber, streetName, cityName, postalCode, longitude, latitude);
    }

    public UserCreationDTO()
    {
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public AddressCreationDTO getAddressCreationDTO()
    {
        return addressCreationDTO;
    }
}
