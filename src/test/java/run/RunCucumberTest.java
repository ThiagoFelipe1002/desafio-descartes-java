package run;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "steps_definition",
    strict = true,
    dryRun = false,
    plugin = {
        "pretty",
        "junit:target/cucumber-reports/cucumber.xml",
        "json:target/cucumber-reports/cucumber.json"
    }
)

public class RunCucumberTest {
}
