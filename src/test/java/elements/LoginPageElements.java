package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class LoginPageElements {

    public LoginPageElements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "input#login-email")
    public WebElement email;

    @FindBy(css = "input#login-password-input")
    public WebElement password;

    @FindBy(css = "div#login-register button[type=\"submit\"] > span")
    public WebElement loginButton;
}
