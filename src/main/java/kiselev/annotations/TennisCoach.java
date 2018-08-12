package kiselev.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    // define a default constructor
    public TennisCoach() {
        System.out.println("TennisCoach: inside default constructor");
    }

    /*
    //docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-autowired-annotation
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */

    //define a setter method
    @Autowired
    public void doSomeCrazyStuff(FortuneService fortuneService) {
        System.out.println("TennisCoach: inside setter method doSomeCrazyStuff()");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
