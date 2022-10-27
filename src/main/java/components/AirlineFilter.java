package components;

import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Airline;
import entity.Flight;

import java.util.ArrayList;
import java.util.List;

public class AirlineFilter {

    public List<Flight> filterAirline(Airline airline, String origin){
       List<Flight> flights = new ArrayList<>();
        for (Flight flight: flights) {
            if(origin.equals( flight.getOrigin())){
                
            }
        }
    }
}
