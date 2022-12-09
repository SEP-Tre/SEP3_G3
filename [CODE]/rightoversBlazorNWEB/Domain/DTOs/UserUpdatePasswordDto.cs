namespace Domain.DTOs;

public class UserUpdatePasswordDto
{
    public string Username { get; }
    public string OldPassword { get; }
    public string NewPassword { get; }

    public UserUpdatePasswordDto(string username, string oldPassword, string newPassword)
    {
        Username = username;
        OldPassword = oldPassword;
        NewPassword = newPassword;
    }
}