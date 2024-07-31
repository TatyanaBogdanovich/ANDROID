package tests;

import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertTrue;

public class StatementAccountTest extends AndroidBaseTest {

    @Test(testName = "Выписка по счету")
    public void MainScreenWithSearchTest() {

        PreloginPage preloginPage = new PreloginPage(driver);
        assertTrue(preloginPage.isShown());
        preloginPage.clickLoginButton();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setEmailField();
        loginPage.setPasswordField();
        loginPage.clickLoginButton();

        ChooseLoginMethodPage chooseLoginMethodPage = new ChooseLoginMethodPage(driver);
        chooseLoginMethodPage.choiseLoginEnter();
        chooseLoginMethodPage.proceedChoiceMetodEnter();

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.waitLoadingDashboardPage();
        dashboardPage.clickAccountListButton();
        dashboardPage.waitLoadingAccountPage();
        dashboardPage.clickAccountViewButton();

        StatementAccountPage statementAccountPage = new StatementAccountPage(driver);
        statementAccountPage.waitLoadingScreenPage();
        assertTrue(statementAccountPage.isShown());
    }
}

