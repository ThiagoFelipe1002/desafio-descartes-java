package run;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepsDefinition",
        strict = true,
        dryRun = false,
        plugin = {
                "pretty",
                "junit:target/cucumber-reports/cucumber.xml",
                "json:target/cucumber-reports/cucumber.json"
        }
)

public class RunCucumber {
}