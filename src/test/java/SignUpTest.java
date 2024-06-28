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

public class SignUpTest extends BaseClass{

    SignUpPage signUpPage;
    WebDriverWait wait;
    TestUtility TestUtility;


    public SignUpTest() {
        super();
    }

    @BeforeMethod
    public void Setup() throws InterruptedException, AWTException
    {
        OpenHomePage();
        signUpPage =new SignUpPage();
        TestUtility =new TestUtility();
    }

    @Test(priority = 1)
    public void SignUp() throws InterruptedException,AWTException
    {
        signUpPage.SignUp();
        logger.info("SignUp Successfully");
        Thread.sleep(3000);

    }

    @Test(priority = 2)
    public void SignIn() throws InterruptedException, AWTException, IOException
    {
        signUpPage.Signin();
        logger.info("SignIn Successfully");
        Thread.sleep(2000);
    }

    @AfterMethod
    public void teardown() throws InterruptedException
    {
        driver.quit();
    }



}