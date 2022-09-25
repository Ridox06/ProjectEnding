package com.example.carrental.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private boolean wasOverdue;
    @Column
    private double overduePenalty;
    @Column
    private LocalDateTime returnDate;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "damage_id")
    private Damage damage;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isWasOverdue() {
        return wasOverdue;
    }

    public void setWasOverdue(boolean wasOverdue) {
        this.wasOverdue = wasOverdue;
    }

    public double getOverduePenalty() {
        return overduePenalty;
    }

    public void setOverduePenalty(double overduePenalty) {
        this.overduePenalty = overduePenalty;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    public Damage getDamage() {
        return damage;
    }

    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}

