package testNGTests;

import Utilities.CommonFunctions;
import Utilities.CommonInterfaces;
import pageSetUp.BrowsersSetUp;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TestOne {
    BrowsersSetUp drivers;

    @Test
    @Parameters("browser")
    public void launchChrome(String browser) {
        BrowsersSetUp.getInstance().setDriver(browser);
        BrowsersSetUp.getInstance().navigatePage("https://phptravels.com/demo/");
        CommonInterfaces commonFunctions = new CommonFunctions();
        System.out.println(commonFunctions.pageTitle());
        LoginPage loginPage = new LoginPage();
        loginPage.fillPageLoginDetails();
        BrowsersSetUp.getInstance().closePage();
    }

    @AfterSuite
    public void closePageAndSession() {
        System.out.println("Session close");
        BrowsersSetUp.getInstance().closeSession();
    }

}
