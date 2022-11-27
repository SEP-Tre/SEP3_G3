package sep3.g3.rightoversjava.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    //String so we don't need an optional lettering after
    private String street;
    private String streetNumber;
    private String city;
    private int postCode;
    private double longitude;
    private double latitude;

    public Address() {
    }

    public Address(AddressCreationDTO dto) {
        street = dto.getStreet();
        streetNumber = dto.getStreetNumber();
        city = dto.getCity();
        postCode = dto.getPostCode();
        longitude = dto.getLongitude();
        latitude = dto.getLatitude();
    }

    public Address(int addressId, String streetNumber, String street, String city, int postCode) {
        this.addressId = addressId;
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
