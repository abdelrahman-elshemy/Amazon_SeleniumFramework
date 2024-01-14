package Amazon.scenario3;

import Amazon.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class TC_1YourOrdersTest extends TestBase {

    public HomePage homePage;
    public TC_1YourOrdersPage tc_1YourOrdersPage;

    @Feature("Check Your Orders")
    @Description("Test Description: Go to Orders Page and verify that user cannot see orders without sign in")
    @Test
    public void actionOrders(){

        homePage = new HomePage(driver);
        homePage.changeLanguage();

        tc_1YourOrdersPage = new TC_1YourOrdersPage(driver);
        tc_1YourOrdersPage.selectOrders();


    }

}
