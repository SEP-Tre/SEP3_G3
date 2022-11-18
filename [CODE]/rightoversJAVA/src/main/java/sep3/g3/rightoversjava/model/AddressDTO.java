package sep3.g3.rightoversjava.model;

// Currently identical to address, but important for adjustment later
public class AddressDTO {
    private int addressId;
    //String so we don't need an optional lettering after
    private String streetNumber;
    private String street;
    private String city;
    private int postCode;

    public AddressDTO() {
    }

    public AddressDTO(int addressId, String streetNumber, String street, String city, int postCode) {
        this.addressId = addressId;
        this.streetNumber = streetNumber;
        this.street = street;
        this.city = city;
        this.postCode = postCode;
    }

    //To be used by creation request
    public AddressDTO(String streetNumber, String street, String city, int postCode) {
        this.addressId = Integer.MAX_VALUE;
        this.streetNumber = streetNumber;
        this.street = street;
        this.city = city;
        this.postCode = postCode;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }
}
