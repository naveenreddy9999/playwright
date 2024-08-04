package testNGTests;

import Utilities.CommonFunctions;
import driverSetUp.Drivers;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TestOne {
    Drivers drivers;

    @Test
    @Parameters("browser")
    public void launchChrome(String browser) {
        drivers = new Drivers();
        drivers.setDriver(browser);
        drivers.navigatePage("https://phptravels.com/demo/");
        CommonFunctions commonFunctions = new CommonFunctions(drivers.getPage());
        System.out.println(commonFunctions.pageTitle());
        LoginPage loginPage = new LoginPage(drivers.getPage());
        loginPage.fillPageLoginDetails();
        drivers.closePage();
    }

    @AfterSuite
    public void closePageAndSession() {
        System.out.println("Session close");
        drivers.closeSession();
    }

}
