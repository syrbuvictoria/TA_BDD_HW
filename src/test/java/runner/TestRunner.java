package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        stepNotifications = true,
        glue = {"steps", "hooks"},
        features = "src/test/resources/features",
        tags = "@RunTest",
        plugin = {"pretty", "html:target/cucumber-report"}
)
public class TestRunner {

}
