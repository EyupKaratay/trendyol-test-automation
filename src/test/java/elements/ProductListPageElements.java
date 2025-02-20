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

    @FindBy(css = "#sticky-aggregations > div > div:nth-child(3) > div.fltrs > div > div > div:nth-child(2) > div > a > div.chckbox")
    public WebElement brandFilter;

    @FindBy(css = "#sticky-aggregations > div > div:nth-child(5) > div.fltr-cntnr-ttl-area > div.fltr-cntnr-ttl")
    public WebElement capacity;

    @FindBy(css = "div#sticky-aggregations div:nth-child(5) > div.fltrs > div > div > div:nth-child(2) > div > a > div.chckbox")
    public WebElement capacityFilter;

    @FindBy(css = "div#sticky-aggregations div:nth-child(6) > div.fltr-cntnr-ttl-area > div.fltr-cntnr-ttl")
    public WebElement priceFilter;

    @FindBy(css = "div#sticky-aggregations input.fltr-srch-prc-rng-input.min")
    public WebElement minPrice;

    @FindBy(css = "div#sticky-aggregations input.fltr-srch-prc-rng-input.max")
    public WebElement maxPrice;

    @FindBy(css = "div#sticky-aggregations button")
    public WebElement priceButton;

    @FindBy(xpath = "(// span[@class='prdct-desc-cntnr-ttl'])[12]")
    public WebElement productBrandAfterFiltering;

    @FindBy(xpath = "(// span[@class='prdct-desc-cntnr-name hasRatings'])[10]")
    public WebElement productModelAfterFiltering;

    @FindBy(xpath = "(// div[@class='product-desc-sub-text'])[9]")
    public WebElement productCategoryAfterFiltering;

}
