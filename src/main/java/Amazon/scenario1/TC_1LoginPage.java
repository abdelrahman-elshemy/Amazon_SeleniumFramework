package Amazon.scenario1;

import Amazon.scenario2.TC_1HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class TC_1LoginPage {
public WebDriver driver;


// create constructor to initiliaze elements
public TC_1LoginPage(WebDriver driver){
    this.driver=driver;
}

// locate elements use By way
private final By Languagebutton = By.xpath("//div[contains(text(),'AR')]");
private final By Englishbutton = By.xpath("(//span[@dir='ltr'])[2]");
private final By submitbutton = By.cssSelector("input.a-button-input");

 private final By Allbutton = By.xpath("//a[@id='nav-hamburger-menu']");
private final By signinbutton = By.xpath("//span[@id='nav-link-accountList-nav-line-1']");
private final By emailfield = By.id("ap_email");
private final By continuebutton = By.xpath("//input[@id='continue']");
private final By errormessage = By.xpath("//span[@class='a-list-item']");



// method for enter valid email and check title page

public TC_1HomePage userSignin(String email) {

    // to change language of amazon website
    driver.findElement(Languagebutton).click();
    driver.findElement(Englishbutton).click();
    driver.findElement(submitbutton).click();

    // waits to locate elements befor take action by Explicity waits
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
    wait.until(ExpectedConditions.titleContains("Amazon.eg"));

    driver.findElement(Allbutton).click();
    driver.findElement(signinbutton).click();

    wait.until(ExpectedConditions.titleContains("Sign In"));

    // Assert for scenario to check title page
    String titlepage = driver.getTitle();
    Assert.assertEquals(titlepage,"Amazon Sign In");

    // enter valid data but not registerd in database
    driver.findElement(emailfield).sendKeys(email);
    driver.findElement(continuebutton).click();

    // to check error message that can not log in without registeration
    WebElement error = driver.findElement(errormessage);
    Assert.assertEquals(error.getText(),"We cannot find an account with that email address" );

    return new TC_1HomePage(driver);

}






}
