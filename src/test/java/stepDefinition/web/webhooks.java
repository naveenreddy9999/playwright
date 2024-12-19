package stepDefinition.web;

import finservices.web.Drivers.WebDriverSetup;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utilities.EnvironmentReader;
import utilities.PropertyReader;
import utilities.ScenarioReader;

public class webhooks {
    @BeforeAll
    public static void beforeALLScenario (){
        if(EnvironmentReader.getProperty("AutomationType").equalsIgnoreCase("WEB")) {
            WebDriverSetup.getInstance().CreateWebDriver();
            WebDriverSetup.getInstance().getDriver();
        }
    }
    @Before
    public static void beforeScenario (Scenario scenario) {
        ScenarioReader.getInstance().setScenario(scenario);
    }
    @AfterAll
    public static void afterScenario(){
        if(EnvironmentReader.getProperty("AutomationType").equalsIgnoreCase("WEB")) {
            WebDriverSetup.getInstance().getDriver().quit();
            System.out.println("driver is quit");
        }

    }
}
