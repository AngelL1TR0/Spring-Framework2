import components.AirlineProgram;
import configuration.AirlineConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AirlineConfiguration.class);
        AirlineProgram program = context.getBean(AirlineProgram.class);
        program.execute();
    }
}
