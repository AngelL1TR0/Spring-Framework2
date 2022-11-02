package configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import components.AirlineFilter;
import components.AirlineProgram;
import components.AirlineReader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Scanner;

@Configuration
@PropertySource("application.properties")
public class AirlineConfiguration {


    @Bean
    public
    ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public AirlineReader airlineReader(
            ObjectMapper objectMapper,
            @Value("${input.path}") String path
    ) {
        return new AirlineReader(objectMapper, path);
    }

    @Bean
    public AirlineFilter airlineFilter() {
        return new AirlineFilter();
    }

    @Bean
    public AirlineProgram airlineProgram(
            Scanner scanner,
            AirlineReader airlineReader,
            AirlineFilter airlineFilter
    ) {
        return new AirlineProgram(scanner, airlineReader, airlineFilter);
    }

    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }
}
