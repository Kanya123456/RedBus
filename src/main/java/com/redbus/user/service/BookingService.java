package com.redbus.user.service;

import com.redbus.operator.entity.BusOperator;
import com.redbus.operator.entity.TicketCost;
import com.redbus.operator.repository.BusRepository;
import com.redbus.operator.repository.TicketCostRepository;
import com.redbus.user.entity.Booking;
import com.redbus.user.payload.BookingDetailsDto;
import com.redbus.user.payload.PassengerDetails;
import com.redbus.user.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BookingService {
    private BusRepository busRepository;
    private TicketCostRepository ticketCostRepository;
    private BookingRepository bookingRepository;

    public BusRepository getBusRepository() {
        return busRepository;
    }

    public void setBusRepository(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    public TicketCostRepository getTicketCostRepository() {
        return ticketCostRepository;
    }

    public void setTicketCostRepository(TicketCostRepository ticketCostRepository) {
        this.ticketCostRepository = ticketCostRepository;
    }

    public BookingRepository getBookingRepository() {
        return bookingRepository;
    }

    public void setBookingRepository(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public BookingDetailsDto createBooking(String busId,
                                           long ticketId,
                                           PassengerDetails passengerDetails){

        BusOperator bus = busRepository.findById(busId).get();
        TicketCost ticketCost = ticketCostRepository.findById(ticketId).get();

        Booking booking = new Booking() ;
        String bookingId = UUID.randomUUID().toString();
        booking.setBookingId(bookingId);
        booking.setToCity(bus.getArrivalCity());
        booking.setFromCity(bus.getDepartureCity());
        booking.setBusCompany(bus.getBusOperatorCompanyName());
        booking.setPrice(ticketCost.getCost());
        booking.setFirstName(passengerDetails.getFirstName());
        booking.setLastName(passengerDetails.getLastName());
        booking.setEmail(passengerDetails.getEmail());
        booking.setMobile(passengerDetails.getMobile());

        Booking ticketCreatedDetails = bookingRepository.save(booking);
        BookingDetailsDto dto= new BookingDetailsDto();
        dto.setBookingId(ticketCreatedDetails.getBookingId());
        dto.setFirstName(ticketCreatedDetails.getFirstName());
        dto.setLastName(ticketCreatedDetails.getLastName());
        dto.setPrice(ticketCreatedDetails.getPrice());
        dto.setEmail(ticketCreatedDetails.getEmail());
        dto.setMobile(ticketCreatedDetails.getMobile());
        dto.setBusCompany(ticketCreatedDetails.getBusCompany());
        return  dto;
    }


}
