namespace Domain.Classes;

public class Report
{
    public int FoodPostId { get; set; }
    public string Comment { get; set; }
    public string UsernameReporting { get; set; }

    public Report(int foodPostId, string comment, string usernameReporting)
    {
        FoodPostId = foodPostId;
        Comment = comment;
        UsernameReporting = usernameReporting;
    }

    public Report()
    {
    }
}