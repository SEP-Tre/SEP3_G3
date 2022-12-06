namespace Domain.Classes;

public class Rating
{

    public Rating(string usernameMakingRating, string usernameBeingRated, int value, string comment,
        string typeOfRating)
    {
        UsernameMakingRating = usernameMakingRating;
        UsernameBeingRated = usernameBeingRated;
        Value = value;
        Comment = comment;
        TypeOfRating = typeOfRating;
    }

    public string UsernameMakingRating { get; set; }
    public string UsernameBeingRated { get; set; }
    public int Value { get; set; }
    public string Comment { get; set; }
    public string TypeOfRating { get; set; }

    public override string ToString()
    {
        return $"UsernameMakingRating: {UsernameMakingRating}, UsernameBeingRated: {UsernameBeingRated}, Value: {Value}, Comment: {Comment}, TypeOfRating: {TypeOfRating}";
    }
    
    
}