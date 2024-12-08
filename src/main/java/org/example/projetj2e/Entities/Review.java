package org.example.projetj2e.Entities;


import jakarta.persistence.*;
import org.springframework.scheduling.support.SimpleTriggerContext;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReview;
    private String comment;
    private String rating;

    @ManyToOne
    @JoinColumn(name="ride_id",nullable=false)
    private Ride ride;

    @ManyToOne
    @JoinColumn(name="passenger_id",nullable = false)
    private User passenger;

    public Long getIdReview() {
        return idReview;
    }

    public void setIdReview(Long idReview) {
        this.idReview = idReview;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Ride getRide() {
        return ride;
    }

    public void setRide(Ride ride) {
        this.ride = ride;
    }

    public User getPassenger() {
        return passenger;
    }

    public void setPassenger(User passenger) {
        this.passenger = passenger;
    }
}
