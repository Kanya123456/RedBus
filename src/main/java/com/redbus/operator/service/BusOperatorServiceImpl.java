package com.redbus.operator.service;

import com.redbus.operator.entity.BusOperator;
import com.redbus.operator.payload.BusOperatorDto;
import com.redbus.operator.repository.BusRepository;
import com.redbus.operator.repository.TicketCostRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.redbus.operator.entity.TicketCost;

import java.util.UUID;

@Service
public class BusOperatorServiceImpl implements BusOperatorService{

    private BusRepository busRepository;

    private TicketCostRepository ticketRepo;
    private  ModelMapper mapper;

    public BusOperatorServiceImpl(BusRepository busRepository, TicketCostRepository ticketRepo, ModelMapper mapper) {
        this.busRepository = busRepository;
        this.ticketRepo = ticketRepo;
        this.mapper = mapper;
    }


    @Override
    public BusOperatorDto scheduleBus(BusOperatorDto busOperatorDto){
        BusOperator busOperator=mapToEntity(busOperatorDto);


        TicketCost ticketCost = new TicketCost();
        // Set TicketCost properties
        ticketCost.setBusId(busOperatorDto.getBusId());
        ticketCost.setCost(busOperatorDto.getTicketCost().getCost());
        ticketCost.setCode(busOperatorDto.getTicketCost().getCode());
        ticketCost.setDiscountAmount(busOperatorDto.getTicketCost().getDiscountAmount());
        busOperator.setTicketCost(ticketCost);

//        id generate in encoded id
        String busId = UUID.randomUUID().toString();
        busOperator.setBusId(busId);
        BusOperator savedBusSchedule=busRepository.save(busOperator);
        return mapToDto(savedBusSchedule);

    }
    BusOperator mapToEntity(BusOperatorDto busOperatorDto){
//        modelMapper..
        BusOperator busOperator=mapper.map(busOperatorDto, BusOperator.class);
        return busOperator;
    }
    BusOperatorDto mapToDto(BusOperator busOperator){
//        modelMapper..
        BusOperatorDto busOperatorDto=mapper.map(busOperator, BusOperatorDto.class);
        return busOperatorDto;
    }

    // Implement the methods of the BusOperatorService interface here

}