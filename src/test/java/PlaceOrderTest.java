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
import Pages.PlaceOrderPage;

public class PlaceOrderTest extends BaseClass {

    SignUpPage signUpPage;
    WebDriverWait wait;
    TestUtility TestUtility;
    PlaceOrderPage placeOrderPage;


    public PlaceOrderTest() {
        super();
    }

    @BeforeMethod
    public void Setup() throws InterruptedException, AWTException {
        OpenHomePage();
        signUpPage = new SignUpPage();
        TestUtility = new TestUtility();
        placeOrderPage = new PlaceOrderPage();

    }

    @Test
    public void PlaceOrder() throws InterruptedException, AWTException{
        placeOrderPage.PlaceOrder();
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}