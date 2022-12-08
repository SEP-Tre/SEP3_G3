package sep3.g3.rightoversjava.model;

import javax.persistence.*;

@Entity
public class Report
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reportId;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "post_id")
    public FoodPost foodPost;

    @Column(name = "comment_")
    public String comment;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "username_reporting")
    public User userReporting;

    public Report(int reportId, FoodPost foodPost, String comment, User userReporting)
    {
        this.reportId = reportId;
        this.foodPost = foodPost;
        this.comment = comment;
        this.userReporting = userReporting;
    }

    public Report()
    {

    }


    public int getReportId()
    {
        return reportId;
    }

    public void setReportId(int reportId)
    {
        this.reportId = reportId;
    }

    public FoodPost getFoodPost()
    {
        return foodPost;
    }

    public void setFoodPost(FoodPost foodPost)
    {
        this.foodPost = foodPost;
    }

    public String getComment()
    {
        return comment;
    }

    public void setComment(String comment)
    {
        this.comment = comment;
    }

    public User getUserReporting()
    {
        return userReporting;
    }

    public void setUserReporting(User userReporting)
    {
        this.userReporting = userReporting;
    }
}
