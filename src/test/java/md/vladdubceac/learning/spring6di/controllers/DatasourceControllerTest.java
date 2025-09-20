package md.vladdubceac.learning.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles({"dev","ES"})
@SpringBootTest
class DatasourceControllerTest {

    @Autowired
    DatasourceController controller;

    @Test
    void getEnvironment(){
        System.out.println(controller.getEnvironment());
    }

}