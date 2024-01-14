package Amazon.scenario2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TC_5CartPage {

    public WebDriver driver;

    // create constructor to initiliaze elements
    public TC_5CartPage(WebDriver driver){
        this.driver=driver;
    }

    // locate elements use By way
    private final By cartbutton = By.xpath("(//span[@class='nav-line-2'])[3]");
    private final By headerpage = By.xpath("//h1");

    private final By productSubTotalInCart = By.xpath("(//span[@class='a-offscreen'])[1]");
    private final By productQuantityInCart = By.xpath("//span[@class='a-dropdown-prompt']");



    // 1 - method to return product SubTotal in Cart Page automatc
    public String getProductSubTotalInCart(){

        return driver.findElement(productSubTotalInCart).getText();

    }

    // 2 - method to return product quantity in Cart Page automatic
    public String getProductQuantityInCart(){

        return driver.findElement(productQuantityInCart).getText();
    }


    // 3 - method to click on cart button
   public TC_6SubmitOrderPage clickCart(){

       // Assert for scenario By check Title page
       String titlepage = driver.getTitle();
       Assert.assertEquals(titlepage,"amazon.eg Shopping Cart");

       // click on Cart Button
       driver.findElement(cartbutton).click();

       // wait to locate Dom page until header page present with Shopping Cart
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
       WebElement header = driver.findElement(headerpage);
       wait.until(ExpectedConditions.textToBePresentInElement(header,"Shopping Cart"));

       return new TC_6SubmitOrderPage(driver);

   }

}
