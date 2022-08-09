package org.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("happyFortuneService")

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
