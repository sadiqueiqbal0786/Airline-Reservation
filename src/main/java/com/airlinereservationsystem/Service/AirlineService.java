package com.airlinereservationsystem.Service;

import com.airlinereservationsystem.Entity.Airline;

import java.util.*;

public interface AirlineService {
    List<Airline> getAllFlight();
    Airline saveFlight(Airline airline);

    Airline getFlightById(Long id);

    Airline updateFlight(Airline airline);

    void deleteFlightById(Long id);

}
