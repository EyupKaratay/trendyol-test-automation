package pages;

import elements.MainPageElements;
import utility.Utility;

public class MainPage extends Utility{
    MainPageElements mainPageElements = new MainPageElements();

    public void closedCookie(){
        clickElementWithWait(mainPageElements.cookie);
    }

    public void navigateLoginPage(){
        clickElementWithWait(mainPageElements.loginLink);
    }
    public void searchProduct(){
        clickElementWithWait(mainPageElements.loginLink);
        sendKeyToElement(mainPageElements.searchBox , "Çadır");
        clickElementWithWait(mainPageElements.loginLink);
    }
}
