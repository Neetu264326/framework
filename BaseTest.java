package item.com;

import java.io.IOException;
import java.io.File;
import java.util.concurrent.TimeUnit;
//import org.apache.commons.io.FileUtils;
import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

public class BaseTest {
    public ExtentReports report;

   // static ExtentReports report;
  //  static ExtentTest Test;
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeTest
    public void setupDriver() {
        System.setProperty("webdriver.chrome.driver", "G:\\NeetuWorkSpace\\AutomationFrameWork\\src\\test\\java\\item\\com\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       // report=new ExtentReports(null,true);
        //report= new ExtentReports(null,true) ;

        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com/");
        wait = new WebDriverWait(driver, 60);
        System.out.println("lunch");
        //WebElement cross = driver.findElement(By.xpath("/html/body/div[3]/div/span"));
        //cross.click();
        System.out.println("cross");

    }


    @Test
    public void setupSuite() {
        ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir") + "//Reports//ExtentReport.html"));
        report = new ExtentReports();
        report.attachReporter(extent);
        System.out.println("report");


    }
    }

