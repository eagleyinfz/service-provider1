package com.accenture.micropaas;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @HystrixCommand(fallbackMethod = "defaultGreeting")
    public String getGreeting(String username) throws Exception {
        if("error".equals(username)){
            throw new Exception();
        }
        return String.format("Hello %s!\n", username);
    }

    private String defaultGreeting(String username) {
        return "Hello provider1\n";
    }
}
