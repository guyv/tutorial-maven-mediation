package be.veraghtert.tutorial.maven.dependency.mediation.tennis.component;

import be.veraghtert.tutorial.maven.dependency.mediation.api.SportsRepository;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableAutoConfiguration
@ComponentScan("be.veraghtert.tutorial.maven.dependency.mediation.tennis")
@PropertySource("classpath:tennis.properties")
public class TennisComponentConfiguration {

    @Bean
    public SportsRepository sportsRepository() {
        return new SportsRepository();
    }

}