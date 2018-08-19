package kiselev.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        // call method to get team name
        System.out.println(theCoach.getTeam());

        // call method to get coach's email
        System.out.println(theCoach.getEmailAddress());

        // close the context
        context.close();
    }
}
