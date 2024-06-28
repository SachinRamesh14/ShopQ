package Base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.ITestResult;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import Utilities.WebEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class BaseClass {

    public static WebDriver driver;
    public static Properties prop;
    public static WebDriverWait wait;
    public static Screen scrn;
    Robot robot;
    public static String  screenshotsSubFolderName;
    public  static EventFiringWebDriver e_driver;
    public static WebEventListener eventListener;
    JavascriptExecutor js;
    public static Logger logger = Logger.getLogger(BaseClass.class.getName());

    public BaseClass()
    {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("C:\\Users\\Rameshkumar\\IdeaProjects\\ShopQ\\src\\main\\java\\Config\\Config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void OpenHomePage() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        ChromeOptions co = new ChromeOptions();

        co.addArguments("--remote-allow-origins=*");

        // disable infobars

        co.addArguments("--disable-infobars");

        co.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });

        // disable notification parameter

        co.addArguments("--disable-notifications");

        co.addArguments("--disable-notifications");

        co.addArguments("--disable-geolocation");

        co.addArguments("--disable-media-stream");

        co.addArguments("--disable-profile.password_manager");

        HashMap<String, Object> prefs = new HashMap<String, Object>();

        prefs.put("credentials_enable_service", false);

        prefs.put("profile.password_manager_enabled", false);

        co.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(co);

        driver.get(prop.getProperty("Url"));


        e_driver = new EventFiringWebDriver(driver);

        // Now create object of EventListerHandler to register it with EventFiringWebDriver
        eventListener = new WebEventListener();

        e_driver.register(eventListener);

        driver = e_driver;


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.manage().deleteAllCookies();

        Thread.sleep(2000);

        scrn = new Screen();



    }
    public  void RobotClassBackward() throws InterruptedException, AWTException  {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(6000);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_CONTROL);

    }

    public  void RobotClassCopyPaste() throws InterruptedException, AWTException {
        Robot robot = new Robot();
        // Open a new tab (Ctrl+T keyboard shortcut)
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Paste the URL (Ctrl+v keyboard shortcut)
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(10000);

        // Click The Enter Key (Enter Key)
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(10000);

        // Click The Enter Key (Enter Key)
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public  void ImageCopyPaste() throws InterruptedException, AWTException {
        Robot robot = new Robot();
        // Paste the URL (Ctrl+v keyboard shortcut)
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);

        // Click The Enter Key (Enter Key)
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public void captureScreenshot(String fileName) {

        if(screenshotsSubFolderName == null) {
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
            screenshotsSubFolderName = myDateObj.format(myFormatObj);
        }

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("./Screenshots/"+ screenshotsSubFolderName+"/"+fileName);
        try {
            FileUtils.copyFile(sourceFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Screenshot saved successfully");
    }

    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub

    }
    public void ScrollDown(){
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

    }
    public void ScrollUp(){
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-5000)");

    }

    public void CTRLDEL() throws AWTException{
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_DELETE);
    }

    public void log() throws AWTException{

    }

}

