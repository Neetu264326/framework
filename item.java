package item.com;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class item  extends BaseTest{

    @Test
    public void Search() {
        //  String title = driver.getTitle();
        WebElement search= driver.findElement(By.xpath("//*[@class=\"Pke_EE\"]"));
        search.sendKeys(" girl watch ");
        search  .sendKeys(Keys.ENTER);
         //Assert.assertEquals(title, " Flipkart");
        System.out.println("sendkeys");
    }
    @Test
public  void item(){

        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[3]/div/a/div[1]/div/div/div/img"));


        for (WebElement element : elements) {
            element.click();

        }}


    @Test
    public void add(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        System.out.println("scroll pag complete");
   /* WebElement add= driver.findElement(By.xpath("//*[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]"));
    add.click();*/

    }


    @Test
    public static void cart (){
       /* WebElement cart= driver.findElement(By.xpath("class=\"_2KpZ6l _2U9uOA _3v1-ww\""));
        cart.click();*/
    }

    @Test
    public void ScreenShot() throws IOException {

        TakesScreenshot ts=(TakesScreenshot)driver;

        File source=ts.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(source,new File("G:\\NeetuWorkSpace\\AutomationFrameWork\\src\\test\\java\\item\\com\\chromedriver.png"));
        System.out.println("screenshot");
    }
  @AfterClass
    public void tearDown() {
      if (driver != null) {
          //driver.quit();
      }
  }

    }


