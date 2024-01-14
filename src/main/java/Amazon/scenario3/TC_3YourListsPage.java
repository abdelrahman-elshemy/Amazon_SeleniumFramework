package Amazon.scenario3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TC_3YourListsPage {

    public WebDriver driver;


    // create constructor to initiliaze elements
    public TC_3YourListsPage(WebDriver driver){
        this.driver=driver;
    }

    // locate elements
    private final By Lists = By.xpath("//span[@class='nav-line-2 ']");
    private final By YourLists = By.xpath("(//span[@class='nav-text'])[5]");

    // method to select Addresses from lists
    public void selectYourLists(){


        // get title page and print it
        String titlepage1 = driver.getTitle();
        Assert.assertEquals(titlepage1,"Amazon.eg: Shop Online in Egypt - Low Prices on Electronics, Fashion, Mobiles, Grocery & more");
        System.out.println(titlepage1);

        // move to lists and click on Your Addresses button
        Actions actions = new Actions(driver);

        //Retrieve WebElement 'Lists' to perform mouse hover
        WebElement menuOption = driver.findElement(Lists);

        //Mouse hover menuOption 'Lists'
        actions.moveToElement(menuOption).perform();

        //Now Select 'Your Orders' from sub menu which has got displayed on mouse hover of 'Lists'
        WebElement selectMenuOption = driver.findElement(YourLists);
        selectMenuOption.click();

        // waits until title page is present
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Your List"));

        // Assert that we user can’t see Addresses when not signed in
        String titlepage2 = driver.getTitle();
        Assert.assertEquals(titlepage2,"Your List");
        System.out.println("Success... Lists for all your shopping needs");
    }














}
