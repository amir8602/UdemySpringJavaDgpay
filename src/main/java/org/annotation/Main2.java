package org.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach tennisCoach = (Coach) classPathXmlApplicationContext.getBean("tennisCoach");

        Coach alphaCoach = (Coach) classPathXmlApplicationContext.getBean("tennisCoach");

        boolean result = (tennisCoach == alphaCoach);

        System.out.println(result);
        System.out.println(tennisCoach);
        System.out.println(alphaCoach);
        tennisCoach = null;
        alphaCoach = null;
        classPathXmlApplicationContext.close();
    }
}
