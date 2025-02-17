package utility.library;

import pages.LoginPage;
import pages.ProductDetailPage;
import pages.ProductListPage;
import pages.MainPage;
import pages.CartPage;

public class PageLibrary {
    LoginPage loginPage;
    ProductListPage productListPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;
    MainPage mainPage;

    public PageLibrary() {
        loginPage = new LoginPage();
        productListPage = new ProductListPage();
        productDetailPage = new ProductDetailPage();
        mainPage = new MainPage();
        cartPage = new CartPage();
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public ProductListPage getProductListPage() {
        return productListPage;
    }

    public ProductDetailPage getProductDetailPage() {
        return productDetailPage;
    }

    public MainPage getMainPage(){
        return mainPage;
    }

    public CartPage getCartPage(){
        return cartPage;
    }
}
