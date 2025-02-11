package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepDefenition"},
        features = {"src/test/java/features"},
        plugin = {"pretty" , "html:reports/cucumber.html","json:reports/cucumber.json"},
        tags = "@Web"

)
public class CucumberTests {
}
