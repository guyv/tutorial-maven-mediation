package be.veraghtert.tutorial.maven.dependency.mediation.basketball.component;

import be.veraghtert.tutorial.maven.dependency.mediation.api.SportsRepository;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableAutoConfiguration
@ComponentScan("be.veraghtert.tutorial.maven.dependency.mediation.basketball")
@PropertySource("classpath:basketball.properties")
public class BasketballComponentConfiguration {

    @Bean
    public SportsRepository sportsRepository() {
        return new SportsRepository();
    }

}