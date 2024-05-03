package Amazon.scenario2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TC_6TodaysDealsPage {

    public WebDriver driver;

    // create constructor to initiliaze elements
    public TC_6TodaysDealsPage(WebDriver driver){
        this.driver=driver;
    }

    private final By todaysDeals = By.cssSelector("a[data-csa-c-slot-id='nav_cs_0']");
    private final By dismissButton = By.cssSelector("input[data-action-type='DISMISS']");



    public void ClickOnTodaysDeals()  {


        // wait to locate Dom page until title page present with Amazon.com
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.titleContains("Amazon | Deals"));


//        // Assert for scenario to check title page
//        String titlepage = driver.getTitle();
//        Assert.assertEquals(titlepage,"Amazon | Deals");

        driver.findElement(dismissButton).click();
        driver.findElement(todaysDeals).click();

    }

}
