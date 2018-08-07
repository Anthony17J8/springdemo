package kiselev.springdemo;

public class FootballCoach implements Coach {

    private FortuneService service;

    public FootballCoach(FortuneService service) {
        this.service = service;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your penalty kicks";
    }

    @Override
    public String getDailyFortune() {
        return service.getFortune();
    }
}
