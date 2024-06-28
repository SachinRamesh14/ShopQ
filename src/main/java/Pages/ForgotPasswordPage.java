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
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.OutputType;
import Base.BaseClass;

public class ForgotPasswordPage extends BaseClass {
    WebDriverWait wait;

    @FindBy(xpath = "//img[@class='me-4 ms-4']")
    WebElement MyAccountHover;

    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    WebElement ClickSignin;

    @FindBy(xpath = "//span[@class='signin_ForgetPsw2__9k0DM']")
    WebElement ClickForgotpassword;

    @FindBy(xpath = "//input[@name='forgotPasswordEmail']")
    WebElement EnterEmail;

    @FindBy(xpath = "//button[text()='Continue']")
    WebElement ClickContinue;

    @FindBy(xpath = "//button[text()='Back']")
    WebElement ClickBack;

    @FindBy(xpath = "//input[@name='emailOtp']")
    WebElement EnterOTP;

    @FindBy(xpath = "//input[@name='new_password']")
    WebElement NewPassword;

    @FindBy(xpath = "//input[@name='confirm_password']")
    WebElement ConfirmPassword;

    @FindBy(xpath = "//button[@class='sc-gsFSXq iOohUE mt-3']")
    WebElement Changepassword;

    @FindBy(xpath = "//input[@class='sc-aXZVg jNIeXO']")
    WebElement Email;

    @FindBy(xpath = "//input[@id='password']")
    WebElement Password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement SignIN;

    public ForgotPasswordPage() {
        PageFactory.initElements(driver, this);
    }

    public void forgotpassword() throws InterruptedException, AWTException
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(MyAccountHover).perform();
        ClickSignin.click();
        Thread.sleep(2000);
        ClickForgotpassword.click();
        EnterEmail.sendKeys("rameshkumar.s.test10@gmail.com");
        ClickContinue.click();
        EnterOTP.sendKeys("");
        Thread.sleep(10000);
        ClickContinue.click();
        NewPassword.sendKeys("Qwerty@12");
        ConfirmPassword.sendKeys("Qwerty@12");
        Changepassword.click();
        Thread.sleep(2000);
        Email.sendKeys("rameshkumar.s.test10@gmail.com");
        Password.sendKeys("Qwerty@12");
        SignIN.click();

    }

}
