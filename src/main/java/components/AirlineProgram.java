package components;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Scanner;

@AllArgsConstructor

public class AirlineProgram {

    private final static Logger log = LoggerFactory.getLogger(AirlineProgram.class);

    private AirlineReader airlineReader;
    private AirlineFilter airlineFilter;
    private Scanner sc;

    public void execute(){
        try {

        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

}
