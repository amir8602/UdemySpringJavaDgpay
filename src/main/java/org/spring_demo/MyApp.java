package org.spring_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
//        // create the object
//        Coach baseballCoach = new BaseballCoach();
//        // method call
//        System.out.println(baseballCoach.getDailyWorkout());
//
//        Coach trackCoach = new TrackCoach();
//        System.out.println(trackCoach.getDailyWorkout());
//
//
//        Coach cricketCoach = new CricketCoach();
//        System.out.println(cricketCoach.getDailyWorkout());
//
//        Coach hockeyCoach = new HockeyCoach();
//        System.out.println(hockeyCoach.getDailyWorkout());
//
//
//        Coach tennisCoach = new TennisCoach();
//        System.out.println(tennisCoach.getDailyWorkout());

        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        Coach theCoach = (Coach) classPathXmlApplicationContext.getBean("myCoach" );

       // System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());



//        Person person = (Person) classPathXmlApplicationContext.getBean("PP");
//
//        System.out.println(person);
//        person = null;
//        System.gc();
        classPathXmlApplicationContext.close();
    }
}
