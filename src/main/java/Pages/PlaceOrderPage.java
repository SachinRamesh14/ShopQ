package Pages;

import java.awt.AWTException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.BaseClass;

public class PlaceOrderPage extends BaseClass {

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

    @FindBy(xpath = "//button[@class='productshare_checkButton__YX4v4 btn  btn-sm btn-dark']")
    WebElement CheckBtn;

    @FindBy(xpath = "//button[@class='productshare_buyNow1__o1tkk btn btn-dark}']")
    WebElement BuynowBtn;

    @FindBy(xpath = "//button[text()='Checkout']")
    WebElement CheckOutBtn;

    @FindBy(xpath = "//h6[text()='Add new address']")
    WebElement Addnewaddress;

    @FindBy(xpath = "//input[@name='userName']")
    WebElement Name;

    @FindBy(xpath = "//input[@name='mobileNumber']")
    WebElement Addmobilenumber;

    @FindBy(xpath = "//input[@name='streetAddress1']")
    WebElement StreetAddress1;

    @FindBy(xpath = "//input[@name='streetAddress2']")
    WebElement streetAddress2;

    @FindBy(xpath = "//input[@name='city']")
    WebElement City;

    @FindBy(xpath = "//input[@name='land']")
    WebElement State;

    @FindBy(xpath = "//input[@name='zipcode']")
    WebElement Zipcode;

    @FindBy(xpath = "//input[@name='addressTitle']")
    WebElement AddressTitle;

    @FindBy(xpath = "//input[@name='landmark']")
    WebElement Landmark;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement SaveAddBtn;

    @FindBy(xpath = "//button[text()='Place order']")
    WebElement PlaceOrder;

    @FindBy(xpath = "//img[@src='/assets/images/Vector (2).png']")
    WebElement VerifyOrderPlaced;

    @FindBy(xpath = "//div[@class='summaryorder_btn5__PEOYG me-2']")
    WebElement PODownloadinvoice;

    @FindBy(xpath = "//button[text()='View order details']")
    WebElement ViewOrderDetails;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    WebElement CountinueShopping;

    public PlaceOrderPage(){
        PageFactory.initElements(driver, this);
    }

    public void PlaceOrder() throws InterruptedException, AWTException
    {
        SignIn.Signin();
        Thread.sleep(3000);
        Actions Shpbtn = new Actions(driver);
        Shpbtn.moveToElement(ShopNowbtn).click().perform();
        //AllcategoryBtn.click();
        Actions act = new Actions(driver);
        act.moveToElement(SelectProduct).click().perform();
        SelectVar1.click();
        SelectVar2.click();
        EnterZipcode.sendKeys("641652");
        CheckBtn.click();
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        action.moveToElement(BuynowBtn).click().perform();
        Thread.sleep(2000);
        CheckOutBtn.click();
        Thread.sleep(2000);
        Addnewaddress.click();
        Name.sendKeys("Sachin");
        Addmobilenumber.sendKeys("9999999999");
        StreetAddress1.sendKeys("West Street");
        streetAddress2.sendKeys("palladam");
        City.sendKeys("Coimbatore");
        State.sendKeys("TamilNadu");
        Zipcode.sendKeys("641652");
        AddressTitle.sendKeys("Offcie");
        Landmark.sendKeys("Near busstand");
        Actions SAVEADD = new Actions(driver);
        SAVEADD.moveToElement(SaveAddBtn).click().perform();
        Actions PlaORD = new Actions(driver);
        PlaORD.moveToElement(PlaceOrder).click().perform();
        Thread.sleep(10000);
        Boolean GreenTick = VerifyOrderPlaced.isDisplayed();
        System.out.println(GreenTick + "Order placed successfully");
        PODownloadinvoice.click();
        ViewOrderDetails.click();
        driver.navigate().back();
        CountinueShopping.click();
        Thread.sleep(2000);

    }

}
