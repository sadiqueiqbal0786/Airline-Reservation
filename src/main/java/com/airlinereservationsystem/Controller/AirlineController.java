package com.airlinereservationsystem.Controller;

import com.airlinereservationsystem.Entity.Airline;
import com.airlinereservationsystem.Service.AirlineService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AirlineController {
    private AirlineService airlineService;
    public AirlineController(AirlineService airlineService){
        this.airlineService=airlineService;
    }
    @GetMapping("/airline")
    public String listFlight(Model model){
        model.addAttribute("airline",airlineService.getAllFlight());
        return "airline";
    }
    @GetMapping("/airline/new")
    public String createFlightForm(Model model){
        Airline airline = new Airline();
        model.addAttribute("airline",airline);
        return "create_flight";

    }
    @PostMapping("/airline")
    public String saveFlight(@ModelAttribute("airline")Airline airline){
        airlineService.saveFlight(airline);
        return "redirect:/airline";
    }
    @GetMapping("/airline/edit/{id}")
    public String editFlightForm(@PathVariable Long id, Model model){
        model.addAttribute("airline",airlineService.getFlightById(id));
        return "edit_flight";
    }

    @PostMapping("/airline/{id}")
    public String updateFlight(@PathVariable Long id,
                             @ModelAttribute("airline")Airline airline,
                             Model model){
        Airline existingAirline = airlineService.getFlightById(id);
        existingAirline.setId(id);
        existingAirline.setFirstName(airline.getFirstName());
        existingAirline.setLastName(airline.getLastName());
        existingAirline.setEmail(airline.getEmail());
        existingAirline.setGender(existingAirline.getGender());
        existingAirline.setFlightName(existingAirline.getFlightName());
        existingAirline.setSeatNo(existingAirline.getSeatNo());
        existingAirline.setStatus(existingAirline.getStatus());
        existingAirline.setType(existingAirline.getType());

        airlineService.updateFlight(existingAirline);
        return "redirect:/airline";
    }
    @GetMapping("/airline/{id}")
    public String deleteFlight(@PathVariable Long id){
        airlineService.deleteFlightById(id);
        return "redirect:/airline";
    }
}
