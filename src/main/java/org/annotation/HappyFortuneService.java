package org.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("happyFortuneService")
@Scope("singleton")

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
