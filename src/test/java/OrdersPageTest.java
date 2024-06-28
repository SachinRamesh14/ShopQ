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
import Pages.MyWishlistPage;
import Pages.MyOrdersPage;

public class OrdersPageTest extends BaseClass {

    SignUpPage signUpPage;
    WebDriverWait wait;
    TestUtility TestUtility;
    MyAccountPage MyAccount;
    MyWishlistPage myWishlistPage;
    MyOrdersPage myOrdersPage;

    public OrdersPageTest(){
        super();
    }

    @BeforeMethod
    public void Setup() throws InterruptedException, AWTException
    {
        OpenHomePage();
        signUpPage =new SignUpPage();
        TestUtility =new TestUtility();
        MyAccount =new MyAccountPage();
        myWishlistPage =new MyWishlistPage();
        myOrdersPage = new MyOrdersPage();
    }

    @Test
    public void MyOrdersPage() throws InterruptedException, AWTException
    {
       myOrdersPage.MyOrdersDetails();

    }

    @Test
    public void OrderProduct() throws InterruptedException, AWTException
    {
        myOrdersPage.OrderProduct();
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
