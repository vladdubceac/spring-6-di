package md.vladdubceac.learning.spring6di.controllers;

import md.vladdubceac.learning.spring6di.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
