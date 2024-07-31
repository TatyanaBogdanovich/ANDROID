package tests;

import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DigitalKeyTest extends AndroidBaseTest {

    @Test(testName = "Авторизация по цифровому ключу")
    public void MainScreenWithSearchTest() {
        PreloginPage preloginPage = new PreloginPage(driver);
        assertTrue(preloginPage.isShown());
        preloginPage.clickLoginButton();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setEmailField();
        loginPage.setPasswordField();
        loginPage.clickLoginButton();

        ChooseKeyMethodPage chooseKeyMethodPage = new ChooseKeyMethodPage(driver);
        assertTrue(chooseKeyMethodPage.isShown());
        assertEquals(chooseKeyMethodPage.getTitleText(), "Выберите способ входа в приложение");
        assertEquals(chooseKeyMethodPage.getChoiceLoginEnterText(), "Вход по логину и паролю");
        assertEquals(chooseKeyMethodPage.getChoiceKeyEnterText(), "Вход с помощью цифрового ключа");
        chooseKeyMethodPage.choiseLoginEnter();
        chooseKeyMethodPage.proceedChoiceMetodEnter();

        DigitalKeyPage digitalKeyPage = new DigitalKeyPage(driver);
        assertTrue(digitalKeyPage.isShown());
        digitalKeyPage.clickNUMERAL1_BUTTON();
        digitalKeyPage.clickNUMERAL2_BUTTON();
        digitalKeyPage.clickNUMERAL3_BUTTON();
        digitalKeyPage.clickNUMERAL4_BUTTON();
        digitalKeyPage.clickNUMERAL5_BUTTON();
        assertTrue(digitalKeyPage.isShown());
        digitalKeyPage.clickNUMERAL1_BUTTON();
        digitalKeyPage.clickNUMERAL2_BUTTON();
        digitalKeyPage.clickNUMERAL3_BUTTON();
        digitalKeyPage.clickNUMERAL4_BUTTON();
        digitalKeyPage.clickNUMERAL5_BUTTON();

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.waitLoadingDashboardPage();
        assertTrue(dashboardPage.isShown());
    }
}


