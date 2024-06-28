package Pages;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.awt.datatransfer.StringSelection;

import org.apache.poi.ss.formula.functions.T;
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

public class FooterPage extends BaseClass {
    WebDriverWait wait;
    SignUpPage signUpPage;
    SignUpPage SignIn = new SignUpPage();

    @FindBy(xpath = "//input[@name='email']")
    WebElement Email;

    @FindBy(xpath = "//button[@class='footer_GetInTouch__wt5HE']")
    WebElement Subscribe;

    @FindBy(xpath = "//span[text()='Track Order']")
    WebElement TrackOrder;

    @FindBy(xpath = "//span[text()='Billing']")
    WebElement Billing;

    @FindBy(xpath = "//span[text()='Customer service']")
    WebElement Customerservice;

    @FindBy(xpath = "//span[text()='FAQs']")
    WebElement FAQ;

    @FindBy(xpath = "//div[@class='faqpage_faq__f9Qs2 ']")
    WebElement FAQAnswer;

    @FindBy(xpath = "//span[text()='Return policies']")
    WebElement Returnpolicies;

    @FindBy(xpath = "//span[text()='Delivery info']")
    WebElement Deliveryinfo;

    @FindBy(xpath = "//span[text()='Privacy policy']")
    WebElement Privacypolicy;

    @FindBy(xpath = "//span[text()='Terms of service']")
    WebElement Termsofservice;

    @FindBy(xpath = "//a[@class='footer_footerIcon__l1z_Q']")
    WebElement Facebook;

    @FindBy(xpath = "//a[2][@class='footer_footerIcon__l1z_Q ps-3']")
    WebElement instagram;

    @FindBy(xpath = "//a[3][@class='footer_footerIcon__l1z_Q ps-3']")
    WebElement LinkedIn;

    public FooterPage() {
        PageFactory.initElements(driver, this);
    }

    public void Footers() throws InterruptedException, AWTException{

        SignIn.Signin();
        ScrollDown();
        Thread.sleep(3000);
        Email.sendKeys("testuser01@gmail.com");
        Thread.sleep(3000);
        Subscribe.click();
        Thread.sleep(2000);
        TrackOrder.click();
        Thread.sleep(2000);
        ScrollDown();
        driver.navigate().back();
        ScrollDown();
        //Billing.click();
        ScrollDown();
        //driver.navigate().back();  // billing is active after remove the comment
        //Thread.sleep(2000);
       // Customerservice.click();
        //ScrollDown();
        //driver.navigate().back();
        //Thread.sleep(2000);
        FAQ.click();
        FAQAnswer.click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(2000);
        Returnpolicies.click();
        //ScrollDown();
        //driver.navigate().back();
        Thread.sleep(2000);
        Deliveryinfo.click();
        //ScrollDown();
        //driver.navigate().back();
        Thread.sleep(2000);
        Privacypolicy.click();
        ScrollDown();
        driver.navigate().back();
        Thread.sleep(2000);
        Termsofservice.click();
        ScrollDown();
        driver.navigate().back();
        Thread.sleep(2000);
        Facebook.click();
        driver.navigate().back();
        Thread.sleep(2000);
        instagram.click();
        driver.navigate().back();
        Thread.sleep(2000);
        LinkedIn.click();
        driver.navigate().back();


    }


}
