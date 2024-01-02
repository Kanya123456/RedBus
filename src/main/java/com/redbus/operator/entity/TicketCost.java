package com.redbus.operator.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ticket_cost")
public class TicketCost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="bus_id", unique = true)
    private String busId;
    private double cost;
    private String code;
    @Column(name="discount_amount", unique = true)
    private double discountAmount;

    public long getTicketId() {
        return id;
    }

    public void setTicketId(long id) {
        this.id = id;
    }

    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }


    @OneToOne(mappedBy="ticketCost")
    @JoinColumn(name = "bus_id") // This is the foreign key column in the TicketCost table
    private BusOperator busOperator;
}
