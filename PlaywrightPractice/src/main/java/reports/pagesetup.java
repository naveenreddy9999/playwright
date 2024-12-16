package reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.microsoft.playwright.*;

import javax.print.attribute.standard.Media;
import java.nio.file.Paths;
import java.util.Base64;

public class pagesetup {

   public static Page page;
    public static Playwright playwright;
    public Page setup(){
        playwright = Playwright.create();

        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("msedge").setHeadless(false).setExecutablePath(Paths.get("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe")));

        BrowserContext browserContext = browser.newContext();
        page = browserContext.newPage();
        return page;
    }
    public static String takeScreenshot() {
        String base = null;
        try {
            System.out.println("hello taking screenshots");
            String path = System.getProperty("user.dir") + "\\screenshot\\" + System.currentTimeMillis() + ".png";
            System.out.println(path);
            //getPage().screenshot(new Page.ScreenshotOptions().setPath(Paths.get(path)).setFullPage(true));
            byte[] buffer = page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get(path)).setFullPage(true));
            String base64Path = Base64.getEncoder().encodeToString(buffer);
            base= base64Path;
        }catch (Exception e){
            System.out.println("hello I'm exception ");
        }
        return base;
    }

    public static MediaEntityBuilder pageTakeScreenshot() {
//            System.out.println("hello taking screenshots");
//            String path = System.getProperty("user.dir") + "\\screenshot\\" + System.currentTimeMillis() + ".png";
//            System.out.println(path);
            MediaEntityBuilder m = MediaEntityBuilder.createScreenCaptureFromBase64String(takeScreenshot(), "pass");
          return m;
            //getPage().screenshot(new Page.ScreenshotOptions().setPath(Paths.get(path)).setFullPage(true));


    }

}
