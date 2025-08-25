package TestRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features",
    glue = {"StepDefinitions"},
    tags = "@regression",   // 👈 Only run scenarios with this tag
    plugin = {"pretty","html:target/cucumber-reports"},
    monochrome = true
)
public class MyTestRunner {
}
