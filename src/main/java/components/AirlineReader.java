package components;


import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Airline;

import java.io.File;
import java.io.IOException;


public class AirlineReader {

    private static final String PATH = "airline.json";
    private ObjectMapper objectMapper;

    public Airline readAirline() throws IOException {
        Airline airline = objectMapper.readValue(PATH, Airline.class);
            return airline;
    }





}
