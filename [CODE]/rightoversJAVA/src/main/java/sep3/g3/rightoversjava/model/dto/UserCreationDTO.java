package sep3.g3.rightoversjava.model.dto;

public class UserCreationDTO {
    private String firstName;
    private String username;
    private String password;
    private AddressCreationDTO addressCreationDTO;
    private String phoneNumber;
    private boolean isBusiness;


    public UserCreationDTO(String firstName, String userName,
                           String password, int addressId, String streetName,
                           String streetNumber,
                           int postalCode, String cityName, double longitude, double latitude, boolean isBusiness, String phoneNumber) {
        this.firstName = firstName;
        this.username = userName;
        this.password = password;
        this.addressCreationDTO = new AddressCreationDTO(addressId,
                streetNumber, streetName, cityName, postalCode, longitude, latitude);
        this.isBusiness = isBusiness;
        this.phoneNumber=phoneNumber;

    }

    public UserCreationDTO() {
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

    public boolean isBusiness() {
        return isBusiness;
    }

    public void setIsBusiness(boolean isBusiness) {
        this.isBusiness = isBusiness;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


}
