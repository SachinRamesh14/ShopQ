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
import Pages.MyAccountPage;

public class MyAccountPageTest extends BaseClass{

    SignUpPage signUpPage;
    WebDriverWait wait;
    TestUtility TestUtility;
    MyAccountPage MyAccount;

    public MyAccountPageTest() {
        super();
    }

    @BeforeMethod
    public void Setup() throws InterruptedException, AWTException
    {
        OpenHomePage();
        signUpPage =new SignUpPage();
        TestUtility =new TestUtility();
        MyAccount =new MyAccountPage();
    }

    @Test
    public void Editprofile() throws InterruptedException, AWTException, IOException
    {
        MyAccount.EditProfile();

    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }


}
