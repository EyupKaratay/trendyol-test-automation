package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class MainPageElements {

    public MainPageElements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "button#onetrust-reject-all-handler")
    public WebElement cookie;

    @FindBy(css = "div#sfx-discovery-search-suggestions input")
    public WebElement searchBox;

    @FindBy(css = "[data-testid=\"search-icon\"]")
    public WebElement searchBoxButton;

    @FindBy(css = "div#account-navigation-container div.link.account-user > p")
    public WebElement loginLink;
}
