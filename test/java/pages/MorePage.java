package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.Arrays;

public class MorePage extends BasePage {

    public MorePage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/image_action")
    private AndroidElement PUSH_BUTTON;

    public void clickPushButton() {
        PUSH_BUTTON.click();
    }

    @Override
    public boolean isShown() {
        for (AndroidElement androidElement : Arrays.asList(PUSH_BUTTON)) {
            if (!androidElement.isDisplayed()) {
                return false;
            }
        }
        return false;
    }
}
