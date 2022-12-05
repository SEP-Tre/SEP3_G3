using Domain.Classes;

namespace Domain.DTOs;

public class OpeningHoursCreationDto
{
    public MyTime MondayOpeningHours { get; set; }
    public MyTime MondayClosingHours { get; set; }
    public MyTime TuesdayOpeningHours { get; set; }
    public MyTime TuesdayClosingHours { get; set; }
    public MyTime WednesdayOpeningHours { get; set; }
    public MyTime WednesdayClosingHours { get; set; }
    public MyTime ThursdayOpeningHours { get; set; }
    public MyTime ThursdayClosingHours { get; set; }
    public MyTime FridayOpeningHours { get; set; }
    public MyTime FridayClosingHours { get; set; }
    public MyTime SaturdayOpeningHours { get; set; }
    public MyTime SaturdayClosingHours { get; set; }
    public MyTime SundayOpeningHours { get; set; }
    public MyTime SundayClosingHours { get; set; }
    public string Username { get; set; }


    public OpeningHoursCreationDto(string username, MyTime mondayOpeningHours, MyTime mondayClosingHours,
        MyTime tuesdayOpeningHours,
        MyTime tuesdayClosingHours, MyTime wednesdayOpeningHours, MyTime wednesdayClosingHours,
        MyTime thursdayOpeningHours, MyTime thursdayClosingHours, MyTime fridayOpeningHours, MyTime fridayClosingHours,
        MyTime saturdayOpeningHours, MyTime saturdayClosingHours, MyTime sundayOpeningHours, MyTime sundayClosingHours)
    {
        Username = username;
        MondayOpeningHours = mondayOpeningHours;
        MondayClosingHours = mondayClosingHours;
        TuesdayOpeningHours = tuesdayOpeningHours;
        TuesdayClosingHours = tuesdayClosingHours;
        WednesdayOpeningHours = wednesdayOpeningHours;
        WednesdayClosingHours = wednesdayClosingHours;
        ThursdayOpeningHours = thursdayOpeningHours;
        ThursdayClosingHours = thursdayClosingHours;
        FridayOpeningHours = fridayOpeningHours;
        FridayClosingHours = fridayClosingHours;
        SaturdayOpeningHours = saturdayOpeningHours;
        SaturdayClosingHours = saturdayClosingHours;
        SundayOpeningHours = sundayOpeningHours;
        SundayClosingHours = sundayClosingHours;
    }

    public OpeningHoursCreationDto()
    {
        
    }
}