package org.spring_demo;

// POJO
public class BaseballCoach implements Coach {

    private  FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService1){

        fortuneService=fortuneService1;
    }
    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
       return fortuneService.getFortune();
    }
}
