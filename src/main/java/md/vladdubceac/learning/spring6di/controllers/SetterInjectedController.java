package md.vladdubceac.learning.spring6di.controllers;

import md.vladdubceac.learning.spring6di.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
       return greetingService.sayGreeting();
    }
}
