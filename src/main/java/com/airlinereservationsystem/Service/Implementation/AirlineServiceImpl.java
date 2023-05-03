package com.airlinereservationsystem.Service.Implementation;

import com.airlinereservationsystem.Entity.Airline;
import com.airlinereservationsystem.Repository.AirLineRepository;
import com.airlinereservationsystem.Service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AirlineServiceImpl implements AirlineService {
    @Autowired
    private AirLineRepository airLineRepository;
    @Override
    public List<Airline> getAllFlight() {
        return airLineRepository.findAll();
    }

    @Override
    public Airline saveFlight(Airline airline) {
        return airLineRepository.save(airline);
    }

    @Override
    public Airline getFlightById(Long id) {
        return airLineRepository.findById(id).get();
    }

    @Override
    public Airline updateFlight(Airline airline) {
        return airLineRepository.save(airline);
    }

    @Override
    public void deleteFlightById(Long id) {
        airLineRepository.deleteById(id);

    }

    @Override
    public List<Airline> getByKeyword(String keyword) {
        return airLineRepository.findByKeyword(keyword);
    }
}
