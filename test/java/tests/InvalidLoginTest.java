package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.*;

public class InvalidLoginTest extends AndroidBaseTest {
    @Test(testName = "Негативный тест на логин")
    public void MainScreenWithSearchTest() {
        PreloginPage preloginPage = new PreloginPage(driver);
        assertTrue(preloginPage.isShown());
        preloginPage.clickLoginButton();

        LoginPage loginPage = new LoginPage(driver);
        assertFalse(loginPage.isShown());
        loginPage.setInvalidEmailField();
        loginPage.setInvalidPasswordField();
        loginPage.clickLoginButton();

        Assert.assertEquals(loginPage.setTextError(), "Введен неверный логин или пароль");
        loginPage.clickPositiveButton();
        assertFalse(loginPage.isShown());
    }
}
