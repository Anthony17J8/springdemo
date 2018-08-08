package kiselev.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlInjectionApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        // retrieve bean from spring container
        FootballCoach theCoach = context.getBean("myFootballCoach", FootballCoach.class);

        // call methods on the bean
        //... let's come back to this ...
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        //close context
        context.close();
    }
}
