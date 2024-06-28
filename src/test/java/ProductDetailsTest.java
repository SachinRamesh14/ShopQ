import java.awt.AWTException;
import java.io.IOException;

import Pages.MyAccountPage;
import Pages.ProductListingPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.SignUpPage;
import Utilities.TestUtility;
import Base.BaseClass;
import Pages.ProductDetailsPage;

public class ProductDetailsTest extends BaseClass {

    SignUpPage signUpPage;
    WebDriverWait wait;
    TestUtility TestUtility;
    ProductDetailsPage productDetailsPage;

    public ProductDetailsTest() {
        super();
    }

    @BeforeMethod
    public void Setup() throws InterruptedException, AWTException {
        OpenHomePage();
        signUpPage = new SignUpPage();
        TestUtility = new TestUtility();
        productDetailsPage =new ProductDetailsPage();
    }

    @Test
    public void productDetails() throws InterruptedException, AWTException{

        productDetailsPage.ProductDetails();
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
