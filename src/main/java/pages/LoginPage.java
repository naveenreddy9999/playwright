package pages;

import Utilities.CommonFunctions;
import Utilities.PropertyReader;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.testng.Assert;

public class LoginPage {
    private final Page page;
    private CommonFunctions commonFunctions;
    private PropertyReader reader;
    private PropertyReader dataReader;

    public LoginPage(Page page) {
        this.page = page;
        this.commonFunctions = new CommonFunctions(page);
        this.reader = new PropertyReader("webElements/loginPageElements");
        this.dataReader = new PropertyReader("testData/loginTestData");
    }

    public void fillPageLoginDetails() {
        commonFunctions.fill(reader.getProperty("firstName"),dataReader.getProperty("firstName"));
        commonFunctions.fill(reader.getProperty("lastName"),dataReader.getProperty("lastName"));
        commonFunctions.fill(reader.getProperty("mobileNumber"),dataReader.getProperty("mobileNumber"));
        commonFunctions.fill(reader.getProperty("businessName"),dataReader.getProperty("businessName"));
        commonFunctions.fill(reader.getProperty("email"),dataReader.getProperty("email"));
        int num1 = Integer.parseInt(commonFunctions.getText(reader.getProperty("numberOne")));
        int num2 = Integer.parseInt(commonFunctions.getText(reader.getProperty("numberTwo")));
        commonFunctions.fill(commonFunctions.selectFirstLocator(reader.getProperty("number")),String.valueOf(num1+num2));
        commonFunctions.click(reader.getProperty("submit"));
        boolean locator = page.waitForSelector(reader.getProperty("thankYou"), new Page.WaitForSelectorOptions().setTimeout(50000)).isVisible();
        Assert.assertTrue(locator);
        String successMessage = commonFunctions.getText(reader.getProperty("thankYou"));
        Assert.assertTrue(successMessage.contains("Thank you"));
    }
}
