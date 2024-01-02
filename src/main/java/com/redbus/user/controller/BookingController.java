package com.redbus.user.controller;

import com.redbus.user.payload.BookingDetailsDto;
import com.redbus.user.service.BookingService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.redbus.user.payload.PassengerDetails;

import java.util.ResourceBundle;

@RestController
@RequestMapping("/api/booking")
public class BookingController {

    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    //    http://localhost:8080/api/booking?busId=&ticketId=
    @PostMapping
    public ResponseEntity<BookingDetailsDto> bookBus(
            @RequestParam("busId") String busId,
            @RequestParam("ticketId") long ticketId,
           @RequestBody PassengerDetails  passengerDetails){

        BookingDetailsDto booking = bookingService.createBooking(busId, ticketId, passengerDetails);
      return  new ResponseEntity<>(booking, HttpStatus.OK);
    }
}
