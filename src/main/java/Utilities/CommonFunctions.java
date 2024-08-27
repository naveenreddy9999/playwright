package Utilities;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import pageSetUp.BrowsersSetUp;

public class CommonFunctions implements CommonInterfaces{

    private Page page;
    public CommonFunctions(){
        super();
        this.page = BrowsersSetUp.getInstance().getPage();
    }

    @Override
    public String pageTitle(){
        return page.title();
    }

    @Override
    public void fill(String locator,String value){
       page.locator(locator).fill(value);
    }

    @Override
    public void fill(Locator locator,String value){
        locator.fill(value);
    }

    @Override
    public String getText(String locator){
      return page.locator(locator).textContent();
    }

    @Override
    public Locator selectFirstLocator(String locator){
        return page.locator(locator).first();
    }

    @Override
    public void click(String locator){
        if(page.locator(locator).isVisible()) {
            page.waitForSelector(locator, new Page.WaitForSelectorOptions().setTimeout(5000)).click();
        }
    }
}
