package configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties");
public class AirlineConfiguration {

    @Bean
    public ObjectMapper objectMapper(){return new ObjectMapper();}
}
