
import java.awt.AWTException;

import Pages.HomePage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Pages.SignUpPage;
import Utilities.TestUtility;
import Base.BaseClass;
import org.testng.annotations.Test;


public class HomePageTest extends BaseClass {

    SignUpPage signUpPage;
    WebDriverWait wait;
    TestUtility TestUtility;
    HomePage homepage;


    public HomePageTest() {
        super();
    }

    @BeforeMethod
    public void Setup() throws InterruptedException, AWTException {
        OpenHomePage();
        signUpPage = new SignUpPage();
        TestUtility = new TestUtility();
        homepage = new HomePage();
    }

    @Test
    public void Homepage() throws InterruptedException, AWTException
    {
        homepage.ValidateHomepage();
    }

    @AfterMethod
    public void teardown() throws InterruptedException
    {
        driver.quit();
    }

}