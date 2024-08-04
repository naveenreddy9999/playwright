package Utilities;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class CommonFunctions {

    private Page page;

    public CommonFunctions(Page page){
        this.page = page;
    }

    public String pageTitle(){
        return page.title();
    }

    public void fill(String locator,String value){
       page.locator(locator).fill(value);
    }

    public void fill(Locator locator,String value){
        locator.fill(value);
    }

    public String getText(String locator){
      return page.locator(locator).textContent();
    }

    public Locator selectFirstLocator(String locator){
        return page.locator(locator).first();
    }

    public void click(String locator){
        page.locator(locator).click();
    }

}
