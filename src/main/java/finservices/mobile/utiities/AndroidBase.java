package finservices.mobile.utiities;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AndroidBase {
    public AppiumDriver Androidmobdriver;
    FluentWait<AppiumDriver> wait ;

public  AndroidBase(AppiumDriver Androidmobdriver){
    this.Androidmobdriver = Androidmobdriver;
}

public void mobfluentwait (){
    System.out.println("in fluent wait");
    wait = new FluentWait<>(Androidmobdriver).withTimeout(Duration.ofSeconds(40))
            .pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class)
            .ignoring(TimeoutException.class).ignoring(StaleElementReferenceException.class);
}


}
