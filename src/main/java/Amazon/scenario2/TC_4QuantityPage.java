package Amazon.scenario2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TC_4QuantityPage {


    public WebDriver driver;
    // create constructor

    public TC_4QuantityPage(WebDriver driver){
        this.driver=driver;
    }


   // locate elements use By way
   private final By Qtybox = By.id("a-autoid-0-announce");
    private final By Qty2 = By.id("quantity_1");
   private final By qtyselect = By.xpath("(//span[@class='a-dropdown-prompt'])[1]");
   private final By addToCart = By.id("add-to-cart-button");
   private final By producTitleInQTY = By.xpath("//span[@id='productTitle']");
    private final By productPriceInQTY = By.xpath("(//span[@class='a-offscreen'])[1]");




    //1- method to return title of product automatic
    public String getProductTitleInQTYPage(){

        return driver.findElement(producTitleInQTY).getText();
    }

    // 2-method to return price of product automatic
    public String getProductPriceInQTYPage(){

        return driver.findElement(productPriceInQTY).getText();
    }




    // 3- method to select qty with value 2
    public TC_5CartPage selectQuantiity() throws InterruptedException {

        // select element from dropdown list
        driver.findElement(Qtybox).click();
        driver.findElement(Qty2).click();


        // wait by implicity wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement qtye = driver.findElement(qtyselect);
        wait.until(ExpectedConditions.textToBePresentInElement(qtye,"2"));


        // click on Add To Cart Button
        driver.findElement(addToCart).click();

       // wait to locate Dom page until title page present with Shoping Cart
       wait.until(ExpectedConditions.titleContains("Shopping Cart"));

       return new TC_5CartPage(driver);

    }

}
