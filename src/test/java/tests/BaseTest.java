package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utility.Driver;
import utility.library.AppLibrary;
import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    private static AppLibrary appLibrary;

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        appLibrary = new AppLibrary();
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }

    public static AppLibrary getAppLibrary() {
        return appLibrary;
    }
}
