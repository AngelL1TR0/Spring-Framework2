package components;

import entity.Airline;
import entity.Flight;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

@AllArgsConstructor
public class AirlineProgram {
    private final static Logger log = LoggerFactory.getLogger(AirlineProgram.class);
    private Scanner scanner;
    private AirlineReader airlineReader;
    private AirlineFilter airlineFilter;

    public void execute() {
        try {
            Airline airline = airlineReader.readAirline();

            log.info("Qué origen desea buscar");
            String origin = scanner.nextLine();

            List<Flight> flights = airlineFilter.filterFlights(airline, origin);
            for (Flight flight : flights) {
                log.info(flight.toString());
            }
        } catch (IOException e) {
            log.error("Error al  leer el archivo ", e);
        }
    }
}