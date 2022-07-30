package org.spring_demo;

public class MyApp {
    public static void main(String[] args) {
        // create the object
        Coach baseballCoach = new BaseballCoach();
        // method call
        System.out.println(baseballCoach.getdailyworkout());

        Coach trackCoach = new TrackCoach();
        System.out.println(trackCoach.getdailyworkout());


        Coach cricketCoach = new CricketCoach();
        System.out.println(cricketCoach.getdailyworkout());

        Coach hockeyCoach = new HockeyCoach();
        System.out.println(hockeyCoach.getdailyworkout());


        Coach tennisCoach = new TennisCoach();
        System.out.println(tennisCoach.getdailyworkout());

        Coach footballCoach=new Coach() {
            @Override
            public String getdailyworkout() {
                return "Get football";
            }
        };
        System.out.println(footballCoach.getdailyworkout());


    }
}
