package tests;

import org.testng.annotations.Test;
import pages.ChooseLoginMethodPage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.PreloginPage;

import static org.testng.Assert.assertTrue;

public class DemoTest extends AndroidBaseTest {

    @Test(testName = "Авторизация в демо версию")
    public void MainScreenWithSearchTest() {
        PreloginPage preloginPage = new PreloginPage(driver);
        assertTrue(preloginPage.isShown());
        preloginPage.clickLoginButton();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickDemoButton();

        ChooseLoginMethodPage chooseLoginMethodPage = new ChooseLoginMethodPage(driver);
        chooseLoginMethodPage.choiseLoginEnter();
        chooseLoginMethodPage.proceedChoiceMetodEnter();

        DashboardPage dashboardPage = new DashboardPage(driver);
        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertTrue(dashboardPage.isShown());
    }
}
