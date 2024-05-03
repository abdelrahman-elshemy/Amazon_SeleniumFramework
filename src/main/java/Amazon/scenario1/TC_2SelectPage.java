package Amazon.scenario1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class TC_2SelectPage {

    // create constructor to initiliaze elements
    public WebDriver driver;
    public TC_2SelectPage(WebDriver driver){
        this.driver=driver;
    }

    // locate elements use By way

    private final By firstitem = By.cssSelector("span.a-size-medium.a-color-base.a-text-normal");

    // 1 - method to return title of item in Selectpage automatic
    public String getItemTitleInSelectPage(){

        return driver.findElement(firstitem).getText();
    }



    // 2 - method to choise first item
    public void checkItem(){

        // wait to locate elements in Dom page By implicity waits
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.findElement(firstitem).click();

    }



}
