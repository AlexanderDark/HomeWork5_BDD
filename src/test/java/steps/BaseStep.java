package steps;

import HW5.BddspringApplication;
import configSpring.Cfg;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = Cfg.class)
@CucumberContextConfiguration
@SpringBootTest(classes = BddspringApplication.class)
public class BaseStep {
}
