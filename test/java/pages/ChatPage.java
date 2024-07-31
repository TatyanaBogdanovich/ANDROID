package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.stream.Stream;

public class ChatPage extends BasePage {

    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/design_bottom_sheet")
    private AndroidElement CHOOSE_WEY_TEXT;
    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/chat_bttn")
    private AndroidElement CHAT_TO_BANK_BUTTON;

    public ChatPage(AndroidDriver driver) {
        super(driver);
    }

    public void chooseWeyText() {
        CHOOSE_WEY_TEXT.getText();
    }

    public void chatToBankClick() {
        CHAT_TO_BANK_BUTTON.click();
        ChatPage chatPage = new ChatPage(driver);
    }

    @Override
    public boolean isShown() {
        return Stream.of(CHAT_TO_BANK_BUTTON).allMatch(AndroidElement::isDisplayed);
    }
}

/**
 * CHOOSE_WEY_TEXT
 **/


//@AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/phone_to_bank_bttn")
//    private AndroidElement CALL_TO_BANK_BUTTON;

//    public void clickChatButton() {
//        CHAT_BUTTON.click(); }

