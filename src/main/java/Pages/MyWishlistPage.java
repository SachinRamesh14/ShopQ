package Pages;

import java.awt.AWTException;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.BaseClass;

public class MyWishlistPage extends BaseClass {

    SignUpPage SignIn = new SignUpPage();
    MyAccountPage myAccountPage =new MyAccountPage();


    @FindBy(xpath = "//span[text()='My Wishlist']")
    WebElement MyWishList;

    @FindBy(xpath = "//input[@placeholder='Search'][@class='wishlist_formControl__QGDX4 form-control mr-sm-2 me-2']")
    WebElement SearchBox;

    @FindBy(xpath = "//button[text()='View Details']")
    WebElement ViewDetailsBtn;

    @FindBy(xpath = "//div[2]//div[2]//a[contains(text(), 'Remove')]")
    WebElement RemoveBtn;

    @FindBy(xpath = "//button[@class='wishlist_btn1__V81B3']")
    WebElement PopUpRemoveBtn;

    @FindBy(xpath = "//h4[contains(text(), 'Shop now')]")
    WebElement ShopNowbtn;

    @FindBy(xpath = "//div[2]//div[@class='breadcrumb_listing__AVd6H']")
    WebElement AllcategoryBtn;

    @FindBy(xpath = "//img[@class='cardcomponent_cardimage__TH7bI image-fluid ']")
    WebElement SelectProduct;

    @FindBy(xpath = "//div[@class='productshare_heartIco__NTWO9 d-flex align-items-center']")
    WebElement AddtoWishlist;

    @FindBy(xpath = "//a[@class='header_navBarBrand__nQRW6 navbar-brand']/img[@class='undefined']")
    WebElement ShopQLogo;

    @FindBy(xpath = "//*[contains(text(),'White- Navy Blue Sweatshirt')]")
    WebElement Productverify;



    public MyWishlistPage(){
        PageFactory.initElements(driver, this);
    }

    public void AddWishlist() throws InterruptedException,AWTException{

        SignIn.Signin();
        Thread.sleep(3000);
        Actions Shpbtn = new Actions(driver);
        Shpbtn.moveToElement(ShopNowbtn).click().perform();
        //AllcategoryBtn.click();
        Actions act = new Actions(driver);
        act.moveToElement(SelectProduct).click().perform();
        AddtoWishlist.click();
        Thread.sleep(3000);
        ShopQLogo.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(myAccountPage.MyAccounthover).perform();
        myAccountPage.ClickMyAccount.click();
        MyWishList.click();
        Boolean verify = Productverify.isDisplayed();
        System.out.println(verify+"Add Product is Displayed");

    }

    public void Wishlist() throws InterruptedException, AWTException
    {
        SignIn.Signin();
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(myAccountPage.MyAccounthover).perform();
        myAccountPage.ClickMyAccount.click();
        MyWishList.click();
        Thread.sleep(2000);
        SearchBox.sendKeys("White- Navy Blue Sweatshirt");
        Boolean verify = Productverify.isDisplayed();
        System.out.println(verify + "The Search Result is Shown");
        ViewDetailsBtn.click();
        Thread.sleep(3000);
        ScrollDown();
        driver.navigate().back();
        RemoveBtn.click();
        PopUpRemoveBtn.click();
        Thread.sleep(3000);


    }

}
