package be.veraghtert.tutorial.maven.dependency.mediation.basketball.manualtestsupport;

import be.veraghtert.tutorial.maven.dependency.mediation.api.SportsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test-support/sports")
public class BasketballController {

    private final SportsRepository sportsRepository;

    public BasketballController(SportsRepository sportsRepository) {
        this.sportsRepository = sportsRepository;
    }

    @GetMapping
    public String love() {
        return String.format("I love %s", sportsRepository.getBasketball());
    }
}
