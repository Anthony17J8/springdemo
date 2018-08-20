package kiselev.annotations;

public class RageFortuneService implements FortuneService {

    public RageFortuneService() {
        System.out.println("RageFortuneService: inside constructor");
    }

    @Override
    public String getFortune() {
        return "You need to have a rage if you want to win";
    }
}
