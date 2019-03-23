package twc.springframework.services;

import org.springframework.stereotype.Service;

import java.lang.annotation.Inherited;

@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting(){
        return "Hello - I was injected by the setter !!@@@@";
    }
}
