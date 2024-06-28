package Pages;

import java.awt.AWTException;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.BaseClass;

public class MyOrdersPage extends BaseClass {

    SignUpPage SignIn = new SignUpPage();
    MyAccountPage myAccountPage =new MyAccountPage();
    MyWishlistPage myWishlistPage =new MyWishlistPage();

    @FindBy(xpath = "//span[text()='My Orders']")
    WebElement MyOrders;

    @FindBy(xpath = "//input[@placeholder='Search by Order Id']")
    WebElement SearchBox;

    @FindBy(xpath = "//option[@value='Ordered']")
    WebElement StatusOrdered;

    @FindBy(xpath = "//option[@value='Delivered']")
    WebElement StatusDelivered;

    @FindBy(xpath = "//option[@value='3']")
    WebElement YearFilter;

    @FindBy(xpath = "//button[text()='View order details']")
    WebElement Orderdetails;

    @FindBy(xpath = "//p[text()='Download Invoice']")
    WebElement Downloadinvoice;

    @FindBy(xpath = "//button[text()='Reorder Items']")
    WebElement ClickReorder;

    @FindBy(xpath = "//span[@class='track_Order__C6xbT']")
    WebElement StsOrder;

    @FindBy(xpath = "//*[contains(text(),'White- Navy Blue Sweatshirt')]")
    WebElement Productverify;

    @FindBy(xpath = "//b[text()='Back']")
    WebElement BackBtn;

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

    @FindBy(xpath = "//button[@class='productshare_buyNow1__o1tkk btn btn-dark']")
    WebElement BuynowBtn;

    @FindBy(xpath = "//button[text()='Checkout']")
    WebElement CheckOutBtn;

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


    public MyOrdersPage(){
        PageFactory.initElements(driver, this);
    }

    public void MyOrdersDetails() throws InterruptedException, AWTException
    {
        SignIn.Signin();
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(myAccountPage.MyAccounthover).perform();
        myAccountPage.ClickMyAccount.click();
        MyOrders.click();
        Thread.sleep(2000);
        SearchBox.sendKeys("White- Navy Blue Sweatshirt");
        Boolean verify = Productverify.isDisplayed();
        System.out.println(verify + "The Search Result is Shown");
        StatusDelivered.click();
        StatusOrdered.click();
        Thread.sleep(2000);
        YearFilter.click();
        Orderdetails.click();
        Downloadinvoice.click();
        ClickReorder.click();
        Thread.sleep(3000);
        driver.navigate().back();
        String Status= StsOrder.getText();
        System.out.println(Status);
        BackBtn.click();
        Thread.sleep(3000);

    }

    public void OrderProduct() throws InterruptedException, AWTException
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
        action.moveToElement(BuynowBtn).click().perform();
        Thread.sleep(2000);
        CheckOutBtn.click();
        Thread.sleep(2000);
        PlaceOrder.click();
        Thread.sleep(5000);
        Boolean GreenTick = VerifyOrderPlaced.isDisplayed();
        System.out.println(GreenTick + "Order placed successfully");
        PODownloadinvoice.click();
        ViewOrderDetails.click();
        driver.navigate().back();
        CountinueShopping.click();
        Thread.sleep(2000);

    }
}
