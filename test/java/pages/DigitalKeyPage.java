package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.stream.Stream;

public class DigitalKeyPage extends BasePage {

    public DigitalKeyPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/keyboard_button_1")
    private AndroidElement NUMERAL1_BUTTON;

    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/keyboard_button_2")
    private AndroidElement NUMERAL2_BUTTON;

    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/keyboard_button_3")
    private AndroidElement NUMERAL3_BUTTON;

    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/keyboard_button_4")
    private AndroidElement NUMERAL4_BUTTON;

    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/keyboard_button_5")
    private AndroidElement NUMERAL5_BUTTON;


    public DigitalKeyPage clickNUMERAL1_BUTTON() {
        NUMERAL1_BUTTON.click();
        return this;
    }

    public DigitalKeyPage clickNUMERAL2_BUTTON() {
        NUMERAL2_BUTTON.click();
        return this;
    }

    public DigitalKeyPage clickNUMERAL3_BUTTON() {
        NUMERAL3_BUTTON.click();
        return this;

    }

    public DigitalKeyPage clickNUMERAL4_BUTTON() {
        NUMERAL4_BUTTON.click();
        return this;
    }

    public DigitalKeyPage clickNUMERAL5_BUTTON() {
        NUMERAL5_BUTTON.click();
        return new DigitalKeyPage(driver);
    }

    @Override
    public boolean isShown() {
        return Stream.of(NUMERAL1_BUTTON, NUMERAL2_BUTTON, NUMERAL3_BUTTON, NUMERAL4_BUTTON, NUMERAL5_BUTTON).allMatch(AndroidElement::isDisplayed);
    }
}