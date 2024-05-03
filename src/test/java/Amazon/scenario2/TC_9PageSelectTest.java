package Amazon.scenario2;
import Amazon.TestBase.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
public class TC_9PageSelectTest extends TestBase {
    public TC_6TodaysDealsPage todaysdealspage;
    public TC_7FiltersPage filters;
    public TC_8DiscountPage discount;
    public TC_9PageSelectPage selectitem;

    @Feature("Use Filters")
    @Description("Using Filters")
    @Test
    public void ChooseFilters() throws InterruptedException {
        todaysdealspage = new TC_6TodaysDealsPage(driver);
        todaysdealspage.ClickOnTodaysDeals();

        filters = new TC_7FiltersPage(driver);
        filters.ScrollDown();

        filters = new TC_7FiltersPage(driver);
        filters.ClickOnCheckbox();

        discount = new TC_8DiscountPage(driver);
        discount.ScrollDownMore();
        discount.ClickOnCheckbox();

        selectitem = new TC_9PageSelectPage(driver);
        selectitem.ScrollToEnd();
        selectitem.ClickOnButton();
    }



}
