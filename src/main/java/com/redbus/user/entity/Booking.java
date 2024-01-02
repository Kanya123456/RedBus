package com.redbus.user.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="bookings")
public class Booking {
    @Id
    @Column(name="booking_Id")
    private String bookingId;
    @Column(name="bus_id")
    private String busId;
    @Column(name="ticket_id")
    private long ticketId;
    @Column(name="bus_company")
    private String busCompany;
    @Column(name="first_name")
    private String firstName;
    @Column(name="to_city")
    private String toCity;
    @Column(name="from_city")
    private String fromCity;
    @Column(name="last_name")
    private String lastName;
    private String email;
    private String mobile;
    private double price;

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }

    public String getBusCompany() {
        return busCompany;
    }

    public void setBusCompany(String busCompany) {
        this.busCompany = busCompany;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
