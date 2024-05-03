package Amazon.scenario2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
public class TC_9PageSelectPage {


    public WebDriver driver;

    // create constructor to initiliaze elements
    public TC_9PageSelectPage(WebDriver driver){
        this.driver=driver;
    }
    private final By numberLink = By.xpath("//a[@href='#' and text()='2']");


    public void ScrollToEnd() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,4900)","");
    }

    public void ClickOnButton() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(numberLink).click();

    }


}
