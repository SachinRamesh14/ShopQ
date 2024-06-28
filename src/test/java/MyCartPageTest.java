
import java.awt.AWTException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.SignUpPage;
import Utilities.TestUtility;
import Base.BaseClass;
import Pages.MyCartPage;

public class MyCartPageTest extends BaseClass {

    SignUpPage signUpPage;
    WebDriverWait wait;
    TestUtility TestUtility;
    MyCartPage myCartPage;

    public MyCartPageTest() {
        super();
    }
    @BeforeMethod
    public void Setup() throws InterruptedException, AWTException
    {
        OpenHomePage();
        signUpPage =new SignUpPage();
        TestUtility =new TestUtility();
        myCartPage =new MyCartPage();
    }
    @Test
    public void Addtocart() throws InterruptedException,AWTException
    {
        myCartPage.AddtoCart();
    }

    @Test
    public void MyCart() throws InterruptedException, AWTException
    {
        myCartPage.MyCart();
    }

    @Test
    public void Removecart() throws InterruptedException, AWTException
    {
        myCartPage.AddtoCart();
        myCartPage.RemoveCart();
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
