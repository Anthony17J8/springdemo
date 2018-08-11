package kiselev.annotations;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your corner kicks";
    }

    @Override
    public String getDailyFortune() {
        return "You won a ball";
    }
}
