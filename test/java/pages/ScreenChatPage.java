package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import javafx.stage.Screen;

import javax.swing.text.View;
import java.util.stream.Stream;

public class ScreenChatPage extends BasePage {

    //ScreenChatPage chatPage = new ScreenPage(driver);

    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/webView")
    private AndroidElement WEB_VIEW;

    public ScreenChatPage(AndroidDriver driver) {
        super(driver);
    }

    public void screenChat() {
        WEB_VIEW.getText();
    }

    @Override
    public boolean isShown() {
        return Stream.of(WEB_VIEW).allMatch(AndroidElement::isDisplayed);
    }
}


/**
 * CHOOSE_WEY_TEXT
 **/


//@AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/phone_to_bank_bttn")
//    private AndroidElement CALL_TO_BANK_BUTTON;

//    public void clickChatButton() {
//        CHAT_BUTTON.click();