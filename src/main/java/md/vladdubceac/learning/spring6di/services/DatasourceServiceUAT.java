package md.vladdubceac.learning.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class DatasourceServiceUAT implements DatasourceService {
    @Override
    public String getEnv() {
        return "UAT";
    }
}
