package com.redbus.operator.payload;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.redbus.operator.entity.TicketCost;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.OneToOne;
import java.time.LocalTime;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
public class BusOperatorDto {
    private String busId;
    private String busNumber;
    private String busOperatorCompanyName;
    private String driverName;
    private String supportStaff;
    private int  numberSeats;
    private String departureCity;
    private String arrivalCity;
    @JsonFormat(pattern = "HH:mm:ss")

    private LocalTime departureTime;
    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime arrivalTime;
    @JsonFormat(pattern = "dd/MM/yyyy")

    private Date departureDate;
    @JsonFormat(pattern = "dd/MM/yyyy")

    private Date arrivalDate;
    private double totalTravelTime;
    private String busType;
    private String amenities;
    private TicketCost ticketCost;

    // Constructors, getters, and setters


    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getBusOperatorCompanyName() {
        return busOperatorCompanyName;
    }

    public void setBusOperatorCompanyName(String busOperatorCompanyName) {
        this.busOperatorCompanyName = busOperatorCompanyName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getSupportStaff() {
        return supportStaff;
    }

    public void setSupportStaff(String supportStaff) {
        this.supportStaff = supportStaff;
    }

    public int  getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public double getTotalTravelTime() {
        return totalTravelTime;
    }

    public void setTotalTravelTime(double totalTravelTime) {
        this.totalTravelTime = totalTravelTime;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public TicketCost getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(TicketCost ticketCost) {
        this.ticketCost = ticketCost;
    }
}
