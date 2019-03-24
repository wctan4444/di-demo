package twc.springframework.controllers;

import org.springframework.stereotype.Controller;
import twc.springframework.services.GreetingService;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello World");

        return greetingService.sayGreeting();
    }
}
