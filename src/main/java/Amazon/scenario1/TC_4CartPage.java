package Amazon.scenario1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;


public class TC_4CartPage {

    // create constructor to initiliaze elements
    public WebDriver driver;
    public TC_4CartPage(WebDriver driver){

        this.driver=driver;
    }


    // locate elements use By way
    private final By cartIcon = By.id("nav-cart-count-container");


    public void goToCartPage(){

        // wait to locate elements in Dom page By implicity waits
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.findElement(cartIcon).click();

    }

}
