package org.spring_demo;

public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Get cricket";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
