package sep3.g3.rightoversjava.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Report
{
    @Id
    @GeneratedValue(generator = "report-sequence-generator")
    @GenericGenerator(
            name = "report-sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = "schema", value = "rightovers"),
                    @org.hibernate.annotations.Parameter(name = "sequence_name", value = "report_report_id_seq"),
                    @org.hibernate.annotations.Parameter(name = "initial_value", value = "12"),
                    @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
            }
    )
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
