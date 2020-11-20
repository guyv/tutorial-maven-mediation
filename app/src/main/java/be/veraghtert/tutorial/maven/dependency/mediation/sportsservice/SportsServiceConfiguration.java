package be.veraghtert.tutorial.maven.dependency.mediation.sportsservice;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EnableAutoConfiguration
@EntityScan({"be.veraghtert"})
public class SportsServiceConfiguration {

}
