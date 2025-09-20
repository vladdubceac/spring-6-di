package md.vladdubceac.learning.spring6di.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hey I'm setting a Greeting Service !";
    }
}
