package tests;

import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DocumentListTest extends AndroidBaseTest {

    @Test(testName = "Раздел Документы")
    public void MainScreenWithSearchTest() {

        PreloginPage preloginPage = new PreloginPage(driver);
        assertTrue(preloginPage.isShown());
        preloginPage.clickLoginButton();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setEmailField();
        loginPage.setPasswordField();
        loginPage.clickLoginButton();

        ChooseLoginMethodPage chooseLoginMethodPage = new ChooseLoginMethodPage(driver);
        assertTrue(chooseLoginMethodPage.isShown());
        assertEquals(chooseLoginMethodPage.getTitleText(), "Выберите способ входа в приложение");
        chooseLoginMethodPage.choiseLoginEnter();
        chooseLoginMethodPage.proceedChoiceMetodEnter();

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.waitLoadingDashboardPage();
        dashboardPage.clickDocumentListButton();

    }
}
