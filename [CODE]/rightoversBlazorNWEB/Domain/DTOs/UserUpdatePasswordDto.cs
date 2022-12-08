namespace Domain.DTOs;

public class UserUpdatePasswordDto
{
    public string Username { get; }
    public string OldPassword { get; private set; }
    public string NewPassword { get; private set; }

    public UserUpdatePasswordDto(string username, string oldPassword, string newPassword)
    {
        Username = username;
        OldPassword = oldPassword;
        NewPassword = newPassword;
    }
}