package testcases;

import com.microsoft.playwright.*;

import java.awt.*;

public class LaunchBrowser {
    public static Page page;
    public static Playwright playwright;
    public static Browser browser;

    public static void main(String[] args) throws InterruptedException {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
        BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setViewportSize((int) width, (int) height));
        page = browserContext.newPage();
        page.navigate("https://www.selenium.dev/downloads/");
        System.out.println(page.title());
        Thread.sleep(4000);
        page.navigate("https://mvnrepository.com/artifact/com.microsoft.playwright/playwright/");
        Thread.sleep(4000);
        page.goBack(new Page.GoBackOptions().setTimeout(500));
        Thread.sleep(4000);
        page.goForward(new Page.GoForwardOptions().setTimeout(500));
        Thread.sleep(4000);
        page.reload();
        Thread.sleep(4000);
        page.close();
        playwright.close();
    }
}
