package finservices.mobile.Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MyAppHomePage {

    AppiumDriver appdrver;
    public MyAppHomePage(AppiumDriver appiummobdriver) {
        this.appdrver = appiummobdriver;
    }

    public  void clickonAgreebutton() throws InterruptedException {
        Thread.sleep(3000);
        String wecomemessage = appdrver.findElement(By.id("me.number.app.im:id/tv_welcome")).getText();
        System.out.println("welcome message is ::" +wecomemessage);

        //clcik on Agree and continue
        appdrver.findElement(By.id("me.number.app.im:id/agree_and_continue")).click();

        // mobdriver.quit();
    }
}
