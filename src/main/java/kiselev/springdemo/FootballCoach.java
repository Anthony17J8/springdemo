package kiselev.springdemo;

public class FootballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your penalty kicks";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
