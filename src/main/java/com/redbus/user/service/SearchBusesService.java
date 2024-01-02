package com.redbus.user.service;

import com.redbus.operator.entity.BusOperator;
import com.redbus.operator.repository.BusRepository;
import com.redbus.user.payload.BusListDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Date;
import java.util.stream.Collectors;

@Service
public class SearchBusesService {
    private BusRepository busRepo;

    public SearchBusesService(BusRepository busRepo) {
        this.busRepo = busRepo;
    }

    public List<BusListDto> searchBusBy(String departureCity, String arrivalCity, Date departureDate){
        List<BusOperator> busesAvalaible = busRepo.findByDepartureCityAndArrivalCityAndDepartureDate(departureCity, arrivalCity, departureDate);
        List<BusListDto> dtos = busesAvalaible.stream().map(bus -> mapToDto(bus)).collect(Collectors.toList());
        return dtos;

    }
    BusListDto mapToDto(BusOperator busOperator){
        BusListDto dto = new BusListDto();
        dto.setBusId(busOperator.getBusId());
        dto.setBusNumber(busOperator.getBusNumber());
        dto.setBusType(busOperator.getBusType());
        dto.setDepartureDate(busOperator.getDepartureDate());
        dto.setArrivalDate(busOperator.getArrivalDate());
        dto.setDepartureTime(busOperator.getDepartureTime());
        dto.setArrivalTime(busOperator.getArrivalTime());
        dto.setTotalTravelTime(busOperator.getTotalTravelTime());
        dto.setNumberSeats(busOperator.getNumberSeats());
        dto.setDepartureCity(busOperator.getDepartureCity());
        dto.setArrivalCity(busOperator.getArrivalCity());
        return dto;

    }
}
