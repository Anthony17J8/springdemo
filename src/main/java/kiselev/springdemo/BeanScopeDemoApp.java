package kiselev.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring/beanScope-applicationContext.xml");

        // retrieve bean from the spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        Coach myFootballCoach = context.getBean("footballCoach", Coach.class);
        Coach alphaFootballCoach = context.getBean("footballCoach", Coach.class);

        //check if they are the same
        boolean result = theCoach == alphaCoach;
        boolean checkRef = myFootballCoach == alphaFootballCoach;

        // print out the results
        System.out.println("\nPointing to the same object: " + result);

        System.out.println("\nMemory location for theCoach: " + theCoach);

        System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");

        System.out.println("\nPointing to the same object: " + checkRef);

        System.out.println("\nMemory location for myFootballCoach: " + myFootballCoach);

        System.out.println("\nMemory location for alphaCoach: " + alphaFootballCoach + "\n");

        //close context
        context.close();
    }
}