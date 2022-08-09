package org.spring_demo;

public class TrackCoach implements Coach{

    private FortuneService fortuneService;

    public TrackCoach(HappyFortuneService fortuneService1) {
        this.fortuneService=fortuneService1;
    }


   public TrackCoach(){

   }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do it"+fortuneService.getFortune();
    }
}
