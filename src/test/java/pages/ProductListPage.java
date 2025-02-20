package pages;

import elements.ProductListPageElements;
import utility.Utility;

public class ProductListPage extends Utility {

    ProductListPageElements productListPageElements = new ProductListPageElements();

    public String searchProductVerification() {
        return getTextElement(productListPageElements.productMainTitle);
    }

    public void productFilter(){
        clickElementWithWait(productListPageElements.brandFilter);
        waits(500);
        clickElementWithWait(productListPageElements.capacity);
        waits(500);
        scrollAndClickElement(productListPageElements.capacityFilter);
        waits(500);
        scrollAndClickElement(productListPageElements.priceFilter);
        waits(500);
        sendKeyToElement(productListPageElements.minPrice, "4000");
        sendKeyToElement(productListPageElements.maxPrice, "15000");
        clickElementWithWait(productListPageElements.priceButton);
        waits(500);
        refreshPage();
        waits(500);
    }

    public String getProductName(){
        return getTextElement(productListPageElements.productBrandAfterFiltering)
                +' '+ getTextElement(productListPageElements.productModelAfterFiltering)
                +' '+ getTextElement(productListPageElements.productCategoryAfterFiltering);
    }

    public void goToTheProductDetailPage(){
        clickElementWithWait(productListPageElements.productBrandAfterFiltering);
    }

}
