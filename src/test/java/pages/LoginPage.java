package pages;

import elements.LoginPageElements;
import utility.ConfigReader;
import utility.Utility;
import elements.MainPageElements;

public class LoginPage extends Utility {
    LoginPageElements loginPageElements = new LoginPageElements();
    MainPageElements mainPageElements = new MainPageElements();

    public String loginProcess() {
        performLogin();
        return getLoginVerificationTexts();
    }

    private void performLogin() {
        String userLoginEmail= ConfigReader.getProperty("email");
        String userLoginPassword= ConfigReader.getProperty("password");
        sendKeyToElement(loginPageElements.email, userLoginEmail);
        sendKeyToElement(loginPageElements.password, userLoginPassword);
        clickElementWithWait(loginPageElements.loginButton);
    }

    public String getLoginVerificationTexts() {
        waits(1000);
        return getTextElement(mainPageElements.loginLink);
    }
}
