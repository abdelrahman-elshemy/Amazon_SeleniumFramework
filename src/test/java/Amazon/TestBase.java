package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import utilities.Helper;

import java.util.concurrent.TimeUnit;

public class TestBase {
 public WebDriver driver;

// method to start driver
    @BeforeClass
    public void setup() {

       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
       driver.navigate().to("https://www.amazon.eg/");


    }

     @AfterClass
    // method for close driver
    public void teardown(){
        driver.quit();
    }



    @AfterMethod
    public void takescreenshot(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {

            System.out.println("Failed!");
            System.out.println("TAKING Screenshot .....");
            Helper.capturescreenshot(driver, result.getName());
        }
    }




}
