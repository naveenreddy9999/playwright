package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"classpath:features"}, glue = {"classpath:stepdefinition"},tags = "@myWebTest"


)
public class MobRunner  {
}
