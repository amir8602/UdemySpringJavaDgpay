package org.spring_demo;

public class HockeyCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Get hockey";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
