package finservices.mobile.Pages;

import finservices.mobile.Drivers.AndroidDriverSetup;
import finservices.mobile.utiities.AndroidBase;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAppHomePage {

    AppiumDriver Androidmobdriver;
    public AndroidBase androidbase;

    public MyAppHomePage(AppiumDriver Androidmobdriver) {
        this.Androidmobdriver =Androidmobdriver;
        androidbase = new AndroidBase(Androidmobdriver);
        PageFactory.initElements(Androidmobdriver,this);
    }

    @FindBy(id = "me.number.app.im:id/tv_welcome")
    public static WebElement Welcomemessage;

    @FindBy(id = "me.number.app.im:id/agree_and_continue")
    public static WebElement AgreeandConinue;



    public  void clickonAgreebutton() throws InterruptedException {
        Thread.sleep(3000);
        androidbase.mobfluentwait();
        String wecomemessage = Welcomemessage.getText();
        System.out.println("welcome message is ::" +wecomemessage);

        //clcik on Agree and continue
        AgreeandConinue.click();
        System.out.println("clicked");


    }
}
