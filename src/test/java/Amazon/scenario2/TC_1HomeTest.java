package Amazon.scenario2;

import Amazon.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class TC_1HomeTest extends TestBase {
    public TC_1HomePage TC1HomePage;

    @Feature("Today Deals")
    @Description("Test Description: Go to Today Deals")
    @Test
    public void goToTodayDeals(){

       TC1HomePage = new TC_1HomePage(driver);
       TC1HomePage.deals();
    }
}
