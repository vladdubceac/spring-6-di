package md.vladdubceac.learning.spring6di.controllers;

import md.vladdubceac.learning.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SetterInjectedControllerTest {

    @Autowired
    SetterInjectedController setterInjectedController;

//    @BeforeEach
//    void setUp() {
//        setterInjectedController = new SetterInjectedController();
//        setterInjectedController.setGreetingService(new GreetingServiceImpl());
//    }

    @Test
    void sayHello() {
        System.out.println(setterInjectedController.sayHello());
    }
}