package finservices.mobile.Pages;

import finservices.mobile.utiities.AndroidBase;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetMyNumberPage {

    AppiumDriver Androidmobdriver;
    public AndroidBase androidbase;

    public GetMyNumberPage(AppiumDriver Androidmobdriver) {
        this.Androidmobdriver =Androidmobdriver;
        androidbase = new AndroidBase(Androidmobdriver);
        PageFactory.initElements(Androidmobdriver,this);
    }

    @FindBy(id = "me.number.app.im:id/get_start_btn")
    public static WebElement getstatrtbutton;



    public  void clickonAgreebutton() throws InterruptedException {
        Thread.sleep(3000);
        androidbase.mobfluentwait();

        //clcik on Get My Number
        getstatrtbutton.click();
        System.out.println("clicked on second page....");

    }
}
