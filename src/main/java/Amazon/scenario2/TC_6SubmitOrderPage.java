package Amazon.scenario2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_6SubmitOrderPage {

    public WebDriver driver;

    // create constructor to initiliaze elements
    public TC_6SubmitOrderPage(WebDriver driver){

        this.driver=driver;
    }

   // locate elements use By way


    private final By productTitleInSubmitOrderPage = By.xpath("//span[@class='a-truncate-cut']");
    private final By productPriceInSubmitOrdeePage = By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']");
    private final By productSubTotalInSubmitOrderPage = By.xpath("(//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[2]");
    private final By productQuantityInSubmitOrderPage = By.xpath("//span[@class='a-dropdown-prompt']");

    // 1 - method to return title of product in submitOrder automatic
    public String getProductTitleInSubmitOrderPage(){

        return driver.findElement(productTitleInSubmitOrderPage).getText();
    }

    // 2- method to return Price of product in submitOreder automatic
    public String getProductPriceInSubmitOrderPage(){

        return driver.findElement(productPriceInSubmitOrdeePage).getText();
    }

    // 3 - method to return SubTotal of product in submitOrder automatic
    public String getProductSubTotalInSubmitOrderPage(){

        return driver.findElement(productSubTotalInSubmitOrderPage).getText();
    }

    // 4 - method to return Quantity of product in SubmitOrder automatic
    public String getProductQuantityInSubmitOrderPage(){

        return driver.findElement(productQuantityInSubmitOrderPage).getText();
    }

}
