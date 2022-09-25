package com.example.carrental.model;

import javax.persistence.*;

@Entity
public class Damage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 400)
    private String description;
    @Column
    private double damagePenalty;

    public Damage() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDamagePenalty() {
        return damagePenalty;
    }

    public void setDamagePenalty(double damagePenalty) {
        this.damagePenalty = damagePenalty;
    }
}
