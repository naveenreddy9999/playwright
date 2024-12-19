package stepDefinition.web;

import finservices.web.Drivers.WebDriverSetup;
import finservices.web.Pages.WebPage1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import utilities.ScenarioReader;

public class WebStepDefinition {
    WebDriver webdriver;
    WebPage1 webpage1;
    public  WebStepDefinition(){
        this.webdriver = WebDriverSetup.getInstance().getDriver();
         webpage1 = new WebPage1(webdriver);
       // getmynumberpage = new GetMyNumberPage(Androidmobdriver);

    }

    @Given("user logs in to web app")
    public void user_logs_in_to_web_app() {
        // Write code here that turns the phrase above into concrete actions
        webdriver.manage().window().maximize();
        webdriver.get("https://addepar.com/");
    }
    @Then("clicks on link")
    public void clicks_on_link() throws InterruptedException {
        //WebPage1 webpage1 = new WebPage1(WebDriverSetup.getInstance().getDriver());
        // Write code here that turns the phrase above into concrete actions
        ScenarioReader.getInstance().attachScreenshot(webdriver,"hello");
        WebPage1.clickonlink();
    }
}
