package Amazon.scenario1;
import Amazon.TestBase.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;


public class TC_3AddTest extends TestBase {

    public TC_1SearchPage searchPage;
    public TC_2SelectPage selectPage;
    public TC_3AddPage addPage;

    @Feature("Add Item")
    @Description("Test Description: Add Item to Cart Page ")
    @Test
    public void addItemToCart() throws InterruptedException {

        searchPage = new TC_1SearchPage(driver);
        searchPage.searchField();

        selectPage = new TC_2SelectPage(driver);
        selectPage.checkItem();

        addPage = new TC_3AddPage(driver);
        addPage.addToCart();


    }


}
