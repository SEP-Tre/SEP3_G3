package sep3.g3.rightoversjava.model.dto;

public class ReportCreationDto
{
    private int foodPostId;
    private String comment;
    private String usernameReporting;

    public ReportCreationDto(int foodPostId, String comment, String usernameReporting)
    {
        this.foodPostId = foodPostId;
        this.comment = comment;
        this.usernameReporting = usernameReporting;
    }

    public int getFoodPostId()
    {
        return foodPostId;
    }

    public String getComment()
    {
        return comment;
    }

    public String getUsernameReporting()
    {
        return usernameReporting;
    }
}
