package finservices.mobile.Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class GetMyNumberPage {

    AppiumDriver GetMyPagedriver;

    public GetMyNumberPage(AppiumDriver appiummobdriver) {
        this.GetMyPagedriver = appiummobdriver;
    }


    public  void clickonAgreebutton() throws InterruptedException {
        Thread.sleep(3000);


        //clcik on Get My Number
        GetMyPagedriver.findElement(By.id("me.number.app.im:id/get_start_btn")).click();
        System.out.println("clicked....");
        // mobdriver.quit();
    }
}
