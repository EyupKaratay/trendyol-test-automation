package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class ProductListPageElements {

    public ProductListPageElements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "div#search-app h1")
    public WebElement productMainTitle;

}
