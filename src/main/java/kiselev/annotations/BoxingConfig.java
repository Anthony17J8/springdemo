package kiselev.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoxingConfig {

    @Bean
    public Coach boxingCoach() {
        return new BoxingCoach(rageFortuneService());
    }

    @Bean
    public FortuneService rageFortuneService() {
        return new RageFortuneService();
    }
}
