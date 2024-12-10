package finservices.web.Drivers;


import finservices.mobile.Drivers.AndroidDriverSetup;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSetup {

    private static WebDriverSetup driverSetup = null;

    private WebDriverSetup() {
    }

    public static WebDriverSetup getInstance() {
        if (driverSetup == null) {
            driverSetup = new WebDriverSetup();
        }
        return driverSetup;
    }

    public static InheritableThreadLocal<WebDriver> webdriver = new InheritableThreadLocal<>();


    public synchronized WebDriver getDriver() {
        getInstance();
        return webdriver.get();
    }

    public void CreateWebDriver(){
        webdriver.set(new ChromeDriver()) ;
    }
}