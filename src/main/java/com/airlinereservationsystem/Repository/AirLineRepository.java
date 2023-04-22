package com.airlinereservationsystem.Repository;

import com.airlinereservationsystem.Entity.Airline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirLineRepository extends JpaRepository<Airline,Long> {
}
