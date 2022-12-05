package sep3.g3.rightoversjava.model;

// Currently identical to address, but important for adjustment later
public class AddressCreationDTO {
    private int addressId;
    //String so we don't need an optional lettering after
    private String streetNumber;
    private String street;
    private String city;
    private int postCode;
    private double longitude;
    private double latitude;

    public AddressCreationDTO() {
    }

    //To be used by creation request
    public AddressCreationDTO(String streetNumber, String street, String city, int postCode) {
        this.streetNumber = streetNumber;
        this.street = street;
        this.city = city;
        this.postCode = postCode;
        // I did find a good way to initialize the other attributes - CF
    }

    public AddressCreationDTO(int addressId,String streetNumber, String street, String city, int postCode, double longitude, double latitude) {
        this.addressId=addressId;
        this.streetNumber = streetNumber;
        this.street = street;
        this.city = city;
        this.postCode = postCode;
        this.longitude = longitude;
        this.latitude = latitude;
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

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
