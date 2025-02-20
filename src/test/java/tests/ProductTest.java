package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConfigReader;

public class ProductTest extends BaseTest{

    @Test(priority = 1 , groups = "regression")
    public void ProductTest(){
        String webSiteUrl = ConfigReader.getProperty("url");
        getAppLibrary().getFlowsLibrary().navigateToUrl(webSiteUrl);
        getAppLibrary().getPageLibrary().getMainPage().closedCookie();
        getAppLibrary().getPageLibrary().getMainPage().searchProduct();
        String actualResult = getAppLibrary().getPageLibrary().getProductListPage().searchProductVerification();
        String expectedAccountText = "Çadır";
        Assert.assertEquals(actualResult,expectedAccountText);
    }

    @Test(priority = 2 , groups = "regression")
    public void ProductFilterProcess(){
        getAppLibrary().getPageLibrary().getProductListPage().productFilter();
        String actualResult = getAppLibrary().getPageLibrary().getProductListPage().searchProductVerification();
        String expectedProductsAfterFilteringText = "Husky Çadır";
        Assert.assertEquals(actualResult, expectedProductsAfterFilteringText);
    }

    @Test(priority = 3 , groups = "regression")
    public void goToProductDetail(){
        String actualResult = getAppLibrary().getPageLibrary().getProductListPage().getProductName();
        getAppLibrary().getPageLibrary().getProductListPage().goToTheProductDetailPage();
        getAppLibrary().getPageLibrary().getProductDetailPage().productDetailPage();
        String expectedProductDetailName = getAppLibrary().getPageLibrary().getProductDetailPage().getProductDetailName();
        Assert.assertEquals(actualResult, expectedProductDetailName);
    }
}
