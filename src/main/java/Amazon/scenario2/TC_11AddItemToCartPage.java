package Amazon.scenario2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
public class TC_11AddItemToCartPage {
    public WebDriver driver;

    // create constructor to initiliaze elements
    public TC_11AddItemToCartPage(WebDriver driver){
        this.driver=driver;
    }
    private final By addToCartButton = By.id("add-to-cart-button");



    public void addItem() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.findElement(addToCartButton).click();

    }



}
