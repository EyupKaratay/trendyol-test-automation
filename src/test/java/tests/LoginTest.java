package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConfigReader;

public class LoginTest extends BaseTest {

    @Test
    public void LoginTest(){
        String webSiteUrl = ConfigReader.getProperty("url");
        getAppLibrary().getFlowsLibrary().navigateToUrl(webSiteUrl);
        getAppLibrary().getPageLibrary().getMainPage().closedCookie();
        String actualResult = getAppLibrary().getPageLibrary().getLoginPage().loginProcess();
        String expectedAccountText = "Hesabım";
        Assert.assertEquals(actualResult,expectedAccountText);
    }
}
