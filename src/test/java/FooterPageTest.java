import java.awt.AWTException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.SignUpPage;
import Utilities.TestUtility;
import Base.BaseClass;
import Pages.FooterPage;

public class FooterPageTest extends BaseClass{
    SignUpPage signUpPage;
    WebDriverWait wait;
    TestUtility TestUtility;
    FooterPage Footer;

    public FooterPageTest(){
        super();
    }

    @BeforeMethod
    public void Setup() throws InterruptedException, AWTException {
        OpenHomePage();
        signUpPage = new SignUpPage();
        TestUtility = new TestUtility();
        Footer =new FooterPage();
    }

    @Test
    public void Footers() throws InterruptedException,AWTException{
        Footer.Footers();
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
