package org.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(SportConfig.class);

        Coach tennisCoach = (Coach) annotationConfigApplicationContext.getBean("tennisCoach");

        Coach alphaCoach = (Coach) annotationConfigApplicationContext.getBean("tennisCoach");

        boolean result = (tennisCoach == alphaCoach);

        System.out.println(result);
        System.out.println(tennisCoach);
        System.out.println(alphaCoach);
        tennisCoach = null;
        alphaCoach = null;
        annotationConfigApplicationContext.close();
    }
}
