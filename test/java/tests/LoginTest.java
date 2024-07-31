package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends AndroidBaseTest {

    @BeforeMethod
    public void setTestApp() {
        driver.resetApp();
    }

    @Test(testName = "Авторизация в приложении по логину и паролю")
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
        assertEquals(chooseLoginMethodPage.getChoiceLoginEnterText(), "Вход по логину и паролю");
        assertEquals(chooseLoginMethodPage.getChoiceKeyEnterText(), "Вход с помощью цифрового ключа");
        chooseLoginMethodPage.choiseLoginEnter();
        chooseLoginMethodPage.proceedChoiceMetodEnter();

        DashboardPage dashboardPage = new DashboardPage(driver);
        try {
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertTrue(dashboardPage.isShown());
    }
}
