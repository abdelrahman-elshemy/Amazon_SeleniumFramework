package Amazon.scenario2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TC_1HomePage {
    public WebDriver driver;

    // create constructor to initiliaze elements
    public TC_1HomePage(WebDriver driver){
        this.driver=driver;
    }


  // locate elements use By way

    private final By Languagebutton = By.xpath("//div[contains(text(),'AR')]");
    private final By Englishbutton = By.xpath("(//span[@dir='ltr'])[2]");
    private final By submitbutton = By.cssSelector("input.a-button-input");
    private final By Allbutton = By.xpath("//a[@id='nav-hamburger-menu']");
    private final By TodayDealsbutton = By.linkText("Today's Deals");
    public TC_2TodayDealsPage deals(){

        // to change language of amazon website
        driver.findElement(Languagebutton).click();
        driver.findElement(Englishbutton).click();
        driver.findElement(submitbutton).click();

        // wait to locate Dom page until title page present with Shop Online
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.titleContains("Shop Online"));

        // Assert for scenario to check title page
        String titlepage = driver.getTitle();
        Assert.assertEquals(titlepage,"Amazon.eg: Shop Online in Egypt - Low Prices on Electronics, Fashion, Mobiles, Grocery & more");

        driver.findElement(Allbutton).click();

        // To scroll down the web page by the visibility of the element and click on it
        // (JavascriptExecutor) purpose convert webdriver to javascriptExecutor by add cast to javascriptExecutor
        // arguments[0] means first index of page starting at 0.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(TodayDealsbutton);
        js.executeScript("arguments[0].scrollIntoView();", Element);
        driver.findElement(TodayDealsbutton).click();

        // wait to locate Dom page until title page present with Today Deals
        wait.until(ExpectedConditions.titleContains("Today's Deals"));

        return new TC_2TodayDealsPage(driver);

    }

}
