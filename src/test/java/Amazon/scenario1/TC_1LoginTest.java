package Amazon.scenario1;

import Amazon.TestBase;
import data.DataReader;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_1LoginTest extends TestBase {
 public TC_1LoginPage loginPage;
@Feature("Login Tests")
@Description("Test Description: Login test with valid email but not registered email")
@Test(description="Invalid Login Scenario with valid email")
 public void goToSignInPage() throws IOException, ParseException {

        DataReader dataReader = new DataReader();
        dataReader.Reader();
        loginPage = new TC_1LoginPage(driver);
        loginPage.userSignin(dataReader.eemail);
 }


}
