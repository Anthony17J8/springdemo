package kiselev.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoxingJavaPracticeApp {

    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BoxingConfig.class);

        // retrieve beans from spring container
        Coach boxCoach = context.getBean("boxingCoach", Coach.class);

        // call methods on boxCoach
        System.out.println(boxCoach.getDailyFortune());
        System.out.println(boxCoach.getDailyWorkout());

        // close spring context
        context.close();
    }
}
