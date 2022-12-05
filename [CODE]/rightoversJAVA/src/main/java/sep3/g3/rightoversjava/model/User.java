package sep3.g3.rightoversjava.model;

import sep3.g3.rightoversjava.model.dto.UserCreationDTO;

import javax.persistence.*;

@Entity
@Table(name = "user_")
public class User {
    @Id
    public String username;
    @Column(name = "firstname")
    public String firstName;
    @Column(name = "password_")
    public String password;
    @Column(name = "is_business")
    public boolean isBusiness;
    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "address_id")
    public Address address;

    public User(UserCreationDTO dto) {
        this.username = dto.getUsername();
        this.firstName = dto.getFirstName();
        this.password = dto.getPassword();
        this.address = new Address(dto.getAddressCreationDTO());
        this.isBusiness = dto.isBusiness();
    }

    public User(String username) {
        this.username = username;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isBusiness() {
        return isBusiness;
    }

    public void setBusiness(boolean business) {
        isBusiness = business;
    }
}
