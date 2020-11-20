package be.veraghtert.tutorial.maven.dependency.mediation.sportsservice;

import be.veraghtert.tutorial.maven.dependency.mediation.basketball.component.BasketballComponentConfiguration;
import be.veraghtert.tutorial.maven.dependency.mediation.tennis.component.TennisComponentConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class SportsServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .parent(be.veraghtert.tutorial.maven.dependency.mediation.sportsservice.SportsServiceConfiguration.class)
                .child(BasketballComponentConfiguration.class)
                .sibling(TennisComponentConfiguration.class)
                .run(args);
    }
}