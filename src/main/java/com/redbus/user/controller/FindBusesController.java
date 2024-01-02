package com.redbus.user.controller;

import com.redbus.user.payload.BusListDto;
import com.redbus.user.service.SearchBusesService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import com.redbus.operator.entity.BusOperator;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

import java.time.LocalTime;


@RestController
@RequestMapping("/api/user")
public class FindBusesController {

    private SearchBusesService searchser;

    public FindBusesController(SearchBusesService searchser) {
        this.searchser = searchser;
    }

    //  http://localhost:8080/api/user/searchBuses?departureCity=CityA&arrivalCity=CityB&departureDate=2023-12-12T08:00:00
//  we can also use requestBody by creating dto class
    @GetMapping("/searchBuses")
    public List<BusListDto> searchBuses(@RequestParam("departureCity") String departureCity,
                                        @RequestParam("arrivalCity") String arrivalCity,
                                        @RequestParam("departureDate") @DateTimeFormat(pattern = "yyyy-MM-dd")  Date departureDate){
        List<BusListDto> busListDtos = searchser.searchBusBy(departureCity, arrivalCity, departureDate);
         return busListDtos;
    }


}
