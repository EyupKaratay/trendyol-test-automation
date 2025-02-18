package pages;

import elements.ProductListPageElements;
import utility.Utility;

public class ProductListPage extends Utility {

    ProductListPageElements productListPageElements = new ProductListPageElements();

    public String searchProductVerification() {
        return getTextElement(productListPageElements.productMainTitle);
    }
}
