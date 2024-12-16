package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"classpath:features"},
        glue = {"classpath:stepDefinition"},
        monochrome = true,
        stepNotifications = true,
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@PostUserDetails"


)
public class TestRunner {
}
