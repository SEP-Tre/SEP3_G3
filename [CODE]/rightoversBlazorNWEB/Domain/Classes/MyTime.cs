namespace Domain.Classes;

public class MyTime
{

    public MyTime(int hour, int minutes)
    {
        Hour = hour;
        Minutes = minutes;
    }

    public int Hour { get; set; }
    public int Minutes { get; set; }

    public string ToString()
    {
        string s = "";
        s += Hour;
        s += ":";
        if (Minutes < 10)
        {
            s += "0";
        }

        s += Minutes;

        return s;
    }
    
    public String timeFormatter(MyTime mytime)
    {
        String minutes = "";
        String hours = "";
        
        if (mytime.Minutes < 10)
        {
            minutes="0"+mytime.Minutes ;
        }
        else
        {
            minutes = mytime.Minutes.ToString();
        }

        if (mytime.Hour<10)
        {
            hours = "0" + mytime.Hour;
        }
        else
        {
            hours = mytime.Hour.ToString();
        }

        return hours + ":" + minutes;
    }
}