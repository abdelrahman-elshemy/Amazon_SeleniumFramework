package Amazon.scenario3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    public WebDriver driver;


    // create constructor
    public HomePage(WebDriver driver){
        this.driver=driver;

    }

    // locate elements use By way

    private final By Languagebutton = By.xpath("//div[contains(text(),'AR')]");
    private final By Englishbutton = By.xpath("(//span[@dir='ltr'])[2]");
    private final By submitbutton = By.cssSelector("input.a-button-input");


    // method to change language to E
    public void changeLanguage(){

        driver.findElement(Languagebutton).click();
        driver.findElement(Englishbutton).click();
        driver.findElement(submitbutton).click();

        // wait to locate Dom page until title page present with Shop Online
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.titleContains("Shop Online"));
    }





}