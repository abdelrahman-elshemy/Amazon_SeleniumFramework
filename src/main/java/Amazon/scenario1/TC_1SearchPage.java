package Amazon.scenario1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TC_1SearchPage {
    public WebDriver driver;

    // create constructor to initiliaze elements
    public TC_1SearchPage(WebDriver driver){
        this.driver=driver;
    }


    // locate elements use By way
    private final By item = By.xpath("//input[@id='twotabsearchtextbox']");

    private final By searchbutton = By.id("nav-search-submit-button");

    public void searchField() throws InterruptedException {


        // wait to locate Dom page until title page present with Amazon.com
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.titleContains("Amazon | Deals"));

        // Assert for scenario to check title page
        String titlepage = driver.getTitle();
        Assert.assertEquals(titlepage,"Amazon | Deals");

       driver.findElement(item).sendKeys("car accessories");
       driver.findElement(searchbutton).click();

    }

}
