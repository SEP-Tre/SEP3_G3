package sep3.g3.rightoversjava.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import sep3.g3.rightoversjava.model.dto.AddressCreationDTO;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(generator = "address_sequence-generator")
    @GenericGenerator(
            name = "address_sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "schema", value = "rightovers"),
                    @Parameter(name = "sequence_name", value = "address_address_id_seq"),
                    @Parameter(name = "initial_value", value = "8"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
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
        addressId = dto.getAddressId();
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
