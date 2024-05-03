package Amazon.scenario2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
public class TC_8DiscountPage {
    public WebDriver driver;

    // create constructor to initiliaze elements
    public TC_8DiscountPage(WebDriver driver){
        this.driver=driver;
    }

    private final By off_10 = By.xpath("//span[text()='10% off or more']");
    public void ScrollDownMore() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,480)","");
    }

    public void ClickOnCheckbox() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(off_10).click();

    }



}
