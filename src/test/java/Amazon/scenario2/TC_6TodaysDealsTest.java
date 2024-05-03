package Amazon.scenario2;
import Amazon.TestBase.TestBase;
import Amazon.scenario1.TC_1SearchPage;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TC_6TodaysDealsTest extends TestBase {


    public TC_6TodaysDealsPage todaysdealspage;
    @Feature("Search For Today's Deals")
    @Description("Test Description: Go to Method...")
    @Test
    public void goToTodaysDeals() throws InterruptedException {

        todaysdealspage = new TC_6TodaysDealsPage(driver);
        todaysdealspage.ClickOnTodaysDeals();
    }
}
