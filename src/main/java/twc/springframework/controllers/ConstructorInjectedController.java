package twc.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import twc.springframework.services.GreetingService;
import twc.springframework.services.GreetingServiceImpl;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    //@Autowired

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
