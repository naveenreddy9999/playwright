package testcases;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import java.awt.*;

public class BrowserContext {
    public static Page page;
    public static Playwright playwright;
    public static Browser browser;

    public static void main(String[] args) throws InterruptedException {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));

        com.microsoft.playwright.BrowserContext browserContext1 = browser.newContext(new Browser.NewContextOptions().setViewportSize((int) width, (int) height));
        Page pg1 = browserContext1.newPage();
        pg1.navigate("https://www.selenium.dev/downloads/");
        System.out.println(pg1.title());
        Thread.sleep(4000);

        com.microsoft.playwright.BrowserContext browserContext2 = browser.newContext(new Browser.NewContextOptions().setViewportSize((int) width, (int) height));
        Page pg2 = browserContext2.newPage();
        pg2.navigate("https://mvnrepository.com/artifact/com.microsoft.playwright/playwright/");
        System.out.println(pg2.title());
        //Thread.sleep(4000);
       /* page.goBack(new Page.GoBackOptions().setTimeout(500));
        Thread.sleep(4000);
        page.goForward(new Page.GoForwardOptions().setTimeout(500));
        Thread.sleep(4000);
        page.reload();
        Thread.sleep(4000);*/
       // page1.close();
        playwright.close();
    }
}
