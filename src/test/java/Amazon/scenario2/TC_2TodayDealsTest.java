package Amazon.scenario2;

import Amazon.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class TC_2TodayDealsTest extends TestBase {
    public TC_1HomePage TC1HomePage;
    public TC_2TodayDealsPage TC2TodayDealsPage;

    @Feature("Select Product")
    @Description("Test Description: Go to Today Deals and select 2nd category and choise 1st product in this category")
    @Test
    public void addProduct(){

        TC1HomePage = new TC_1HomePage(driver);
        TC1HomePage.deals();

        TC2TodayDealsPage = new TC_2TodayDealsPage(driver);
        TC2TodayDealsPage.checkProduct();
    }

}
