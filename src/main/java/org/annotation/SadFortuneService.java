package org.annotation;

public class SadFortuneService implements FortuneService{


    @Override
    public String getFortune() {
        return "Today we are happy";
    }
}
