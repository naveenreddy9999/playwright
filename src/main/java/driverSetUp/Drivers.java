package driverSetUp;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Drivers {

//    private static Drivers driver;
//
//    private Drivers() {
//    }
//
//    public static Drivers getInstance() {
//        if (driver == null) {
//            driver = new Drivers();
//        }
//        return driver;
//    }

    public Playwright playwright;
    public Browser browser;

    private final InheritableThreadLocal<Playwright> playwrightThreadLocal = new InheritableThreadLocal<>();
    private final InheritableThreadLocal<Browser> browserThreadLocal = new InheritableThreadLocal<>();
    private final InheritableThreadLocal<Page> pageThreadLocal = new InheritableThreadLocal<>();

    public Playwright getPlaywright() {
        return playwrightThreadLocal.get();
    }

    public Page getPage() {
        return pageThreadLocal.get();
    }

    public Browser getBrowser() {
        return browserThreadLocal.get();
    }

    public void setDriver(String browserName) {
        playwright = Playwright.create();
        playwrightThreadLocal.set(playwright);
        switch (browserName.toUpperCase()) {
            case "CHROME" -> {
                browser = getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
                browserThreadLocal.set(browser);
                pageThreadLocal.set(getBrowser().newPage());
            }
            case "EDGE" -> {
                browser = getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("msedge"));
                browserThreadLocal.set(browser);
                pageThreadLocal.set(getBrowser().newPage());
            }
            case "FIREFOX" -> {
                browser = getPlaywright().firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("firefox"));
                browserThreadLocal.set(browser);
                pageThreadLocal.set(getBrowser().newPage());
            }
        }
    }

    public void navigatePage(String url) {
        getPage().navigate(url, new Page.NavigateOptions().setTimeout(100000));
    }

    public void closePage() {
        getPage().close();
    }

    public void closeSession() {
        if (getPage() != null) {
            getPlaywright().close();
        }
    }
}
