package Pages;

import java.awt.AWTException;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import Base.BaseClass;

public class MyAddressPage extends BaseClass {

    WebDriverWait wait;
    SignUpPage signUpPage;
    SignUpPage SignIn = new SignUpPage();

    @FindBy(xpath = "//img[@class='me-4 ms-4']")
    WebElement MyAccounthover;

    @FindBy(xpath = "//div[contains(@class,'header_ProfileNav__OMdc2')]//div//div//h1[contains(@class,'header_Profiles__nU3KI')][normalize-space()='My Account']")
    WebElement ClickMyAccount;

    @FindBy(xpath = "//div[@class='profilepage_container__xNxW4 profilepage_MobileContainer__0uSMK container']//span[text()='My Addresses']")
    WebElement MyAddress;

    @FindBy(xpath = "//div[@style='background: rgb(249, 249, 249);']/div[1]//div[@class ='card-body']")
    WebElement AddAddress;

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

    @FindBy(xpath = "//input[@name='primary']")
    WebElement Primarybtn;

    @FindBy(xpath = "//button[text()='Save']")
    WebElement AddSave;

    //Edit Address
    @FindBy(xpath = "//a[@class='address_edit__wlsZQ']")
    WebElement EditAddress;

    @FindBy(xpath = "//a[@class='address_remove__waty2']")
    WebElement DeleteAddress;

    public MyAddressPage()
    {
        PageFactory.initElements(driver, this);
    }

    public void Addaddress() throws InterruptedException, AWTException
    {
        SignIn.Signin();
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(MyAccounthover).perform();
        ClickMyAccount.click();
        MyAddress.click();
        AddAddress.click();
        Name.sendKeys(prop.getProperty("Name"));
        Addmobilenumber.sendKeys(prop.getProperty("Mobilenumber"));
        StreetAddress1.sendKeys(prop.getProperty("StreetAdd-1"));
        streetAddress2.sendKeys(prop.getProperty("StreetAdd-2"));
        City.sendKeys(prop.getProperty("City"));
        State.sendKeys(prop.getProperty("State"));
        Zipcode.sendKeys(prop.getProperty("Zipcode"));
        AddressTitle.sendKeys(prop.getProperty("AddTitle"));
        Landmark.sendKeys(prop.getProperty("Landmark"));
        Primarybtn.click();
        AddSave.click();
        Thread.sleep(3000);
    }

    public void EditAddress() throws InterruptedException, AWTException
    {
        EditAddress.click();
        Name.clear();
        Name.sendKeys("Sachin");
        Addmobilenumber.clear();
        Addmobilenumber.sendKeys("87654320");
        AddressTitle.clear();
        AddressTitle.sendKeys("Home");
        Primarybtn.click();
        Thread.sleep(2000);
        AddSave.click();
    }
}
