package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConfigReader;

public class ProductTest extends BaseTest{

    @Test(priority = 1 , groups = "regression")
    public void ProductTest(){
        testCaseId ="7";
        String webSiteUrl = ConfigReader.getProperty("url");
        getAppLibrary().getFlowsLibrary().navigateToUrl(webSiteUrl);
        getAppLibrary().getPageLibrary().getMainPage().closedCookie();
        getAppLibrary().getPageLibrary().getMainPage().searchProduct();

        String actualResult = getAppLibrary().getPageLibrary().getProductListPage().searchProductVerification();
        String expectedAccountText = "Kol Saati";
        Assert.assertEquals(actualResult,expectedAccountText);
    }

    @Test(priority = 2 , groups = "regression")
    public void ProductFilterProcess(){
        testCaseId ="8";
        getAppLibrary().getPageLibrary().getProductListPage().productFilter();
        String actualResult = getAppLibrary().getPageLibrary().getProductListPage().searchProductVerification();
        String expectedProductsAfterFilteringText = "Casio Erkek Saat";
        Assert.assertEquals(actualResult, expectedProductsAfterFilteringText);
    }

    @Test(priority = 3 , groups = "regression")
    public void goToProductDetail(){
        testCaseId ="9";
        String actualResult = getAppLibrary().getPageLibrary().getProductListPage().getProductName();
        getAppLibrary().getPageLibrary().getProductListPage().goToTheProductDetailPage();
        getAppLibrary().getPageLibrary().getProductDetailPage().productDetailPage();
        String expectedProductDetailName = getAppLibrary().getPageLibrary().getProductDetailPage().getProductDetailName();
        Assert.assertEquals(actualResult, expectedProductDetailName);
    }

    @Test(priority = 4, groups = "regression")
    public void addToCartProcess(){
        testCaseId ="10";
        String actualResult = getAppLibrary().getPageLibrary().getProductDetailPage().addToCart();
        String expectedNumberOfProducts = "1";
        Assert.assertEquals(actualResult, expectedNumberOfProducts);
    }
}
