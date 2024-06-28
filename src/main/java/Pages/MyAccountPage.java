package Pages;

import java.awt.AWTException;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import Base.BaseClass;

public class MyAccountPage extends BaseClass {

    WebDriverWait wait;
    SignUpPage signUpPage;
    SignUpPage SignIn = new SignUpPage();

    @FindBy(xpath = "//img[@class='me-4 ms-4']")
    WebElement MyAccounthover;

    @FindBy(xpath = "//div[contains(@class,'header_ProfileNav__OMdc2')]//div//div//h1[contains(@class,'header_Profiles__nU3KI')][normalize-space()='My Account']")
    WebElement ClickMyAccount;

    @FindBy(xpath = "//h1[normalize-space()='My Wishlist']")
    WebElement ClickWishlist;

    @FindBy(xpath = "//h1[normalize-space()='My Orders']")
    WebElement ClickMyOrders;

    @FindBy(xpath = "//div[2]//div[2]//button[text()='Edit']")
    WebElement ClickEdit;

    @FindBy(xpath = "//input[@name='user_name']")
    WebElement FullName;

    @FindBy(xpath = "//input[@name='mobile_number']")
    WebElement MobileNumber;

    @FindBy(xpath = "//option[text()='Male']")
    WebElement Gender;

    @FindBy(xpath = "//input[@name='date_of_birth']")
    WebElement DOB;

    @FindBy(xpath = "//div[@class='profilepage_profile__D8p74 col-md-2 col-sm-12 col-lg-3 col-xl-3']//img[@alt='...']")
    WebElement Profilepicture;

    @FindBy(xpath = "//button[@class='profileedit_password__OqdP5 btn']")
    WebElement Changepassword;

    @FindBy(xpath = "//input[@name='currentPassword']")
    WebElement CurrentPassword;

    @FindBy(xpath = "//input[@name='newPassword']")
    WebElement NewPassword;

    @FindBy(xpath = "//input[@name='password']")
    WebElement ConfirmPAssword;

    @FindBy(xpath = "//button[text()='Change password'][@type='submit']")
    WebElement ClickChgPas;

    @FindBy(xpath = "//button[text()='Save']")
    WebElement Save;

    @FindBy(xpath = "//button[text()='Cancel']")
    WebElement Cancel;


    public MyAccountPage()
    {
        PageFactory.initElements(driver, this);
    }

    public void EditProfile() throws InterruptedException, AWTException {

        SignIn.Signin();
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(MyAccounthover).perform();
        ClickMyAccount.click();
        Thread.sleep(2000);
        ClickEdit.click();
        FullName.clear();
        FullName.sendKeys("Ramesh");
        MobileNumber.clear();
        MobileNumber.sendKeys("8355577965");
        Gender.click();
        DOB.sendKeys("14072000");
        Changepassword.click();
        CurrentPassword.sendKeys(prop.getProperty("password"));
        NewPassword.sendKeys("Qwerty@123");
        ConfirmPAssword.sendKeys("Qwerty@123");
        ClickChgPas.click();
        Thread.sleep(2000);
        Save.click();
    }

    public void Changepassword() throws InterruptedException, AWTException{

        SignIn.Signin();
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(MyAccounthover).perform();
        ClickMyAccount.click();
        Thread.sleep(2000);
        ClickEdit.click();
        Changepassword.click();
        CurrentPassword.sendKeys(prop.getProperty("password"));
        NewPassword.sendKeys("Qwerty@123");
        ConfirmPAssword.sendKeys("Qwerty@123");
        ClickChgPas.click();
        Thread.sleep(2000);
        Save.click();

    }

}
