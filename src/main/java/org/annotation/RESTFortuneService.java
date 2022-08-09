package org.annotation;

import org.springframework.stereotype.Component;

@Component("rESTFortuneService")
public class RESTFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "RESTFortuneService";
    }
}
