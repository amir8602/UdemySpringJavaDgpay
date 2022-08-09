package org.annotation;

import org.springframework.stereotype.Component;

@Component("dataBaseFortuneService")
public class DataBaseFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "dataBaseFortuneService";
    }
}
