package Amazon.scenario2;
import Amazon.TestBase.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
public class TC_11AddItemToCartTest extends TestBase {
    public TC_6TodaysDealsPage todaysdealspage;
    public TC_7FiltersPage filters;
    public TC_8DiscountPage discount;
    public TC_9PageSelectPage selectitem;

    public TC_10SelectItemPage selectitempage;
    public TC_11AddItemToCartPage additem;
    @Feature("Add to cart")
    @Description("Add Item To Cart")
    @Test
    public void SelectItem() throws InterruptedException {
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

        selectitempage = new TC_10SelectItemPage(driver);
        selectitempage.SelectItem();

        additem = new TC_11AddItemToCartPage(driver);
        additem.addItem();



    }



}
