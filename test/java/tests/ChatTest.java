package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ChatPage;
import pages.DashboardPage;
import pages.PreloginPage;
import pages.ScreenChatPage;

import static org.testng.Assert.assertTrue;

public class ChatTest extends AndroidBaseTest {

    @Test(testName = "Чат с банком")
    public void MainScreenWithSearchTest() {
        PreloginPage preloginPage = new PreloginPage(driver);
        assertTrue(preloginPage.isShown());
        preloginPage.clickChatButton();

        ChatPage chatPage = new ChatPage(driver);
        //chatPage.chooseWeyText();
        chatPage.chatToBankClick();

        ScreenChatPage screenChatPage = new ScreenChatPage(driver);
        assertTrue(screenChatPage.isShown());
    }
}
