package com.accenture.micropaas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface GreetingController {

    @GetMapping("/greeting/{username}")

    String greeting(@PathVariable("username") String username) throws Exception;

    @GetMapping("/greeting2/{username}")
    String greeting2(@PathVariable("username") String username) throws Exception;
}
