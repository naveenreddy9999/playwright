package testcases;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.ColorScheme;

import java.nio.file.Paths;

public class CheckBoxes {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage(new Browser.NewPageOptions()
                .setColorScheme(ColorScheme.DARK));

        page.navigate("https://github.com/login");
        page.getByLabel("Username or email address").fill("naveen");
        Locator l =page.getByLabel("Username or email address");
        l.highlight();
        page.screenshot(new Page.ScreenshotOptions()
                .setPath(Paths.get("screenshot1.png")).setFullPage(false));

//        page.locator("input[value='radio1']").click();
//
//        boolean radio = page.locator("input[value='radio1']").isChecked();
//
//        System.out.println(radio);
//
//        page.locator("select").click();
//        page.locator("select").selectOption("Option1");

    }
}
