namespace Domain.DTOs;

//NOTE: Added long and lat
public class AddressCreationDTO
{
    public int AddressId { get; set; }
    public string StreetNumber { get; set; }
    public string Street { get; set; }
    public int PostCode { get; set; }
    public string City { get; set; }
    public double Longitude { get; set; }
    public double Latitude { get; set; }

    public AddressCreationDTO(int addressId, string streetNumber, string street, int postCode, string city, double longitude, double latitude)
    {
        AddressId = addressId;
        StreetNumber = streetNumber;
        Street = street;
        PostCode = postCode;
        City = city;
        Longitude = longitude;
        Latitude = latitude;
    }

    public AddressCreationDTO(string streetNumber, string street, int postCode, string city)
    {
        StreetNumber = streetNumber;
        Street = street;
        PostCode = postCode;
        City = city;
    }

    public AddressCreationDTO()
    {

    }
}