package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.stream.Stream;

public class PreloginPage extends BasePage {

    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/login_btn")
    private AndroidElement LOGIN_BUTTON;
    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/chat_image_view")
    private AndroidElement CHAT_BUTTON;

    public PreloginPage(AndroidDriver driver) {
        super(driver);
    }

    public void clickLoginButton() {
        LOGIN_BUTTON.click();
    }

    public void clickChatButton() {
        CHAT_BUTTON.click();
    }

    @Override
    public boolean isShown() {
        return Stream.of(LOGIN_BUTTON, CHAT_BUTTON).allMatch(AndroidElement::isDisplayed);
    }
}


//@AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/phone_to_bank_bttn")
//    private AndroidElement CALL_TO_BANK_BUTTON;

//    public void clickChatButton() {
//        CHAT_BUTTON.click(); }




