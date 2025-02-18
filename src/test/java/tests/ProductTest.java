package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConfigReader;

public class ProductTest extends BaseTest{
    private String actualResult;

    @Test
    public void ProductTest(){
        String webSiteUrl = ConfigReader.getProperty("url");
        getAppLibrary().getFlowsLibrary().navigateToUrl(webSiteUrl);
        getAppLibrary().getPageLibrary().getMainPage().closedCookie();
        getAppLibrary().getPageLibrary().getMainPage().searchProduct();
        String actualResult = getAppLibrary().getPageLibrary().getProductListPage().searchProductVerification();
        String expectedAccountText = "Çadır";
        Assert.assertEquals(actualResult,expectedAccountText);
    }
}
