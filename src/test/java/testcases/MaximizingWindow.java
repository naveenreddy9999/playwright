package testcases;

import com.microsoft.playwright.*;

import java.util.ArrayList;

public class MaximizingWindow {

    public static void main(String[] args) {

        Playwright playwright = Playwright.create();
        ArrayList<String> arguments = new ArrayList<>();
        arguments.add("--start-maximized");
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("msedge").setHeadless(false).setArgs(arguments));
        BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));

        Page page = browserContext.newPage();
        page.navigate("https://www.selenium.dev/downloads/");
        page.close();
        playwright.close();
    }
}
