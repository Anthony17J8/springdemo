package kiselev.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("kiselev.annotations")
@PropertySource("classpath:sport.properties")
public class SportConfig {
}
