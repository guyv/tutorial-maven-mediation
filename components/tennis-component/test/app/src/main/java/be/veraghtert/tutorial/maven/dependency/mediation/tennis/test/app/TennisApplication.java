package be.veraghtert.tutorial.maven.dependency.mediation.tennis.test.app;

import be.veraghtert.tutorial.maven.dependency.mediation.tennis.component.TennisComponentConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({TennisComponentConfiguration.class})
public class TennisApplication {

    public static void main(String[] args) {
        SpringApplication.run(TennisApplication.class, args);
    }

}