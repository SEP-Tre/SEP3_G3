namespace Domain.Classes;

public class Address
{
    public int Id  { get; set; }
    public string StreetName  { get; set; }
    public string StreetNumber  { get; set; }
    public int PostalCode  { get; set; }
    public string CityName  { get; set; }
    public double Longitude  { get; set; }
    public double Latitude  { get; set; }

    public Address(int id, string streetName, string streetNumber, int postalCode, string cityName, double longitude, double latitude)
    {
        Id = id;
        StreetName = streetName;
        StreetNumber = streetNumber;
        PostalCode = postalCode;
        CityName = cityName;
        Longitude = longitude;
        Latitude = latitude;
    }

    public Address()
    {
    }
}