package playwrightPractice;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.microsoft.playwright.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import reports.ExtentReportListener;
import org.testng.Reporter;
import org.testng.annotations.Test;
import reports.pagesetup;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

import static reports.pagesetup.*;


public class practice {

    public static Page page;

   @Test
    public void  executionMode() throws InterruptedException {

       pagesetup  ps = new pagesetup();
       page = ps.setup();


        page.navigate("https://rahulshettyacademy.com/AutomationPractice/");

        System.out.println("page One : "+page.title());
//       MediaEntityBuilder.createScreenCaptureFromBase64String(takeScreenshot(),"home page");
//        Page pp=   page.waitForPopup(()->{
//            page.locator("//*[.='Open Tab']").click();
//        });
//        System.out.println("page two : "+pp.title());
//
//        Locator l2 = pp.locator("(//*[.='Home'])[1]");
//
//        System.out.println(l2.isVisible());
//
//        l2.highlight();
//        Thread.sleep(10000);
//        pp.close();

//        ExtentReportListener.test.get().log(Status.PASS,pageTakeScreenshot().build());
        ExtentReportListener.test.get().info("login page",pageTakeScreenshot().build());
        System.out.println("page One : "+page.title());
    }
    @AfterTest
    public void afterTest(){
        playwright.close();
    }

}
