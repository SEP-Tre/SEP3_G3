namespace Domain.DTOs;

//NOTE: Added long and lat
public class AddressDTO
{
    public int AddressId { get; set; }
    public string StreetNumber { get; set; }
    public string Street { get; set; }
    public int PostCode { get; set; }
    public string City { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }

    public AddressDTO(int addressId, string streetNumber, string street, int postCode, string city)
    {
        AddressId = addressId;
        StreetNumber = streetNumber;
        Street = street;
        PostCode = postCode;
        City = city;
    }

    public AddressDTO(string streetNumber, string street, int postCode, string city)
    {
        StreetNumber = streetNumber;
        Street = street;
        PostCode = postCode;
        City = city;
    }

    public AddressDTO()
    {
        
    }
}