package Utilities;

import com.microsoft.playwright.Locator;

public interface CommonInterfaces {

    void fill(String locator, String value);

    void fill(Locator locator, String value);

    void click(String locator);

    String getText(String locator);

    Locator selectFirstLocator(String locator);

    String pageTitle();
}
