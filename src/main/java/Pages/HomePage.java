package Pages;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.awt.datatransfer.StringSelection;
import org.openqa.selenium.interactions.Actions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.OutputType;
import Base.BaseClass;
import Pages.SignUpPage;

public class HomePage extends BaseClass {
    WebDriverWait wait;
    SignUpPage signUpPage;
    SignUpPage SignIn = new SignUpPage();

    @FindBy(xpath = "//img[@class='undefined']")
    WebElement ShopQLogo;

    @FindBy(xpath = "//input[@class='globalSearch_searchInput___R7Ng']")
    WebElement Searchbox;

    @FindBy(xpath = "//div[@class='globalSearch_suggesstionData__90P_e'][1]")
    WebElement SearchResult;

    @FindBy(xpath = "//img[@class='me-4 ms-4']")
    WebElement MyAccounthover;

    @FindBy(xpath = "//div[contains(@class,'header_ProfileNav__OMdc2')]//div//div//h1[contains(@class,'header_Profiles__nU3KI')][normalize-space()='My Account']")
    WebElement ClickMyAccount;

    @FindBy(xpath = "//img[@class='header_ShopCart__KHE7U']")
    WebElement MyCart;

    @FindBy(xpath = "//p[@class='categories_category__ulkaV ']")
    WebElement Category1;

    @FindBy(xpath = "//p[@class='categories_category__ulkaV'][1]")
    WebElement Category2;

    @FindBy(xpath = "//p[@class='categories_category__ulkaV'][2]")
    WebElement Category3;

    @FindBy(xpath = "//p[@class='categories_category__ulkaV'][3]")
    WebElement Category4;

    @FindBy(xpath = "//button[@class='slider_shopnowbtn__CWFPB']")
    WebElement BannerShopNow;

    @FindBy(xpath = "//button[@class='brand_shopnowbtnsub__E1bPq']")
    WebElement subbannershopnow;

    @FindBy(xpath = "//h4[contains(text(), 'Shop now')]")
    WebElement herobannershopnow;

    @FindBy(xpath = "//div[@class='feature_cards__4MT3w '][1]")
    WebElement Trendingproduct;

    @FindBy(xpath = "//div[@class='seasonalWears_cards__SRNAg'][1]")
    WebElement Featurecategory;

    @FindBy(xpath = "//div[@class='category_productSignle__JyGaJ col-md-6 col-lg-4 col-sm-6 col-xl-3'][1]")
    WebElement Seasonalwears;


    public HomePage()
    {

        PageFactory.initElements(driver, this);
    }

    public void ValidateHomepage() throws InterruptedException,AWTException{

        SignIn.Signin();
        //Category1.click();
        //Thread.sleep(2000);
        //ShopQLogo.click();
        Category2.click();
        Thread.sleep(2000);
        ShopQLogo.click();
        Category3.click();
        Thread.sleep(2000);
        ShopQLogo.click();
        Category4.click();
        Thread.sleep(2000);
        ShopQLogo.click();
        Thread.sleep(3000);
        Searchbox.sendKeys("Polo T-shirt");
        Searchbox.click();
        SearchResult.click();
        Thread.sleep(2000);
        ShopQLogo.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(MyAccounthover).perform();
        ClickMyAccount.click();
        Thread.sleep(2000);
        ShopQLogo.click();
        MyCart.click();
        Thread.sleep(3000);
        ShopQLogo.click();
        Thread.sleep(4000);
        BannerShopNow.click();
        ShopQLogo.click();
        herobannershopnow.click();
        ShopQLogo.click();
        Trendingproduct.click();
        ShopQLogo.click();
        subbannershopnow.click();
        ShopQLogo.click();
        Seasonalwears.click();
        ShopQLogo.click();
        Featurecategory.click();
        ShopQLogo.click();

    }
}
