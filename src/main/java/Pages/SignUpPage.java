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

public class SignUpPage extends BaseClass {

    WebDriverWait wait;

    @FindBy(xpath = "//img[@class='me-4 ms-4']")
    WebElement MyAccountHover;

    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    WebElement ClickSignin;

    @FindBy(xpath = "//input[@class='sc-aXZVg jNIeXO']")
    WebElement Email;

    @FindBy(xpath = "//input[@id='password']")
    WebElement Password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement SignIN;

    @FindBy(xpath = "//div[@class='header_signinNav__kbgs8']//span[@class='header_signUP2__DHhl7'][normalize-space()='Sign Up']")
    WebElement ClickSignUp;

    @FindBy(xpath = "//input[@name='first_name']")
    WebElement Firstname;

    @FindBy(xpath = "//input[@name='last_name']")
    WebElement Lastname;

    @FindBy(xpath = "//input[@name='user_name']")
    WebElement UserName;

    @FindBy(xpath = "//input[@name='mobile_number']")
    WebElement MobileNumber;

    @FindBy(xpath = "//input[@name='email']")
    WebElement EmailId;

    @FindBy(xpath = "//input[@name='password']")
    WebElement UpPassword;

    @FindBy(xpath = "//input[@name='confirmpsw']")
    WebElement ConfirmPassword;

    @FindBy(xpath = "//button[text()='Sign Up']")
    WebElement Signup;

    @FindBy(xpath = "//*[text()='Terms of service']")
    WebElement TermsofService;

    @FindBy(xpath = "//a[text()=' Privacy policy']")
    WebElement PrivatePolicy;


    public SignUpPage(){

        PageFactory.initElements(driver, this);
    }

    public void Signin() throws InterruptedException,AWTException{

        Actions actions = new Actions(driver);
        actions.moveToElement(MyAccountHover).perform();
        ClickSignin.click();
        Email.sendKeys(prop.getProperty("Email"));
        Password.sendKeys(prop.getProperty("password"));
        SignIN.click();
        Thread.sleep(3000);

    }

    public void SignUp() throws InterruptedException,AWTException
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(MyAccountHover).perform();
        ClickSignUp.click();
        Firstname.sendKeys("Test");
        Lastname.sendKeys("User");
        UserName.sendKeys("Test_User");
        MobileNumber.sendKeys("9988776655");
        EmailId.sendKeys("testuser01@gmail.com");
        UpPassword.sendKeys("Qwerty@10");
        ConfirmPassword.sendKeys("Qwerty@10");
        TermsofService.click();
        PrivatePolicy.click();
        Signup.click();
        Thread.sleep(5000);
    }


}
