namespace Domain.Classes;

public class Address
{
    public int AddressId { get; set; }
    public string StreetNumber { get; set; }
    public string Street { get; set; }
    public int PostCode { get; set; }
    public string City { get; set; }
    public double Longitude { get; set; }
    public double Latitude { get; set; }

    public Address(int addressId, string streetNumber, string street, int postCode, string city, double longitude,
        double latitude)
    {
        AddressId = addressId;
        StreetNumber = streetNumber;
        Street = street;
        PostCode = postCode;
        City = city;
        Longitude = longitude;
        Latitude = latitude;
    }

    public Address(int addressId, string streetNumber, string street, int postCode, string city)
    {
        AddressId = addressId;
        StreetNumber = streetNumber;
        Street = street;
        PostCode = postCode;
        City = city;
    }

    public Address(string streetNumber, string street, int postCode, string city)
    {
        StreetNumber = streetNumber;
        Street = street;
        PostCode = postCode;
        City = city;
    }

    public Address()
    {
    }
}