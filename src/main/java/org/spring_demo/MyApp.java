package org.spring_demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MyApp {
    public static void main(String[] args) {
        // create the object
        Coach baseballCoach = new BaseballCoach();
        // method call
        System.out.println(baseballCoach.getDailyWorkout());

        Coach trackCoach = new TrackCoach();
        System.out.println(trackCoach.getDailyWorkout());


        Coach cricketCoach = new CricketCoach();
        System.out.println(cricketCoach.getDailyWorkout());

        Coach hockeyCoach = new HockeyCoach();
        System.out.println(hockeyCoach.getDailyWorkout());


        Coach tennisCoach = new TennisCoach();
        System.out.println(tennisCoach.getDailyWorkout());

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        applicationContext.close();
    }
}
