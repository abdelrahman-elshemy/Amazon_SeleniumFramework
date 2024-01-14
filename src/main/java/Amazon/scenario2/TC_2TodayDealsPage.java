package Amazon.scenario2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TC_2TodayDealsPage {

    // create constructor to initiliaze elements
    public WebDriver driver;
    public TC_2TodayDealsPage(WebDriver driver){
        this.driver=driver;
    }

    // locate elements use By way

    private final By secondCategory = By.xpath("(//li[@class='CheckboxFilter-module__gridFilterOption_hdG5xZdR2ZvDkQKkl_d49'])[5]");
    private final By firstProduct = By.xpath("(//div[@class='DealContent-module__truncate_sWbxETx42ZPStTc9jwySW'])[1]");


    public TC_3ItemsPage checkProduct(){

        // Assert for scenario By check Title page
        String titlepage = driver.getTitle();
        Assert.assertEquals(titlepage,"Amazon.eg: Today's Deals | Great Savings on Daily Deals Everyday Online in Egypt");

        // To scroll down the web page by 1000 pixel vertical(عمودي)
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1400)");

        // to click on second category
        driver.findElement(secondCategory).click();

        // wait until first item loaded in dom
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement fproduct = driver.findElement(firstProduct);
        wait.until(ExpectedConditions.elementToBeClickable(fproduct));

        // to click on First Product
        driver.findElement(firstProduct).click();


        // wait to locate Dom page until title page present with  Save on Automotive Essentials
        wait.until(ExpectedConditions.titleContains("Automotive Essentials"));

        return new TC_3ItemsPage(driver);
    }


}
