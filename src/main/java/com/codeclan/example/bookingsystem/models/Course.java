package com.codeclan.example.bookingsystem.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "courses")

public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "town")
    private String town;
    @Column(name = "starRating")
    private int starRating;
    @OneToMany
    @JoinColumn()
    private List<Booking> bookings;

    public Course(String town, int starRating, List<Booking> bookings) {
        this.town = town;
        this.starRating = starRating;
        this.bookings = bookings;
    }

    public Course() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
