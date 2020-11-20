package be.veraghtert.tutorial.maven.dependency.mediation.basketball.test.app;

import be.veraghtert.tutorial.maven.dependency.mediation.basketball.component.BasketballComponentConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({BasketballComponentConfiguration.class})
public class BasketballApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasketballApplication.class, args);
    }

}