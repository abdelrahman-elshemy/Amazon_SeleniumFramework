package Amazon.scenario2;

import Amazon.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_6SubmitOrderTest extends TestBase {

    public TC_1HomePage TC1HomePage;
    public TC_2TodayDealsPage TC2TodayDealsPage;
    public TC_3ItemsPage itemsPage;
    public TC_4QuantityPage quantityPage;
    public TC_5CartPage cartPage;
    public TC_6SubmitOrderPage submitOrderPage;
    @Feature("Verify Information of product")
    @Description("Test Description: Go to Cart and check of name,price,qty,subtotal")
    @Test
    public void checkItemsInformation() throws InterruptedException {

        TC1HomePage = new TC_1HomePage(driver);
        TC1HomePage.deals();

        TC2TodayDealsPage = new TC_2TodayDealsPage(driver);
        TC2TodayDealsPage.checkProduct();

        itemsPage = new TC_3ItemsPage(driver);
        itemsPage.checkItem();

        quantityPage = new TC_4QuantityPage(driver);
        String productTitleInQuantityPage = quantityPage.getProductTitleInQTYPage();
        String productPriceInQuantityPage = quantityPage.getProductPriceInQTYPage();
        quantityPage.selectQuantiity();


        cartPage = new TC_5CartPage(driver);
        String productSubTotalInCartPage = cartPage.getProductSubTotalInCart();
        String productQuantityInCartPage = cartPage.getProductQuantityInCart();
        cartPage.clickCart();

        submitOrderPage = new TC_6SubmitOrderPage(driver);
        String productTitleInSubmitOrderPage = submitOrderPage.getProductTitleInSubmitOrderPage();
        String productPriceInSubmitOrderPage = submitOrderPage.getProductPriceInSubmitOrderPage();
        String productSubTotalSubmitOrderPage = submitOrderPage.getProductSubTotalInSubmitOrderPage();
        String productQuantityInSubmitOrderPage = submitOrderPage.getProductQuantityInSubmitOrderPage();


      //  Assert.assertEquals(productTitleInQuantityPage,productTitleInSubmitOrderPage);
      //  Assert.assertEquals(productPriceInQuantityPage,productPriceInSubmitOrderPage);
      //  Assert.assertEquals(productSubTotalInCartPage,productSubTotalSubmitOrderPage);
        Assert.assertEquals(productQuantityInCartPage,productQuantityInSubmitOrderPage);

    }
}
