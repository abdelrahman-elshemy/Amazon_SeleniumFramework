package Amazon.scenario3;

import Amazon.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class TC_3YourListsTest extends TestBase {

    public HomePage homePage;
    public TC_3YourListsPage tc3YourListsPage;

    @Feature("Check Your Lists")
    @Description("Test Description: Go to Lists Page and verify that user can see Lists without sign in")
    @Test
    public void actionLists(){


        homePage = new HomePage(driver);
        homePage.changeLanguage();

        tc3YourListsPage = new TC_3YourListsPage(driver);
        tc3YourListsPage.selectYourLists();

    }






}
