package runners;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith (Cucumber.class)

@CucumberOptions(
    features="src/test/resources/features",
        glue="stepDefinitions",
        tags = "@amazon",
        dryRun = false
        )

public class Runner {

}
