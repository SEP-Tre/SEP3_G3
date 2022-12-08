namespace Domain.Classes;

public class User
{

    public User(int id, string firstName, string userName, string password, Address address, bool isBusiness, string phoneNumber)
    {
        Id = id;
        FirstName = firstName;
        UserName = userName;
        Password = password;
        Address = address;
        IsBusiness = isBusiness;
        PhoneNumber = phoneNumber;
    }

    public User(string userName)
    {
        UserName = userName;
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
    
    public string PhoneNumber { get; set; }

    public override string ToString()
    {
        return $"Id: {Id}, FirstName: {FirstName}, UserName: {UserName}, Password: {Password}, Address: {Address}, IsBusiness: {IsBusiness}, PhoneNumber: {PhoneNumber}";
    }
}