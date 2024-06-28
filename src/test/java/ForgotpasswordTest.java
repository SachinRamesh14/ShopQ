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
import Pages.ForgotPasswordPage;

public class ForgotpasswordTest extends BaseClass {

    SignUpPage signUpPage;
    WebDriverWait wait;
    TestUtility TestUtility;
    ForgotPasswordPage Forgotpassword;



    public ForgotpasswordTest() {
        super();
    }

    @BeforeMethod
    public void Setup() throws InterruptedException, AWTException
    {
        OpenHomePage();
        signUpPage =new SignUpPage();
        TestUtility =new TestUtility();
        Forgotpassword =new ForgotPasswordPage();
    }

    @Test
    public void ChangePassword() throws InterruptedException, AWTException
    {
        Forgotpassword.forgotpassword();
    }

    @AfterMethod
    public void teardown()
    {
        driver.quit();
    }
}
