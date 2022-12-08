namespace Domain.DTOs;

public class UserUpdateAddressDto
{
    public string Username { get; }
    public string NewStreetName { get; private set; }
    public string NewStreetNumber { get; private set; }
    public int NewPostalCode { get; private set; }
    public string NewCity { get; private set; }

    public UserUpdateAddressDto(string username, string newStreetName, string newStreetNumber, int newPostalCode, string newCity)
    {
        Username = username;
        NewStreetName = newStreetName;
        NewStreetNumber = newStreetNumber;
        NewPostalCode = newPostalCode;
        NewCity = newCity;
    }
}