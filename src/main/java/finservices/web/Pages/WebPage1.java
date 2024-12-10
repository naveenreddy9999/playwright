package finservices.web.Pages;

import finservices.mobile.utiities.AndroidBase;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebPage1 {

    WebDriver webdriver;

    public WebPage1(WebDriver webdriver) {
        this.webdriver =webdriver;
        //androidbase = new AndroidBase(Androidmobdriver);
        PageFactory.initElements(webdriver,this);
    }

    @FindBy(xpath="(//a[text()='Connect with us'])[1]")
    public static WebElement addeartext ;


    public static void clickonlink() throws InterruptedException {
            Thread.sleep(3000);
        addeartext.click();
        System.out.println("clicked...");
    }

}
