package Pages;

import java.awt.AWTException;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.BaseClass;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailsPage extends BaseClass {
    WebDriverWait wait;
    SignUpPage signUpPage;
    SignUpPage SignIn = new SignUpPage();

    @FindBy(xpath = "//h4[contains(text(), 'Shop now')]")
    WebElement ShopNowbtn;

    @FindBy(xpath = "//div[2]//div[@class='breadcrumb_listing__AVd6H']")
    WebElement AllcategoryBtn;

    @FindBy(xpath = "//img[@class='cardcomponent_cardimage__TH7bI image-fluid ']")
    WebElement SelectProduct;

    @FindBy(xpath = "//div[@class='productshare_heartIco__NTWO9 d-flex align-items-center']")
    WebElement AddtoWishlist;

    @FindBy(xpath = "//div[@id='Active']//div[@class='detail-container-head d-flex justify-content-between']//span//*[name()='svg']//*[name()='path' and contains(@d,'M13.5 1a1.')]")
    WebElement HoverShare;

    @FindBy(xpath = "//button[@aria-label='facebook']//*[name()='svg']//*[name()='circle' and contains(@cx,'32')]")
    WebElement Facebook;

    @FindBy(xpath = "//button[@aria-label='whatsapp']//*[name()='svg']//*[name()='circle' and contains(@cx,'32')]")
    WebElement Whatsapp;

    @FindBy(xpath = "//button[@aria-label='email']//*[name()='svg']//*[name()='circle' and contains(@cx,'32')]")
    WebElement Mailto;

    @FindBy(xpath = "//div[@class='mx-2 mb-1']")
    WebElement SelectVar1;

    @FindBy(xpath = "//div[3][@class='p-2 mx-1 text-center ']")
    WebElement SelectVar2;

    @FindBy(xpath = "//input[@id='formGroupExampleInput']")
    WebElement EnterZipcode;

    @FindBy(xpath = "//button[@class='productshare_checkButton__YX4v4 btn  btn-sm btn-dark']")
    WebElement CheckBtn;

    @FindBy(xpath = "//p[text()='Add To Cart']")
    WebElement AddtoCartBtn;

    @FindBy(xpath = "//button[@class='productshare_buyNow1__o1tkk btn btn-dark}']")
    WebElement BuynowBtn;

    @FindBy(xpath = "//button[text()='View all']")
    WebElement ReviewBtn;

    @FindBy(xpath = "//button[text()='Negative ']")
    WebElement ReviewSort;

    @FindBy(xpath = "//img[@class='me-2 cursor-pointer']")
    WebElement ReviewBack;

    @FindBy(xpath = "//div[@class='similarproduct_similarProductsContent__6dVjQ'][1]")
    WebElement Similarproduct;


    public ProductDetailsPage()
    {

        PageFactory.initElements(driver, this);
    }

    public void ProductDetails() throws InterruptedException, AWTException{

        SignIn.Signin();
        Thread.sleep(3000);
        Actions Shpbtn = new Actions(driver);
        Shpbtn.moveToElement(ShopNowbtn).click().perform();
        Actions act = new Actions(driver);
        act.moveToElement(SelectProduct).click().perform();
        AddtoWishlist.click();
//        Actions hover = new Actions(driver);
//        hover.moveToElement(HoverShare).perform();
//        Facebook.click();
//        Whatsapp.click();
//        Mailto.click();
//        HoverShare.click();
        Thread.sleep(2000);
        SelectVar1.click();
        SelectVar2.click();
        EnterZipcode.sendKeys("641652");
        CheckBtn.click();
        Thread.sleep(2000);
        AddtoCartBtn.click();
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        action.moveToElement(BuynowBtn).click().perform();
        Thread.sleep(2000);
        driver.navigate().back();
        Actions Review = new Actions(driver);
        Review.moveToElement(ReviewBtn).click().perform();
        ReviewSort.click();
        Thread.sleep(3000);
        ReviewBack.click();
        Thread.sleep(3000);
        Similarproduct.click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);

    }


}
