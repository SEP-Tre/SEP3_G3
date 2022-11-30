using System.Net.NetworkInformation;
using System.Security.Cryptography;

namespace Domain.Classes;

public class User
{
    public int Id { get; set; }
    public string FirstName { get; set; }

    public string UserName { get; set; }

    //public PasswordDeriveBytes Password  { get; set; } To be discovered later
    public string Password { get; set; }

    public Address Address { get; set; }

    public User(int id, string firstName, string userName, string password, Address address)
    {
        Id = id;
        FirstName = firstName;
        UserName = userName;
        Password = password;
        Address = address;
    }

    public User()
    {
    }
}