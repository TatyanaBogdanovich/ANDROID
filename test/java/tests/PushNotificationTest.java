package tests;

import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertEquals;

public class PushNotificationTest extends AndroidBaseTest {

    @Test(testName = "История PUSH - уведомлений")
    public void MainScreenWithSearchTest() {

        PreloginPage preloginPage = new PreloginPage(driver);
        //assertTrue(preloginPage.isShown());
        preloginPage.clickLoginButton();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setEmailField();
        loginPage.setPasswordField();
        loginPage.clickLoginButton();

        ChooseLoginMethodPage chooseLoginMethodPage = new ChooseLoginMethodPage(driver);
        assertEquals(chooseLoginMethodPage.getTitleText(), "Выберите способ входа в приложение");
        chooseLoginMethodPage.choiseLoginEnter();
        chooseLoginMethodPage.proceedChoiceMetodEnter();

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.waitLoadingDashboardPage();
        dashboardPage.clickSektionMoreButton();

        MorePage morePage = new MorePage(driver);
        morePage.clickPushButton();

        PushPage pushPage = new PushPage(driver);
        pushPage.waitLoadingAccountPage();
        pushPage.clickPushHistory();
    }
}