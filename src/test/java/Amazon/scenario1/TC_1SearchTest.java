package Amazon.scenario1;

import Amazon.TestBase.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class TC_1SearchTest extends TestBase {
    public TC_1SearchPage searchpage;

    @Feature("Search For Item")
    @Description("Test Description: Go to Search")
    @Test
    public void goToSearchField() throws InterruptedException {

        searchpage = new TC_1SearchPage(driver);
        searchpage.searchField();
    }
}
