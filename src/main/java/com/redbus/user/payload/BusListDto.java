package com.redbus.user.payload;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalTime;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
@AllArgsConstructor
@NoArgsConstructor
public class BusListDto {

    private String busId;

    private String busNumber;

    private int numberSeats;

    private String departureCity;

    private String arrivalCity;
     @JsonFormat(pattern = "HH:MM:SS")
     private LocalTime departureTime;
    @JsonFormat(pattern = "HH:MM:SS")
    private LocalTime arrivalTime;

    @JsonFormat(pattern = "dd/MM/YYYY")
    private Date departureDate;

    @JsonFormat(pattern = "dd/MM/YYYY")
    private Date arrivalDate;

    private double totalTravelTime;

    private String busType;

    private String amenities;

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



    public int getNumberSeats() {
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
}


