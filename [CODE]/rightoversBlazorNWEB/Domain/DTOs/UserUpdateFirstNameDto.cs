namespace Domain.DTOs;

public class UserUpdateFirstNameDto
{
    public string Username { get; }
    public string NewFirstName { get; private set; }

    public UserUpdateFirstNameDto(string username, string newFirstName)
    {
        Username = username;
        NewFirstName = newFirstName;
    }
}