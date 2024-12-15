package stepDefinition.web;

import finservices.web.Drivers.WebDriverSetup;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import utilities.EnvironmentReader;
import utilities.PropertyReader;

public class webhooks {
    @BeforeAll
    public static void beforescenario (){
        if(EnvironmentReader.getProperty("AutomationType").equalsIgnoreCase("WEB")) {
            WebDriverSetup.getInstance().CreateWebDriver();
            WebDriverSetup.getInstance().getDriver();
        }
    }

    @AfterAll
    public static void afterscenario(){
        if(EnvironmentReader.getProperty("AutomationType").equalsIgnoreCase("WEB")) {
            WebDriverSetup.getInstance().getDriver().quit();
            System.out.println("driver is quit");
        }

    }
}
