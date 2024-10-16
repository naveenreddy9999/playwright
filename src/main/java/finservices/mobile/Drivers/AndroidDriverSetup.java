package finservices.mobile.Drivers;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.SessionId;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AndroidDriverSetup {

    private static AndroidDriverSetup driverSetup = null;
    private AndroidDriverSetup(){

    }

    public static AndroidDriverSetup getInstance(){
        if (driverSetup == null){
            driverSetup = new AndroidDriverSetup();
        }
        return driverSetup;
    }

    public static boolean BeforeSuite = false;
    //create Appium Android driver
    public static InheritableThreadLocal<AppiumDriver> Androidmobdriver = new InheritableThreadLocal<>();


    public synchronized AppiumDriver getDriver(){
        getInstance();
        return Androidmobdriver.get();
    }


    public void  CreateMobDriver() throws MalformedURLException, InterruptedException {

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("appium:deviceName","Galaxy A51");
        cap.setCapability("appium:platformName","Android");
        cap.setCapability("appium:platformVersion","10.0");
        cap.setCapability("appium:udid","RZ8N502TADF");
        cap.setCapability("appium:appPackage","me.number.app.im");
        cap.setCapability("appium:appActivity","me.number.app.im.activity.NumberSplashActivity");

        String url = String.valueOf(new URL("http://127.0.0.1:4723/wd/hub"));
        Androidmobdriver.set(new AppiumDriver(new URL(url),cap));


        System.out.println("Application started");
        SessionId sessid = getDriver().getSessionId();
        System.out.println("session id --" +sessid);

        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }



}
