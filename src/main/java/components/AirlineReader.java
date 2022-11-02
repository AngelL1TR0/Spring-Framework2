package components;


import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Airline;
import lombok.AllArgsConstructor;

import java.io.File;
import java.io.IOException;

@AllArgsConstructor
public class AirlineReader {

    private ObjectMapper objectMapper;
    private String inputPath;

    public Airline readAirline() throws IOException {
        return objectMapper.readValue(
                new File(inputPath),
                Airline.class);
    }
}
