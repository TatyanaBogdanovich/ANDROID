package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.stream.Stream;

public class ChooseKeyMethodPage extends BasePage {
    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/title_contract")
    private AndroidElement TITLE;
    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/login_radio_bttn")
    private AndroidElement CHOISE_LOGIN_ENTER;
    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/pin_radio_bttn")
    private AndroidElement CHOISE_KEY_ENTER;
    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/finger_radio_bttn")
    private AndroidElement CHOICE_IMPRINT_ENTER;
    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/next_bttn")
    private AndroidElement NEXT_BUTTON;

    public ChooseKeyMethodPage(AndroidDriver driver) {
        super(driver);
    }

    public String getTitleText() {
        return this.TITLE.getText();
    }

    public String getChoiceLoginEnterText() {
        return this.CHOISE_LOGIN_ENTER.getText();
    }

    public String getChoiceKeyEnterText() {
        return this.CHOISE_KEY_ENTER.getText();
    }

    public String getChoiceImprintEnterText() {
        return this.CHOICE_IMPRINT_ENTER.getText();
    }

    public pages.ChooseKeyMethodPage choiseLoginEnter() {
        CHOISE_KEY_ENTER.click();
        return new pages.ChooseKeyMethodPage(driver);
    }

    public pages.ChooseKeyMethodPage proceedChoiceMetodEnter() {
        NEXT_BUTTON.click();
        return new pages.ChooseKeyMethodPage(driver);
    }

    @Override
    public boolean isShown() {
        return Stream.of(TITLE, CHOISE_LOGIN_ENTER, NEXT_BUTTON).allMatch(AndroidElement::isDisplayed);
    }
}

