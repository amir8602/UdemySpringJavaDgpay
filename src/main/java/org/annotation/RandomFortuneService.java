package org.annotation;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("randomFortuneService")

public class RandomFortuneService implements FortuneService{

    private String [] data ={"A","B","C"};
    private Random myRandom = new Random();



    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }





}
