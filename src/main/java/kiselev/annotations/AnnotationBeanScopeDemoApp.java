package kiselev.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        // load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring/annotations-applicationContext.xml");

        // retrieve a bean spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        // check if they are the same
        boolean result = (alphaCoach == theCoach);

        // print out the results
        System.out.println("\nPointing to the same object: " + result);

        System.out.println("\nMemory location for theCoach: " + theCoach);

        System.out.println("\nMemory location for theCoach: " + alphaCoach);

        // close the context
        context.close();
    }
}
