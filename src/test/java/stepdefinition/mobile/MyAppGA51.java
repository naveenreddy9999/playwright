package stepdefinition.mobile;

import finservices.mobile.Drivers.MobDriverBase;
import finservices.mobile.Pages.MyAppHomePage;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class MyAppGA51 {
    MobDriverBase mobDriverBase;
    AppiumDriver Appiummobdriver;
    MyAppHomePage myapphomepage ;

    public MyAppGA51(){
        mobDriverBase= new MobDriverBase();
    }

    @Given("user connects to MyApp in GlaxyA51")
    public void user_connects_to_my_app_in_glaxy_a51() throws MalformedURLException, InterruptedException {
        Appiummobdriver= mobDriverBase.CreateMobDriver();
        myapphomepage = new MyAppHomePage(Appiummobdriver);
    }
    @When("user clicks on Agree and continuye")
    public void user_clicks_on_agree_and_continuye() throws InterruptedException {
        myapphomepage. clickonAgreebutton();
    }



}
