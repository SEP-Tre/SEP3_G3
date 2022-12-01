package sep3.g3.rightoversjava.model;

public class UserCreationDTO
{
    private String firstName;
    private String username;
    private String password;
    private AddressCreationDTO addressCreationDTO;
    private boolean isBusiness;

    public UserCreationDTO(String firstName, String userName,
                           String password, int addressId, String streetName,
                           String streetNumber,
                           int postalCode, String cityName, double longitude, double latitude, boolean isBusiness)
    {
        this.firstName = firstName;
        this.username = userName;
        this.password = password;
        this.addressCreationDTO = new AddressCreationDTO(addressId,
                streetNumber, streetName, cityName, postalCode, longitude, latitude);
        this.isBusiness = isBusiness;
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

    public boolean isBusiness() {
        return isBusiness;
    }
}
