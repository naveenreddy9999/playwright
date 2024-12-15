/*
package stepdefinition.mobile;

import finservices.mobile.Drivers.AndroidDriverSetup;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

import java.net.MalformedURLException;

public class MobileHooks {

    @BeforeAll
    public static void beforescenario (){

        try{
            AndroidDriverSetup.getInstance().CreateMobDriver();
            AndroidDriverSetup.getInstance().getDriver();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterAll
    public static void afterscenario(){
        AndroidDriverSetup.getInstance().getDriver().quit();
        System.out.println("driver is quit");

    }
}
*/
