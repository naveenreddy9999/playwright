package stepdefinition.web;

import finservices.web.Drivers.WebDriverSetup;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class webhooks {

    @BeforeAll
    public static void beforescenario (){


            WebDriverSetup.getInstance().CreateWebDriver();
            WebDriverSetup.getInstance().getDriver();


    }

    @AfterAll
    public static void afterscenario(){
        WebDriverSetup.getInstance().getDriver().quit();
        System.out.println("driver is quit");

    }
}
