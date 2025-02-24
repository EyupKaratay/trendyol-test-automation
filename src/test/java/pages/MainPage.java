package pages;

import elements.MainPageElements;
import utility.Utility;

public class MainPage extends Utility {
    MainPageElements mainPageElements = new MainPageElements();

    public void navigateToLoginPage() {
        closedCookie();
        clickElementWithWait(mainPageElements.loginLink);
    }

    public void closedCookie() {
        clickElementWithWait(mainPageElements.cookie);
    }

    public void searchProduct() {
        clickElementWithWait(mainPageElements.searchBox);
        sendKeyToElement(mainPageElements.searchBox,"Kol Saati");
        clickElementWithWait(mainPageElements.searchBoxButton);
    }
}
