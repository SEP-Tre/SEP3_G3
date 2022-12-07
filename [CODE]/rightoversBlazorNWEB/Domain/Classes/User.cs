namespace Domain.Classes;

public class User
{

    public User(int id, string firstName, string userName, string password, Address address, bool isBusiness)
    {
        Id = id;
        FirstName = firstName;
        UserName = userName;
        Password = password;
        Address = address;
        IsBusiness = isBusiness;
    }

    public User(string userName)
    {
        UserName = userName;
        Id = 0;
        FirstName = "holder";
        Password = "12345";
        Address = new Address("2", "Torvet", 8700, "Horsens");
        IsBusiness = false;
    }

    public User()
    {
    }

    public int Id { get; set; }
    public string FirstName { get; set; }

    public string UserName { get; set; }

    //public PasswordDeriveBytes Password  { get; set; } To be discovered later
    public string Password { get; set; }

    public Address Address { get; set; }

    public bool IsBusiness { get; set; }
}