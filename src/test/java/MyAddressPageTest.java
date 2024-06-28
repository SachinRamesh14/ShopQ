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
import Pages.MyAddressPage;

public class MyAddressPageTest extends BaseClass {

    SignUpPage signUpPage;
    WebDriverWait wait;
    TestUtility TestUtility;
    MyAccountPage MyAccount;
    MyAddressPage MyAddress;

    public MyAddressPageTest()
    {
        super();
    }

    @BeforeMethod
    public void Setup() throws InterruptedException, AWTException
    {
        OpenHomePage();
        signUpPage =new SignUpPage();
        TestUtility =new TestUtility();
        MyAccount =new MyAccountPage();
        MyAddress =new MyAddressPage();
    }

    @Test
    public void AddAddress() throws InterruptedException, AWTException
    {
        MyAddress.Addaddress();
        MyAddress.EditAddress();
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }

}
