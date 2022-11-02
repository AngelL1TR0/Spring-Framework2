package components;

import entity.Airline;
import entity.Flight;


import java.util.LinkedList;
import java.util.List;

public class AirlineFilter {

    public List<Flight> filterFlights(
            Airline airline,
            String origin) {
        List<Flight> flights = new LinkedList<>();
        for(Flight flight: airline.getFlights()) {
            if(flight.getOrigin().equals(origin)) {
                flights.add(flight);
            }
        }
        return flights;
    }
}
