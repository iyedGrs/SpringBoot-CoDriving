package org.example.projetj2e.Entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRide;
    private String addDepart;
    private String destination;
    private Date startTime;
    private Date endTime;
    private String status;
    private int availableSeats;

    @ManyToOne
    @JoinColumn(name="driver_id",nullable = false)
    private User driver;

    @OneToMany(mappedBy = "ride",cascade = CascadeType.ALL)
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "ride",cascade = CascadeType.ALL)
    private List<Review> reviews;

    public Long getIdRide() {
        return idRide;
    }

    public void setIdRide(Long idRide) {
        this.idRide = idRide;
    }

    public String getAddDepart() {
        return addDepart;
    }

    public void setAddDepart(String addDepart) {
        this.addDepart = addDepart;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public User getDriver() {
        return driver;
    }

    public void setDriver(User driver) {
        this.driver = driver;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
