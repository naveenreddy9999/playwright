package testNGTests;

import Utilities.CommonFunctions;
import driverSetUp.Drivers;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

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
        drivers.closePage();
    }

//    @Test
//    public void launchMsEdge(){
//        Drivers.getInstance().setDriver("EDGE");
//        Drivers.getInstance().navigatePage("https://phptravels.com/demo/");
//        CommonFunctions commonFunctions = new CommonFunctions(Drivers.getInstance().getPage());
//        System.out.println(commonFunctions.pageTitle());
//        Drivers.getInstance().closePage();
//    }
//
//    @Test
//    public void launchFirefox(){
//        Drivers.getInstance().setDriver("FIREFOX");
//        Drivers.getInstance().navigatePage("https://phptravels.com/demo/");
//        CommonFunctions commonFunctions = new CommonFunctions(Drivers.getInstance().getPage());
//        System.out.println(commonFunctions.pageTitle());
//        Drivers.getInstance().closePage();
//    }

    @AfterSuite
    public void closePageAndSession() {
        System.out.println("Session close");
        drivers.closeSession();
    }

}
