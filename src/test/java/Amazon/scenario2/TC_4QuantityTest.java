package Amazon.scenario2;

import Amazon.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class TC_4QuantityTest extends TestBase {


    public TC_1HomePage TC1HomePage;
    public TC_2TodayDealsPage TC2TodayDealsPage;
    public TC_3ItemsPage itemsPage;
    public TC_4QuantityPage quantityPage;

    @Feature("Select QTY")
    @Description("Test Description: Go to Quantity Page and select the quantity of product with QTY=2")
    @Test
    public void selectQuantity() throws InterruptedException {

        TC1HomePage = new TC_1HomePage(driver);
        TC1HomePage.deals();

        TC2TodayDealsPage = new TC_2TodayDealsPage(driver);
        TC2TodayDealsPage.checkProduct();

        itemsPage = new TC_3ItemsPage(driver);
        itemsPage.checkItem();

        quantityPage = new TC_4QuantityPage(driver);
        quantityPage.selectQuantiity();

    }



}
