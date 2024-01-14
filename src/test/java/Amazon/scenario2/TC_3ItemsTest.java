package Amazon.scenario2;

import Amazon.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class TC_3ItemsTest extends TestBase {

    public TC_1HomePage TC1HomePage;
    public TC_2TodayDealsPage TC2TodayDealsPage;
    public TC_3ItemsPage itemsPage;

    @Feature("Select Item")
    @Description("Test Description: Go to Iteams Page and select n 2nd item in this product")
    @Test
    public void addItem(){

        TC1HomePage = new TC_1HomePage(driver);
        TC1HomePage.deals();

        TC2TodayDealsPage = new TC_2TodayDealsPage(driver);
        TC2TodayDealsPage.checkProduct();

        itemsPage = new TC_3ItemsPage(driver);
        itemsPage.checkItem();

    }

}
