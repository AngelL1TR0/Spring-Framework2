package components;


import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Airline;
import entity.Flight;



public class AirlineReader {

    private static final String PATH = "airline.json";
    private ObjectMapper objectMapper;

    public Airline readAirline(){

        Airline airline;
        try {
            airline = objectMapper.readValue(PATH, Airline.class);
            String name = airline.getName();
            System.out.println(name);
            for (Flight flight : airline.getFlights()) {
                System.out.println(flight.toString());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return airline;
    }





}
