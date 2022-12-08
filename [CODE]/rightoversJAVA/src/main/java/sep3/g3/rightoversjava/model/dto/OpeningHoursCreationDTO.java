package sep3.g3.rightoversjava.model.dto;

import java.time.LocalTime;


public class OpeningHoursCreationDTO {

    public String username;
    private final LocalTime mondayOpeningHours;
    private final LocalTime mondayClosingHours;
    private final LocalTime tuesdayOpeningHours;
    private final LocalTime tuesdayClosingHours;
    private final LocalTime wednesdayOpeningHours;
    private final LocalTime wednesdayClosingHours;
    private final LocalTime thursdayOpeningHours;
    private final LocalTime thursdayClosingHours;
    private final LocalTime fridayOpeningHours;
    private final LocalTime fridayClosingHours;
    private final LocalTime saturdayOpeningHours;
    private final LocalTime saturdayClosingHours;
    private final LocalTime sundayOpeningHours;
    private final LocalTime sundayClosingHours;

    private  boolean mondayIsOpen;

    private boolean tuesdayIsOpen;

    private boolean wednesdayIsOpen;

    private boolean thursdayIsOpen;

    private boolean fridayIsOpen;

    private boolean saturdayIsOpen;

    private boolean sundayIsOpen;


    public OpeningHoursCreationDTO(String username, LocalTime mondayOpeningHours, LocalTime mondayClosingHours, LocalTime tuesdayOpeningHours, LocalTime tuesdayClosingHours, LocalTime wednesdayOpeningHours, LocalTime wednesdayClosingHours, LocalTime thursdayOpeningHours, LocalTime thursdayClosingHours, LocalTime fridayOpeningHours, LocalTime fridayClosingHours, LocalTime saturdayOpeningHours, LocalTime saturdayClosingHours, LocalTime sundayOpeningHours, LocalTime sundayClosingHours, boolean mondayIsOpen, boolean tuesdayIsOpen, boolean wednesdayIsOpen, boolean thursdayIsOpen, boolean fridayIsOpen,  boolean saturdayIsOpen, boolean sundayIsOpen) {
        this.mondayOpeningHours = mondayOpeningHours;
        this.tuesdayOpeningHours = tuesdayOpeningHours;
        this.wednesdayOpeningHours = wednesdayOpeningHours;
        this.thursdayOpeningHours = thursdayOpeningHours;
        this.fridayOpeningHours = fridayOpeningHours;
        this.saturdayOpeningHours = saturdayOpeningHours;
        this.sundayOpeningHours = sundayOpeningHours;
        this.mondayClosingHours = mondayClosingHours;
        this.tuesdayClosingHours = tuesdayClosingHours;
        this.wednesdayClosingHours = wednesdayClosingHours;
        this.thursdayClosingHours = thursdayClosingHours;
        this.fridayClosingHours = fridayClosingHours;
        this.saturdayClosingHours = saturdayClosingHours;
        this.sundayClosingHours = sundayClosingHours;
        this.username = username;
        this.mondayIsOpen=mondayIsOpen;
        this.tuesdayIsOpen=tuesdayIsOpen;
        this.wednesdayIsOpen=wednesdayIsOpen;
        this.thursdayIsOpen=thursdayIsOpen;
        this.fridayIsOpen=fridayIsOpen;
        this.saturdayIsOpen=saturdayIsOpen;
        this.sundayIsOpen=sundayIsOpen;
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

    public LocalTime getMondayClosingHours() {
        return mondayClosingHours;
    }

    public LocalTime getTuesdayClosingHours() {
        return tuesdayClosingHours;
    }

    public LocalTime getWednesdayClosingHours() {
        return wednesdayClosingHours;
    }

    public LocalTime getThursdayClosingHours() {
        return thursdayClosingHours;
    }

    public LocalTime getFridayClosingHours() {
        return fridayClosingHours;
    }

    public LocalTime getSaturdayClosingHours() {
        return saturdayClosingHours;
    }

    public LocalTime getSundayClosingHours() {
        return sundayClosingHours;
    }

    public String getUsername() {
        return username;
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

    public boolean isMondayIsOpen() {
        return mondayIsOpen;
    }

    public boolean isTuesdayIsOpen() {
        return tuesdayIsOpen;
    }

    public boolean isWednesdayIsOpen() {
        return wednesdayIsOpen;
    }

    public boolean isThursdayIsOpen() {
        return thursdayIsOpen;
    }

    public boolean isFridayIsOpen() {
        return fridayIsOpen;
    }

    public boolean isSaturdayIsOpen() {
        return saturdayIsOpen;
    }

    public boolean isSundayIsOpen() {
        return sundayIsOpen;
    }
}
