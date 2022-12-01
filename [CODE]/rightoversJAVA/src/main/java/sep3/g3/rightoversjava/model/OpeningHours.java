package sep3.g3.rightoversjava.model;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name="opening_hours")
public class OpeningHours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="monday_opening_hours", columnDefinition="TIME")
    private LocalTime mondayOpeningHours;

    @Column(name="monday_opening_hours", columnDefinition="TIME")
    private LocalTime tuesdayOpeningHours;

    @Column(name="monday_opening_hours", columnDefinition="TIME")
    private LocalTime wednesdayOpeningHours;

    @Column(name="monday_opening_hours", columnDefinition="TIME")
    private LocalTime thursdayOpeningHours;

    @Column(name="monday_opening_hours", columnDefinition="TIME")
    private LocalTime fridayOpeningHours;

    @Column(name="monday_opening_hours", columnDefinition="TIME")
    private LocalTime saturdayOpeningHours;

    @Column(name="monday_opening_hours", columnDefinition="TIME")
    private LocalTime sundayOpeningHours;


    @OneToOne
    @JoinColumn(name="username")
    private User user;

    public OpeningHours() {

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public OpeningHours(int id, LocalTime mondayOpeningHours,LocalTime tuesdayOpeningHours,LocalTime wednesdayOpeningHours,LocalTime thursdayOpeningHours, LocalTime fridayOpeningHours, LocalTime saturdayOpeningHours, LocalTime sundayOpeningHours)

    {
        this.id=id;
        this.mondayOpeningHours=mondayOpeningHours;
        this.tuesdayOpeningHours=tuesdayOpeningHours;
        this.wednesdayOpeningHours=wednesdayOpeningHours;
        this.thursdayOpeningHours=thursdayOpeningHours;
        this.fridayOpeningHours=fridayOpeningHours;
        this.saturdayOpeningHours=saturdayOpeningHours;
        this.sundayOpeningHours=sundayOpeningHours;
    }

    public int getId() {
        return id;
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
        return "OpeningHours{" +
                "id=" + id +
                ", mondayOpeningHours=" + mondayOpeningHours +
                ", tuesdayOpeningHours=" + tuesdayOpeningHours +
                ", wednesdayOpeningHours=" + wednesdayOpeningHours +
                ", thursdayOpeningHours=" + thursdayOpeningHours +
                ", fridayOpeningHours=" + fridayOpeningHours +
                ", saturdayOpeningHours=" + saturdayOpeningHours +
                ", sundayOpeningHours=" + sundayOpeningHours +
                ", user=" + user +
                '}';
    }
}
