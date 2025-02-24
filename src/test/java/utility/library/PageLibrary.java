package utility.library;

import pages.LoginPage;
import pages.ProductDetailPage;
import pages.ProductListPage;
import pages.MainPage;

public class PageLibrary {
    LoginPage loginPage;
    ProductListPage productListPage;
    ProductDetailPage productDetailPage;
    MainPage mainPage;

    public PageLibrary() {
        loginPage = new LoginPage();
        productListPage = new ProductListPage();
        productDetailPage = new ProductDetailPage();
        mainPage = new MainPage();
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

}
