package sep3.g3.rightoversjava.model.dto;

public class RatingCreationDto
{
    public int value;
    public String comment;
    public String ratingType;
    public String usernameRating;
    public String usernameRated;

    public RatingCreationDto(int value, String comment, String ratingType, String usernameRating, String usernameRated)
    {
        this.value = value;
        this.comment = comment;
        this.ratingType = ratingType;
        this.usernameRating = usernameRating;
        this.usernameRated = usernameRated;
    }

    public RatingCreationDto()
    {
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public String getComment()
    {
        return comment;
    }

    public void setComment(String comment)
    {
        this.comment = comment;
    }

    public String getRatingType()
    {
        return ratingType;
    }

    public void setRatingType(String ratingType)
    {
        this.ratingType = ratingType;
    }

    public String getUsernameRating()
    {
        return usernameRating;
    }

    public void setUsernameRating(String usernameRating)
    {
        this.usernameRating = usernameRating;
    }

    public String getUsernameRated()
    {
        return usernameRated;
    }

    public void setUsernameRated(String usernameRated)
    {
        this.usernameRated = usernameRated;
    }
}
