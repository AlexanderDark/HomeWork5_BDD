import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/",
        glue= {"steps"},
        monochrome = true,
        plugin = {"pretty",
                "html:target/cucumber-reports/task6.html"})
public class RunnerTest {

}
