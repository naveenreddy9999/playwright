package pageSetUp;

import com.microsoft.playwright.*;

import java.util.ArrayList;

public class BrowsersSetUp {

    private static BrowsersSetUp browsersSetUp;

    private BrowsersSetUp() {
    }

    public synchronized static BrowsersSetUp getInstance() {
        if (browsersSetUp == null) {
            browsersSetUp = new BrowsersSetUp();
        }
        return browsersSetUp;
    }

    private Playwright playwright;
    private Browser browser;
    private BrowserContext browserContext;
    private Page page;

    private final InheritableThreadLocal<Playwright> playwrightThreadLocal = new InheritableThreadLocal<>();
    private final InheritableThreadLocal<Browser> browserThreadLocal = new InheritableThreadLocal<>();
    private final InheritableThreadLocal<Page> pageThreadLocal = new InheritableThreadLocal<>();
    private final InheritableThreadLocal<BrowserContext> browserContextInheritableThreadLocal = new InheritableThreadLocal<>();

    public Playwright getPlaywright() {
        if(playwright == null){
            playwrightThreadLocal.set(Playwright.create());
        }
        return playwrightThreadLocal.get();
    }

    public Page getPage() {
        return pageThreadLocal.get();
    }

    public Browser getBrowser() {
        return browserThreadLocal.get();
    }

    public BrowserContext getBrowserContext() {
        return browserContextInheritableThreadLocal.get();
    }

    public synchronized void setDriver(String browserName) {
        playwright = Playwright.create();
        playwrightThreadLocal.set(playwright);
        String type = System.setProperty("type","true");
        bollean ss = true;
        if(!type){
            ss = false;
        }
        switch (browserName.toUpperCase()) {
            case "CHROME" -> browser = getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setHeadless(ss).setChannel("chrome").setArgs(setArguments()));
            case "EDGE" -> browser = getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setHeadless(ss).setChannel("msedge").setArgs(setArguments()));
            case "FIREFOX" -> browser = getPlaywright().firefox().launch(new BrowserType.LaunchOptions().setHeadless(ss).setChannel("firefox").setArgs(setArguments()));
        }
        browserThreadLocal.set(browser);
        browserContextInheritableThreadLocal.set(getBrowser().newContext(new Browser.NewContextOptions().setViewportSize(null)));
        page = getBrowserContext().newPage();
        pageThreadLocal.set(page);
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

    public ArrayList<String> setArguments(){
        ArrayList<String> arguments = new ArrayList<>();
        arguments.add("--start-maximized");
        return arguments;
    }
}
