package md.vladdubceac.learning.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("qa")
public class DatasourceServiceQA implements DatasourceService{
    @Override
    public String getEnv() {
        return "QA";
    }
}
