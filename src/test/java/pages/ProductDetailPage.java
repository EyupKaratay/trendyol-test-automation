package pages;

import elements.ProductDetailPageElements;
import utility.Utility;

public class ProductDetailPage extends Utility {
    ProductDetailPageElements productDetailPageElements = new ProductDetailPageElements();

    public void productDetailPage(){
        switchToNewTab();
        clickElementWithWait(productDetailPageElements.popup);
    }

    public String getProductDetailName() {
        return getTextElement(productDetailPageElements.productDetailBrand)
                + " " + getTextElement(productDetailPageElements.productDetailModel);
    }

    public String addToCart() {
        clickElementWithWait(productDetailPageElements.addToCartButton);
        return getTextElement(productDetailPageElements.numberOfProducts);
    }
}