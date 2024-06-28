package Pages;

import java.awt.AWTException;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.BaseClass;

public class MyCartPage extends BaseClass{

    SignUpPage SignIn = new SignUpPage();


    @FindBy(xpath = "//h4[contains(text(), 'Shop now')]")
    WebElement ShopNowbtn;

    @FindBy(xpath = "//div[2]//div[@class='breadcrumb_listing__AVd6H']")
    WebElement AllcategoryBtn;

    @FindBy(xpath = "//img[@class='cardcomponent_cardimage__TH7bI image-fluid ']")
    WebElement SelectProduct;

    @FindBy(xpath = "//div[@class='mx-2 mb-1']")
    WebElement SelectVar1;

    @FindBy(xpath = "//div[3][@class='p-2 mx-1 text-center ']")
    WebElement SelectVar2;

    @FindBy(xpath = "//input[@id='formGroupExampleInput']")
    WebElement EnterZipcode;

    @FindBy(xpath = "//button[text()='Check']")
    WebElement CheckBtn;

    @FindBy(xpath = "//p[text()='Add To Cart']")
    WebElement AddtoCartBtn;

    // My Cart page

    @FindBy(xpath = "//img[@class='header_ShopCart__KHE7U']")
    WebElement MyCart;

    @FindBy(xpath = "//input[@class='cart_textWrap1__C_tM2']")
    WebElement Checkbox;

    @FindBy(xpath = "//p[text()='Move to wishlist']")
    WebElement Movetowishlist;

    @FindBy(xpath = "//p[normalize-space()='Remove']")
    WebElement Remove;

    @FindBy(xpath = "//button[@class='cart_btn1__wxZWk']")
    WebElement Popupremove;

    @FindBy(xpath = "//div[@class='plus']")
    WebElement QtyInc;

    @FindBy(xpath = "//div[@class='minus']")
    WebElement Qtydec;

    @FindBy(xpath = "//button[@type='button'][text()='Checkout']")
    WebElement Checkoutbtn;

    @FindBy(xpath = "//h5[@class='pt-2 cart_font__5SVWA']")
    WebElement Productname;

    @FindBy(xpath = "//div[@class='similarproduct_similarProductsContent__6dVjQ']")
    WebElement Similarproduct;

    public MyCartPage() {
        PageFactory.initElements(driver, this);
    }

    public void AddtoCart() throws InterruptedException, AWTException
    {
        SignIn.Signin();
        Thread.sleep(3000);
        Actions Shpbtn = new Actions(driver);
        Shpbtn.moveToElement(ShopNowbtn).click().perform();
        Actions act = new Actions(driver);
        act.moveToElement(SelectProduct).click().perform();
        SelectVar1.click();
        SelectVar2.click();
        EnterZipcode.sendKeys("641652");
        CheckBtn.click();
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        action.moveToElement(AddtoCartBtn).click().perform();
        Thread.sleep(3000);
    }

    public void MyCart() throws InterruptedException, AWTException
    {
        SignIn.Signin();
        Thread.sleep(3000);
        MyCart.click();
        Thread.sleep(2000);
        Checkbox.click();
        Thread.sleep(3000);
        Checkbox.click();
        QtyInc.click();
        Qtydec.click();
        Productname.click();
        driver.navigate().back();
        Thread.sleep(2000);
        Movetowishlist.click();
        Remove.click();
        Popupremove.click();
        Checkoutbtn.click();
        Thread.sleep(3000);

    }

    public void RemoveCart() throws InterruptedException, AWTException
    {
        MyCart.click();
        Thread.sleep(2000);
        Remove.click();
        Popupremove.click();
        Thread.sleep(2000);
    }

}
