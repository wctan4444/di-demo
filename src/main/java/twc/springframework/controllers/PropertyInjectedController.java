package twc.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import twc.springframework.services.GreetingService;

@Controller
public class PropertyInjectedController {

    @Autowired
    //public GreetingServiceImpl greetingService;
    public GreetingService greetingServiceImpl;


    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }
}
