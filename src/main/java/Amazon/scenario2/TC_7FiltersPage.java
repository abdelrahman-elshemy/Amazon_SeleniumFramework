package Amazon.scenario2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
public class TC_7FiltersPage {
    public WebDriver driver;

    // create constructor to initiliaze elements
    public TC_7FiltersPage(WebDriver driver){
        this.driver=driver;
    }
    private final By grocery = By.cssSelector("input[data-csa-c-type='uxElement'][data-csa-c-element-id='filter-department-16310101'][type='checkbox']");
    private final By headphones = By.cssSelector("input[data-csa-c-type='uxElement'][data-csa-c-element-id='filter-department-172541'][type='checkbox']");


    public void ScrollDown() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,490)","");
    }
    public void ClickOnCheckbox() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(grocery).click();
        driver.findElement(headphones).click();
    }




}
