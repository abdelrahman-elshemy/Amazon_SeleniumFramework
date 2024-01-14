package Amazon.scenario2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.time.Duration;

public class TC_3ItemsPage {
    public WebDriver driver;

    // create constructor to initiliaze elements
    public TC_3ItemsPage(WebDriver driver){
        this.driver=driver;
    }


    // locate elements use By way
    private final  By secondItem = By.xpath("(//div[@class='a-section octopus-dlp-image-shield'])[2]");

    public TC_4QuantityPage checkItem(){

        // Assert for scenario to check title page
        String titlepage = driver.getTitle();
        Assert.assertEquals(titlepage,"Save on Automotive Essentials");


        // click on second item
        driver.findElement(secondItem).click();

        // wait to locate elements in Dom page By explicity waits
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return  new TC_4QuantityPage(driver);
    }







}
