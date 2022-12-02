public class Rating
{
    public string UsernameMakingRating { get; set; }
    public string UsernameBeingRated { get; set; }
    public int Value { get; set; }
    public string Comment { get; set; }
    public string TypeOfRating { get; set; }

    public Rating(string usernameMakingRating, string usernameBeingRated, int value, string comment, string typeOfRating)
    {
        this.UsernameMakingRating = usernameMakingRating;
        this.UsernameBeingRated = usernameBeingRated;
        this.Value = value;
        this.Comment = comment;
        this.TypeOfRating = typeOfRating;
    }
}