package Amazon.scenario1;

import Amazon.TestBase.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class TC_2SelectTest extends TestBase {
    public TC_1SearchPage searchPage;
    public TC_2SelectPage selectPage;

    @Feature("Select Item")
    @Description("Test Description: Go to Search Page and select First Item and click on it ")
    @Test
    public void selectItem() throws InterruptedException {

        searchPage = new TC_1SearchPage(driver);
        searchPage.searchField();

        selectPage = new TC_2SelectPage(driver);
        selectPage.checkItem();
    }

}
