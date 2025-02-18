package pages;

import elements.MainPageElements;
import utility.Utility;

public class MainPage extends Utility{
    MainPageElements mainPageElements = new MainPageElements();

    public void closedCookie(){
        clickElementWithWait(mainPageElements.cookie);
    }

    public void navigateToLoginPage() {
        clickElementWithWait(mainPageElements.loginLink);
    }

    public void searchProduct() {
        clickElementWithWait(mainPageElements.searchBox);
        sendKeyToElement(mainPageElements.searchBox,"Çadır");
        clickElementWithWait(mainPageElements.searchBoxButton);
    }
}
