namespace Domain.DTOs;

//NOTE: Added long and lat
public class AddressCreationDto
{

    public AddressCreationDto(int addressId, string streetNumber, string street, int postCode, string city,
        double longitude, double latitude)
    {
        AddressId = addressId;
        StreetNumber = streetNumber;
        Street = street;
        PostCode = postCode;
        City = city;
        Longitude = longitude;
        Latitude = latitude;
    }

    public AddressCreationDto(string streetNumber, string street, int postCode, string city)
    {
        StreetNumber = streetNumber;
        Street = street;
        PostCode = postCode;
        City = city;
    }

    public AddressCreationDto()
    {
        AddressId = 0;
        Longitude = 0;
        Latitude = 0;
    }

    public int AddressId { get; set; }
    public string StreetNumber { get; set; }
    public string Street { get; set; }
    public int PostCode { get; set; }
    public string City { get; set; }
    public double Longitude { get; set; }
    public double Latitude { get; set; }

    public string toString()
    {
        return $"ID: {AddressId}, Street: {Street}, StreetNumber: {StreetNumber}, \n" +
               $"PostCode: {PostCode}, City: {City}, Long: {Longitude}, Lati: {Latitude}";
    }
}