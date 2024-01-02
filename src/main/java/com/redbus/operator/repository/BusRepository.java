package com.redbus.operator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.redbus.operator.entity.BusOperator;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;
import org.springframework.data.repository.query.Param;


public interface BusRepository extends JpaRepository<BusOperator ,String> {

    List<BusOperator> findByDepartureCityAndArrivalCityAndDepartureDate(String departureCity, String arrivalCity, Date departureDate);
// or
//both are jpql query
//   query annotation 1
//    methode for searching the bus based on DCity,ACity,Ddate
    @Query("SELECT bo FROM BusOperator bo WHERE bo.departureCity = :departureCity AND bo.arrivalCity = :arrivalCity AND bo.departureDate = :departureDate")
    List<BusOperator> searchByCitiesAndDate(@Param("departureCity") String departureCity,
                                  @Param("arrivalCity") String arrivalCity,
                                  @Param("departureDate") Date departureDate);


//    custom query 2
//    @Query("select b from busOperater where b.email = :email")
//    Optional<BusOperator> searchByEmail(@Param("email") String email);
}
