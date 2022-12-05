namespace Domain.DTOs;

public class UserLoginDto
{

    public UserLoginDto(string userName, string password)
    {
        UserName = userName;
        Password = password;
    }

    public UserLoginDto()
    {
    }

    public string UserName { get; set; }
    public string Password { get; set; }
}