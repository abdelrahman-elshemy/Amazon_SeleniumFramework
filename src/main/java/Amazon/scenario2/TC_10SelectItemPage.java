package Amazon.scenario2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class TC_10SelectItemPage {

    public WebDriver driver;

    // create constructor to initiliaze elements
    public TC_10SelectItemPage(WebDriver driver){
        this.driver=driver;
    }
    private final By item = By.cssSelector("img[class*='imageObjectFit']");



    public void SelectItem() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(item));
        driver.findElement(item).click();

    }


}
