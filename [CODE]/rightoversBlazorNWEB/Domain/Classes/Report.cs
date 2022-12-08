namespace Domain.Classes;

public class Report
{
    public int FoodPostId { get; set; }
    public string Comment { get; set; }
    public string UsernameReporting { get; set; }
    
    public int ReportId { get; set; }

    public Report(int foodPostId, string comment, string usernameReporting)
    {
        ReportId = 0;
        FoodPostId = foodPostId;
        Comment = comment;
        UsernameReporting = usernameReporting;
    }

    public Report(int foodPostId, string comment, string usernameReporting, int reportId)
    {
        FoodPostId = foodPostId;
        Comment = comment;
        UsernameReporting = usernameReporting;
        ReportId = reportId;
    }

    public Report()
    {
    }
}