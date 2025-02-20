package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class ProductDetailPageElements {

    public ProductDetailPageElements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//a[@class='product-brand-name-with-link']")
    public WebElement productDetailBrand;

    @FindBy(css="h1[class='pr-new-br']>span")
    public WebElement productDetailModel;

    @FindBy(xpath="//aside//button[contains(text(), 'Anladım')]")
    public WebElement popup;

}
