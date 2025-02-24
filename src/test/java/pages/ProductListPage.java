package pages;

import elements.ProductListPageElements;
import utility.Utility;

public class ProductListPage extends Utility {
    ProductListPageElements productListPageElements = new ProductListPageElements();

    public String searchProductVerification(){
        return getTextElement(productListPageElements.productMainTitle);
    }

    public void productFilter(){
        clickElementWithWait(productListPageElements.brandButton);
        waits(500);
        scrollAndClickElement(productListPageElements.genderButton);
        waits(500);
        clickElementWithWait(productListPageElements.maleGenderButton);
        waits(500);
        scrollAndClickElement(productListPageElements.priceButton);
        waits(500);
        sendKeyToElement(productListPageElements.minPrice, "1000");
        sendKeyToElement(productListPageElements.maxPrice, "4000");
        clickElementWithWait(productListPageElements.priceSearchButton);
        waits(500);
        refreshPage();
        waits(500);
    }

    public String getProductName(){
        scrollToCenter(productListPageElements.productBrandAfterFiltering);
        return  getTextElement(productListPageElements.productBrandAfterFiltering)
                + " " + getTextElement(productListPageElements.productModelAfterFiltering)
                + " " + getTextElement(productListPageElements.productCategoryAfterFiltering);
    }

    public void goToTheProductDetailPage(){
        clickElementWithWait(productListPageElements.productBrandAfterFiltering);
    }
}