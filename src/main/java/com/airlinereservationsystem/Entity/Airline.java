package com.airlinereservationsystem.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;
import jakarta.persistence.Table;


@Entity
@Table(name = "airline")
public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;
    @Column(name = "gender")
    private String gender;
    @Column(name = "flight_name")
    private String flightName;

    @Column(name = "seatNo")
    private Long seatNo;
    @Column(name = "status")
    private String status;
    @Column(name ="type")
    private String type;

    public Airline() {
    }

    public Airline(String firstName, String lastName, String email, String gender,String flightName,
                   Long seatNo, String status, String type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.flightName = flightName;
        this.seatNo = seatNo;
        this.status = status;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public Long getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(Long seatNo) {
        this.seatNo = seatNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
