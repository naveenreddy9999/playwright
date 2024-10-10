package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ={"classpath:features"},glue = {"stepdefinition"},tags = "@myappmobiletest"


)
public class MobRunner extends AbstractTestNGCucumberTests {
}
