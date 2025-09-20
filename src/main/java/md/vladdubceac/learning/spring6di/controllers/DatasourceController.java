package md.vladdubceac.learning.spring6di.controllers;

import md.vladdubceac.learning.spring6di.services.DatasourceService;
import org.springframework.stereotype.Controller;

@Controller
public class DatasourceController {

    private final DatasourceService datasourceService;

    public DatasourceController(DatasourceService datasourceService) {
        this.datasourceService = datasourceService;
    }

    public String getEnvironment() {
        return "You are in the environment - " + datasourceService.getEnv();
    }
}
