namespace Domain.Classes;

public class MyDate
{
    public int Day { get; set; }
    public int Month { get; set; }
    public int Year { get; set; }

    public MyDate(int day, int month, int year)
    {
        Day = day;
        Month = month;
        Year = year;
    }
}