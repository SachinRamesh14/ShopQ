package Pages;

import java.awt.AWTException;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.BaseClass;

public class ProductListingPage extends BaseClass {

    SignUpPage SignIn = new SignUpPage();

    @FindBy(xpath = "//button[@class='slider_shopnowbtn__CWFPB']")
    WebElement ShopNowbtn;

    @FindBy(xpath = "//div[2]//div[@class='breadcrumb_listing__AVd6H']")
    WebElement AllcategoryBtn;

    @FindBy(xpath = "//div[@href='/product-detail/170']")
    WebElement SelectProduct;


    @FindBy(xpath = "//p[@class='categories_category__ulkaV'][1]")
    WebElement Category2;

    @FindBy(xpath = "//p[@class='categories_category__ulkaV'][2]")
    WebElement Category3;

    @FindBy(xpath = "//p[@class='categories_category__ulkaV'][3]")
    WebElement Category4;

    @FindBy(xpath = "//select[@id='items']")
    WebElement Sort;

    @FindBy(xpath = "//option[@value='price_asc']")
    WebElement lowtohigh;

    @FindBy(xpath = "//option[@value='price_desc']")
    WebElement hightolow;

    @FindBy(xpath = "//div[@class='filter_filterinputsearch__IHH9b form-check'][8]")
    WebElement Discount;

    @FindBy(xpath = "//div[@class='MultiSlider_sliderTrack__kLpOX']")
    WebElement Price;

    @FindBy(xpath = "//div[@class='filter_spacing__uEFh4 pt-4']//div[@class='ps-4']//input[@id='flexCheckDefault3']")
    WebElement Rating;

    @FindBy(xpath = "//div[@class='filter_filterinputsearch__IHH9b form-check'][13]")
    WebElement Brand;

    public ProductListingPage() {

        PageFactory.initElements(driver, this);
    }

    public void productListing() throws InterruptedException, AWTException {

        SignIn.Signin();
        Thread.sleep(3000);
        ShopNowbtn.click();
        AllcategoryBtn.click();
        Actions act = new Actions(driver);
        act.moveToElement(SelectProduct).click().perform();
        driver.navigate().back();
        Thread.sleep(2000);
        Category2.click();
        Thread.sleep(2000);
        Category3.click();
        Thread.sleep(2000);
        Category4.click();
        Thread.sleep(3000);
        AllcategoryBtn.click();
        Sort.click();
        lowtohigh.click();
        Thread.sleep(2000);
        hightolow.click();
        Thread.sleep(2000);
        AllcategoryBtn.click();
        Discount.click();
        Actions Slider = new Actions(driver);
        Slider.dragAndDropBy(Price, 50, 0).perform();
        Rating.click();
        Brand.click();
        wait.wait(3000);

    }
}