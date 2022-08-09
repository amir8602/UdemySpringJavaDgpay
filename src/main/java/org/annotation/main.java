package org.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = (Coach) classPathXmlApplicationContext.getBean("tennisCoach");

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        classPathXmlApplicationContext.close();
    }
}
