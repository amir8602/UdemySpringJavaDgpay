package org.spring_demo;

public class MyApp {
    public static void main(String[] args) {
        // create the object
        Coach baseballCoach = new BaseballCoach();
        // method call
        System.out.println(baseballCoach.getDailyWorkout());
    }
}
