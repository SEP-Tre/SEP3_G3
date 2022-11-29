namespace Domain.DTOs;

public class UserCreationDto
{
    public string FirstName { get; set; }
    public string UserName { get; set; }
    public string Password { get; set; }
    public AddressCreationDto AddressCreationDto { get; set; }

    public UserCreationDto(string firstName, string userName, string password, string streetName, string streetNumber,
        int postalCode, string cityName)
    {
        FirstName = firstName;
        UserName = userName;
        Password = password;
        AddressCreationDto = new AddressCreationDto(streetName, streetNumber, postalCode, cityName);
    }

    public UserCreationDto()
    {
        AddressCreationDto = new AddressCreationDto();
    }

    public string toString()
    {
        return
            $"First name: {FirstName}, User name: {UserName}, Password: {Password}, Address: {AddressCreationDto.toString()}";
    }
}