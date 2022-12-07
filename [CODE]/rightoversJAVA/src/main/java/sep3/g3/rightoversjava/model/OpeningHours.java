package sep3.g3.rightoversjava.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import sep3.g3.rightoversjava.model.dto.OpeningHoursCreationDTO;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "opening_hours")
@OnDelete(action = OnDeleteAction.CASCADE)
public class OpeningHours {

    @Id
    @GeneratedValue(generator = "hours_sequence-generator")
    @GenericGenerator(
            name = "hours_sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = "schema", value = "rightovers"),
                    @org.hibernate.annotations.Parameter(name = "sequence_name", value = "opening_hours_id_seq"),
                    @org.hibernate.annotations.Parameter(name = "initial_value", value = "3"),
                    @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
            }
    )
    private int id;

    @Column(name = "monday_opening_hours", columnDefinition = "TIME")
    private LocalTime mondayOpeningHours;

    @Column(name = "monday_closing_hours", columnDefinition = "Time")
    private LocalTime mondayClosingHours;

    @Column(name = "tuesday_opening_hours", columnDefinition = "TIME")
    private LocalTime tuesdayOpeningHours;

    @Column(name = "tuesday_closing_hours", columnDefinition = "TIME")
    private LocalTime tuesdayClosingHours;


    @Column(name = "wednesday_opening_hours", columnDefinition = "TIME")
    private LocalTime wednesdayOpeningHours;

    @Column(name = "wednesday_closing_hours", columnDefinition = "TIME")
    private LocalTime wednesdayClosingHours;

    @Column(name = "thursday_opening_hours", columnDefinition = "TIME")
    private LocalTime thursdayOpeningHours;

    @Column(name = "thursday_closing_hours", columnDefinition = "TIME")
    private LocalTime thursdayClosingHours;

    @Column(name = "friday_opening_hours", columnDefinition = "TIME")
    private LocalTime fridayOpeningHours;

    @Column(name = "friday_closing_hours", columnDefinition = "TIME")
    private LocalTime fridayClosingHours;

    @Column(name = "saturday_opening_hours", columnDefinition = "TIME")
    private LocalTime saturdayOpeningHours;

    @Column(name = "saturday_closing_hours", columnDefinition = "TIME")
    private LocalTime saturdayClosingHours;

    @Column(name = "sunday_opening_hours", columnDefinition = "TIME")
    private LocalTime sundayOpeningHours;

    @Column(name = "sunday_closing_hours", columnDefinition = "TIME")
    private LocalTime sundayClosingHours;


    @OneToOne
    @JoinColumn(name = "username")
    private User user;

    public OpeningHours() {

    }

    public OpeningHours(OpeningHoursCreationDTO dto, User user) {

        this.user = user;
        this.mondayOpeningHours = dto.getMondayOpeningHours();
        this.tuesdayOpeningHours = dto.getTuesdayOpeningHours();
        this.wednesdayOpeningHours = dto.getWednesdayOpeningHours();
        this.thursdayOpeningHours = dto.getThursdayOpeningHours();
        this.fridayOpeningHours = dto.getFridayOpeningHours();
        this.saturdayOpeningHours = dto.getSaturdayOpeningHours();
        this.sundayOpeningHours = dto.getSundayOpeningHours();
        this.mondayClosingHours = dto.getMondayClosingHours();
        this.tuesdayClosingHours = dto.getTuesdayClosingHours();
        this.wednesdayClosingHours = dto.getWednesdayClosingHours();
        this.thursdayClosingHours = dto.getThursdayClosingHours();
        this.fridayClosingHours = dto.getFridayClosingHours();
        this.saturdayClosingHours = dto.getSaturdayClosingHours();
        this.sundayClosingHours = dto.getSundayClosingHours();
    }

    public OpeningHours(int id, LocalTime mondayOpeningHours, LocalTime mondayClosingHours, LocalTime tuesdayOpeningHours, LocalTime tuesdayClosingHours, LocalTime wednesdayOpeningHours, LocalTime wednesdayClosingHours, LocalTime thursdayOpeningHours, LocalTime thursdayClosingHours, LocalTime fridayOpeningHours, LocalTime fridayClosingHours, LocalTime saturdayOpeningHours, LocalTime saturdayClosingHours, LocalTime sundayOpeningHours, LocalTime sundayClosingHours) {
        this.id = id;
        this.mondayOpeningHours = mondayOpeningHours;
        this.mondayClosingHours = mondayClosingHours;
        this.tuesdayOpeningHours = tuesdayOpeningHours;
        this.tuesdayClosingHours = tuesdayClosingHours;
        this.wednesdayOpeningHours = wednesdayOpeningHours;
        this.wednesdayClosingHours = wednesdayClosingHours;
        this.thursdayOpeningHours = thursdayOpeningHours;
        this.thursdayClosingHours = thursdayClosingHours;
        this.fridayOpeningHours = fridayOpeningHours;
        this.fridayClosingHours = fridayClosingHours;
        this.saturdayOpeningHours = saturdayOpeningHours;
        this.saturdayClosingHours = saturdayClosingHours;
        this.sundayOpeningHours = sundayOpeningHours;
        this.sundayClosingHours = sundayClosingHours;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "OpeningHours{" +
                "id=" + id +
                ", mondayOpeningHours=" + mondayOpeningHours +
                ", mondayClosingHours=" + mondayClosingHours +
                ", tuesdayOpeningHours=" + tuesdayOpeningHours +
                ", tuesdayClosingHours=" + tuesdayClosingHours +
                ", wednesdayOpeningHours=" + wednesdayOpeningHours +
                ", wednesdayClosingHours=" + wednesdayClosingHours +
                ", thursdayOpeningHours=" + thursdayOpeningHours +
                ", thursdayClosingHours=" + thursdayClosingHours +
                ", fridayOpeningHours=" + fridayOpeningHours +
                ", fridayClosingHours=" + fridayClosingHours +
                ", saturdayOpeningHours=" + saturdayOpeningHours +
                ", saturdayClosingHours=" + saturdayClosingHours +
                ", sundayOpeningHours=" + sundayOpeningHours +
                ", sundayClosingHours=" + sundayClosingHours +
                ", user=" + user +
                '}';
    }
}
