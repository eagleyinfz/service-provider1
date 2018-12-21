package com.accenture.micropaas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingControllerImpl implements GreetingController {

    @Autowired
    private GreetingService greetingService;

    public String greeting(@PathVariable("username") String username) throws Exception {
        return greetingService.getGreeting(username);
    }

    @Override
    public String greeting2(@PathVariable("username") String username) throws Exception {
        return greetingService.getGreeting2(username);
    }
}
