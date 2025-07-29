package testRunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/Features/login.feature",
        glue = "stepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports/cucumber.html"}
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
