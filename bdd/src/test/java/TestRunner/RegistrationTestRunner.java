package TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"src/test/resources/Features/Registration.feature"},
    glue = {"StepDefinitions.Registration"},
    plugin = {
        "pretty",
        "html:target/cucumber-html-report.html",
        
    },
    monochrome = true
)
public class RegistrationTestRunner extends AbstractTestNGCucumberTests {
}

