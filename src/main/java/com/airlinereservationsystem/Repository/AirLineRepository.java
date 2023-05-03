package com.airlinereservationsystem.Repository;

import com.airlinereservationsystem.Entity.Airline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AirLineRepository extends JpaRepository<Airline,Long> {

    @Query(value = "select * from airline l where l.first_name like %:keyword% or l.flight_name like %:keyword%", nativeQuery = true)
    List<Airline> findByKeyword(@Param("keyword") String keyword);
}
