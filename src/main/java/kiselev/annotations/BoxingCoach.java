package kiselev.annotations;

public class BoxingCoach implements Coach {

    private FortuneService fortuneService;

    public BoxingCoach(FortuneService fortuneService) {
        System.out.println("BoxingCoach: inside constructor");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your low kick";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
