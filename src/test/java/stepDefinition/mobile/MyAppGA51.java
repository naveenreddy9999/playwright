
package stepDefinition.mobile;


import finservices.mobile.Drivers.AndroidDriverSetup;
import finservices.mobile.Pages.GetMyNumberPage;
import finservices.mobile.Pages.MyAppHomePage;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class MyAppGA51 {
    public  AppiumDriver Androidmobdriver ;
    public  MyAppHomePage myappphmepage;
    public GetMyNumberPage getmynumberpage;


  public  MyAppGA51(){
        this.Androidmobdriver = AndroidDriverSetup.getInstance().getDriver();
      myappphmepage = new MyAppHomePage(Androidmobdriver);
      getmynumberpage = new GetMyNumberPage (Androidmobdriver);

    }



    @Given("user connects to MyApp in GlaxyA51")
    public void user_connects_to_my_app_in_glaxy_a51() throws MalformedURLException, InterruptedException {
        System.out.println("started");
        /*//AndroidDriverSetup.BeforeSuite= true;
        AndroidDriverSetup.getInstance().CreateMobDriver();
        Androidmobdriver= AndroidDriverSetup.getInstance().getDriver();*/
    }
    @When("user clicks on Agree and continuye")
    public void user_clicks_on_agree_and_continuye() throws InterruptedException {
        myappphmepage.clickonAgreebutton();

    }



    @Then("user clicks on Get your number")
    public void user_clicks_on_get_your_number() throws InterruptedException {
        getmynumberpage.clickonAgreebutton();
    }
}

