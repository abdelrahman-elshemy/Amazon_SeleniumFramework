package Amazon.scenario1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class TC_3AddPage {

    // create constructor to initiliaze elements
    public WebDriver driver;
    public TC_3AddPage(WebDriver driver){

        this.driver=driver;
        }

        // locate elements use By way
        private final By additem = By.xpath("//input[@id='add-to-cart-button']");


        public void addToCart(){

            // wait to locate elements in Dom page By implicity waits
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            driver.findElement(additem).click();

        }

    }


