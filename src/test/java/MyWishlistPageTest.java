import java.awt.AWTException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.SignUpPage;
import Utilities.TestUtility;
import Base.BaseClass;
import Pages.MyAccountPage;
import Pages.MyWishlistPage;

public class MyWishlistPageTest extends BaseClass {

    SignUpPage signUpPage;
    WebDriverWait wait;
    TestUtility TestUtility;
    MyAccountPage MyAccount;
    MyWishlistPage myWishlistPage;

    public MyWishlistPageTest(){
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
    }

    @Test
    public void AddtoWishlist() throws InterruptedException,AWTException{

        myWishlistPage.AddWishlist();
    }

    @Test
    public void Wishlist() throws InterruptedException, AWTException
    {
        myWishlistPage.Wishlist();
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
