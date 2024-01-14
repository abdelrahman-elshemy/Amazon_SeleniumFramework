package Amazon.scenario3;

import Amazon.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class TC_2YourAddressesTest extends TestBase {

    public HomePage homePage;
    public TC_2YourAddressesPage tc_2YourAddressesPage;

    @Feature("Check Your Addresses")
    @Description("Test Description: Go to Addresses Page and verify that user cannot see Addresses without sign in")
    @Test
    public void actionOrders(){

        homePage = new HomePage(driver);
        homePage.changeLanguage();

        tc_2YourAddressesPage = new TC_2YourAddressesPage(driver);
        tc_2YourAddressesPage.selectAddresses();

    }

}
