package components;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@AllArgsConstructor

public class AirlineProgram {

    private final static Logger log = LoggerFactory.getLogger(AirlineProgram.class);

    private AirlineReader airlineReader;
    private AirlineFilter airlineFilter;

    public void execute(){
        try {

        }
    }

}
