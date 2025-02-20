package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConfigReader;


public class LoginTest extends BaseTest {

    @Test(priority = 1 , groups = {"smoke","regression"})
    public void LoginTest(){
        String webSiteUrl = ConfigReader.getProperty("url");
        getAppLibrary().getFlowsLibrary().navigateToUrl(webSiteUrl);
        getAppLibrary().getPageLibrary().getMainPage().closedCookie();
        getAppLibrary().getPageLibrary().getMainPage().navigateToLoginPage();
        String actualResult = getAppLibrary().getPageLibrary().getLoginPage().loginProcess();
        String expectedAccountText = "Hesabım";
        Assert.assertEquals(actualResult,expectedAccountText);
    }
}
