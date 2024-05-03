package Amazon.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


import java.util.concurrent.TimeUnit;

public class TestBase {
 public WebDriver driver;

// method to start driver
    @BeforeClass
    public void setup() throws InterruptedException {

       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
       driver.navigate().to("https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb");


    }

     @AfterClass
    // method for close driver
    public void teardown(){

        //driver.quit();
    }



    }


