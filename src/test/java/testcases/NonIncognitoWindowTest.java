package testcases;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import java.nio.file.Paths;

public class NonIncognitoWindowTest {

    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        BrowserContext browserContext= playwright.chromium().launchPersistentContext(Paths.get("C:\\Users\\NAVEBAND\\AppData\\Local\\Google\\Chrome\\User Data\\Default"),new BrowserType.LaunchPersistentContextOptions().setHeadless(false).setExecutablePath(Paths.get("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe")));
        Page page = browserContext.newPage();
        page.navigate("https://www.selenium.dev/downloads/");
        System.out.println(page.title());
//        page.close();
//        playwright.close();
    }
}
