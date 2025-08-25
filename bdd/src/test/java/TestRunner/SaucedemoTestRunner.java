package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/Features/saucedemo.feature",
    glue = {"StepDefinitions"},
    plugin = {
        "pretty",
        "html:target/cucumber-html-report.html",
        "json:target/cucumber.json"
    },
    monochrome = true
)
public class SaucedemoTestRunner extends AbstractTestNGCucumberTests {
}
