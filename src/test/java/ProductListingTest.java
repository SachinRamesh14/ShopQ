import java.awt.AWTException;
import java.io.IOException;

import Pages.MyAccountPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.SignUpPage;
import Utilities.TestUtility;
import Base.BaseClass;
import Pages.ProductListingPage;

public class ProductListingTest extends BaseClass {
    SignUpPage signUpPage;
    WebDriverWait wait;
    TestUtility TestUtility;
    ProductListingPage productlisting;

    public ProductListingTest() {
        super();
    }

    @BeforeMethod
    public void Setup() throws InterruptedException, AWTException
    {
        OpenHomePage();
        signUpPage =new SignUpPage();
        TestUtility =new TestUtility();
        productlisting =new ProductListingPage();
    }

    @Test
    public void Productlisting() throws InterruptedException, AWTException
    {
        productlisting.productListing();
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }

}
