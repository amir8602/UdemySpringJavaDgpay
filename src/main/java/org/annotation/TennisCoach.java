package org.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("tennisCoach")
@Scope("singleton")

public class TennisCoach implements Coach {


    @Qualifier("randomFortuneService")
    @Autowired
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("def");
    }

    //init
    @PostConstruct
    public void deMyStartup(){
        System.out.println("staffff");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("finish");
    }




    //@Autowired
//    public void doSomeCrazyStuff(FortuneService fortuneService) {
//    System.out.println(">>TennisCoach: inside doSome");
//        this.fortuneService = fortuneService;
//    }
//
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//        System.out.println("sara");
//    }
//
//    public TennisCoach() {
//        System.out.println(">>TennisCoach: inside default constructor");
//    }
//
//
//
//    @Autowired
//    public TennisCoach( FortuneService fortuneService) {
//        System.out.println(">>TennisCoach: inside no-default constructor");
//        this.fortuneService = fortuneService;
//    }
//
//
    @Override
    public String getDailyWorkout() {
        return "practice your backand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
