package Amazon.scenario1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class TC_5CheckoutPage {

    // create constructor to initiliaze elements
    public WebDriver driver;
    public TC_5CheckoutPage(WebDriver driver){

        this.driver=driver;
    }


    // locate elements use By way
    private final By sameitem = By.xpath("//input[@id='add-to-cart-button']");

    // 1-  method to return title of item in checkoutpage automatic
    public String getItemTitleInCheckoutPage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver.findElement(sameitem).getText();
        }

}
