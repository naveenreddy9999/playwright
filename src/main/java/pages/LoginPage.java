package pages;

import Utilities.CommonFunctions;
import Utilities.CommonInterfaces;
import Utilities.PropertyReader;
import com.microsoft.playwright.Page;
import pageSetUp.BrowsersSetUp;
import org.testng.Assert;

public class LoginPage {
    private final Page page;
    private CommonInterfaces commonInterfaces;
    private PropertyReader reader;
    private PropertyReader dataReader;

    public LoginPage() {
        this.page = BrowsersSetUp.getInstance().getPage();
        this.commonInterfaces = new CommonFunctions();
        this.reader = new PropertyReader("webElements/loginPageElements");
        this.dataReader = new PropertyReader("testData/loginTestData");
    }

    public void fillPageLoginDetails() {
        commonInterfaces.fill(reader.getProperty("firstName"),dataReader.getProperty("firstName"));
        commonInterfaces.fill(reader.getProperty("lastName"),dataReader.getProperty("lastName"));
        commonInterfaces.fill(reader.getProperty("mobileNumber"),dataReader.getProperty("mobileNumber"));
        commonInterfaces.fill(reader.getProperty("businessName"),dataReader.getProperty("businessName"));
        commonInterfaces.fill(reader.getProperty("email"),dataReader.getProperty("email"));
        int num1 = Integer.parseInt(commonInterfaces.getText(reader.getProperty("numberOne")));
        int num2 = Integer.parseInt(commonInterfaces.getText(reader.getProperty("numberTwo")));
        commonInterfaces.fill(commonInterfaces.selectFirstLocator(reader.getProperty("number")),String.valueOf(num1+num2));
        commonInterfaces.click(reader.getProperty("submit"));
        boolean locator = page.waitForSelector(reader.getProperty("thankYou"), new Page.WaitForSelectorOptions().setTimeout(50000)).isVisible();
        Assert.assertTrue(locator);
        String successMessage = commonInterfaces.getText(reader.getProperty("thankYou"));
        Assert.assertTrue(successMessage.contains("Thank you"));
    }
}
