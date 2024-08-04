package testcases;

import com.microsoft.playwright.*;
import org.testng.Assert;

public class LocatorSession {

    public static void main(String[] args){
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
        Page page = browser.newPage();
        page.setDefaultTimeout(50000);
        page.navigate("https://phptravels.com/demo/",new Page.NavigateOptions().setTimeout(5000));
        System.out.println(page.title());
        Locator firstname = page.locator("//*[@name='first_name']");
        firstname.fill("naveen");
        Locator lastName = page.locator("//*[@name='last_name']");
        lastName.fill("reddy");
        page.locator("//*[@name='whatsapp']").fill("9705901248");
        page.locator("//*[@placeholder='Business Name']").fill("agriculture");
        page.locator("//*[@placeholder='Email']").fill("naveen@gmail.com");
        String numOne = page.locator("#numb1").textContent();
        int num1 = Integer.parseInt(numOne);
        System.out.println("Number one : " + num1);
        String numTwo = page.locator("#numb2").textContent();
        int num2 = Integer.parseInt(numTwo);
        System.out.println("Number Two : " + num2);
        page.locator("#number").first().fill(String.valueOf(num1 + num2));
        page.locator("//*[text()='Submit']/..").click();
        boolean locator = page.waitForSelector("//h2/child::strong[normalize-space(text()='Thank you')]",new Page.WaitForSelectorOptions().setTimeout(50000)).isVisible();
        Assert.assertTrue(locator);
        String successMessage = page.locator("//h2/child::strong[normalize-space(text()='Thank you')]").textContent();
        Assert.assertTrue(successMessage.contains("Thank you"));
    }
}
