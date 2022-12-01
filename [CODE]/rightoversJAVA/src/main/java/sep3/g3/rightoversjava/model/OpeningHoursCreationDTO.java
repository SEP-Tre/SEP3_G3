package sep3.g3.rightoversjava.model;

import net.bytebuddy.asm.Advice;

import java.time.LocalTime;

public class OpeningHoursCreationDTO {
    private LocalTime mondayOpeningHours;
    private LocalTime tuesdayOpeningHours;
    private LocalTime wednesdayOpeningHours;
    private LocalTime thursdayOpeningHours;
    private LocalTime fridayOpeningHours;
    private LocalTime saturdayOpeningHours;
    private LocalTime sundayOpeningHours;

    public OpeningHoursCreationDTO(LocalTime mondayOpeningHours,LocalTime tuesdayOpeningHours, LocalTime wednesdayOpeningHours, LocalTime thursdayOpeningHours, LocalTime fridayOpeningHours, LocalTime saturdayOpeningHours, LocalTime sundayOpeningHours)
    {
        this.mondayOpeningHours=mondayOpeningHours;
        this.tuesdayOpeningHours=tuesdayOpeningHours;
        this.wednesdayOpeningHours=wednesdayOpeningHours;
        this.thursdayOpeningHours=thursdayOpeningHours;
        this.fridayOpeningHours=fridayOpeningHours;
        this.saturdayOpeningHours=saturdayOpeningHours;
        this.sundayOpeningHours=sundayOpeningHours;
    }

    public LocalTime getMondayOpeningHours() {
        return mondayOpeningHours;
    }

    public LocalTime getTuesdayOpeningHours() {
        return tuesdayOpeningHours;
    }

    public LocalTime getWednesdayOpeningHours() {
        return wednesdayOpeningHours;
    }

    public LocalTime getThursdayOpeningHours() {
        return thursdayOpeningHours;
    }

    public LocalTime getFridayOpeningHours() {
        return fridayOpeningHours;
    }

    public LocalTime getSaturdayOpeningHours() {
        return saturdayOpeningHours;
    }

    public LocalTime getSundayOpeningHours() {
        return sundayOpeningHours;
    }

    @Override
    public String toString() {
        return "OpeningHoursCreationDTO{" +
                "mondayOpeningHours=" + mondayOpeningHours +
                ", tuesdayOpeningHours=" + tuesdayOpeningHours +
                ", wednesdayOpeningHours=" + wednesdayOpeningHours +
                ", thursdayOpeningHours=" + thursdayOpeningHours +
                ", fridayOpeningHours=" + fridayOpeningHours +
                ", saturdayOpeningHours=" + saturdayOpeningHours +
                ", sundayOpeningHours=" + sundayOpeningHours +
                '}';
    }
}
