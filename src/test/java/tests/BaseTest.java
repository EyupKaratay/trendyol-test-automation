package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utility.Driver;
import utility.library.AppLibrary;
import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    private static AppLibrary appLibrary;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        appLibrary = new AppLibrary();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        Driver.closeDriver();
    }

    public static AppLibrary getAppLibrary() {
        return appLibrary;
    }
}
