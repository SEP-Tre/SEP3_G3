namespace Domain.DTOs;

public class AddressCreationDto
{
    public string StreetName  { get; set; }
    public string StreetNumber  { get; set; }
    public int PostalCode  { get; set; }
    public string CityName  { get; set; }

    public AddressCreationDto(string streetName, string streetNumber, int postalCode, string cityName)
    {
        StreetName = streetName;
        StreetNumber = streetNumber;
        PostalCode = postalCode;
        CityName = cityName;
    }

    public AddressCreationDto()
    {
    }
}