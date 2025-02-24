package pages;

import elements.LoginPageElements;
import elements.MainPageElements;
import utility.ConfigReader;
import utility.Utility;

public class LoginPage extends Utility {
    LoginPageElements loginPageElements = new LoginPageElements();
    MainPageElements mainPageElements = new MainPageElements();

    public void fillMail() {
        String userLoginEmail= ConfigReader.getProperty("email");
        sendKeyToElement(loginPageElements.email, userLoginEmail);
        clickElementWithWait(loginPageElements.loginButton);
    }

    public void fillPassword() {
        String userLoginPassword= ConfigReader.getProperty("password");
        sendKeyToElement(loginPageElements.password, userLoginPassword);
        clickElementWithWait(loginPageElements.loginButton);
    }

    public void wrongEmailOrPassword() {
        String userLoginEmail= ConfigReader.getProperty("email");
        sendKeyToElement(loginPageElements.email, userLoginEmail);
        String userLoginPassword= "asdasd";
        sendKeyToElement(loginPageElements.password, userLoginPassword);
        clickElementWithWait(loginPageElements.loginButton);
    }

    public String loginProcess() {
        String userLoginEmail= ConfigReader.getProperty("email");
        sendKeyToElement(loginPageElements.email, userLoginEmail);
        String userLoginPassword= ConfigReader.getProperty("password");
        sendKeyToElement(loginPageElements.password, userLoginPassword);
        clickElementWithWait(loginPageElements.loginButton);
        return getLoginVerificationText();
    }

    public String errorMessageControl(){
        return getTextElement(loginPageElements.errorMessage);
    }

    public String getLoginVerificationText() {
        waits(1000);
        return getTextElement(mainPageElements.loginLink);
    }
}