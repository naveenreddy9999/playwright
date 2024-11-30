package finservices.mobile.Drivers;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.SessionId;

import java.net.MalformedURLException;
import java.net.URL;

public class MobDriverBase {

   static AppiumDriver mobdriver;




    public  AppiumDriver CreateMobDriver() throws MalformedURLException, InterruptedException {

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("appium:deviceName","Galaxy A51");
        cap.setCapability("appium:platformName","Android");
        cap.setCapability("appium:platformVersion","10.0");
        cap.setCapability("appium:udid","RZ8N502TADF");
        cap.setCapability("appium:appPackage","me.number.app.im");
        cap.setCapability("appium:appActivity","me.number.app.im.activity.NumberSplashActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        mobdriver = new AppiumDriver(url,cap);
        System.out.println("Application started");
        SessionId sessid = mobdriver.getSessionId();
        System.out.println("session id --" +sessid);
       return mobdriver;
    }


}
