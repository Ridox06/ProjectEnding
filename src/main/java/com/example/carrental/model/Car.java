package com.example.carrental.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30)
    private String mark;
    @Column(length = 30)
    private String model;
    @Column
    private String bodyType;
    @Column(length = 30)
    private int vintage;
    @Column(length = 30)
    private String color;
    @Column
    private long mileage;
    @Column
    private double price;

    @ManyToOne
    @JoinColumn(name ="department_id")
    private Department department;

    @OneToMany(mappedBy = "car")
    private List<Reservation> reservations;

    public Car() {
    }

    public Car(Long id, String mark, String model, String bodyType, int vintage, String color, long mileage, double price) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.bodyType = bodyType;
        this.vintage = vintage;
        this.color = color;
        this.mileage = mileage;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getVintage() {
        return vintage;
    }

    public void setVintage(int vintage) {
        this.vintage = vintage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
