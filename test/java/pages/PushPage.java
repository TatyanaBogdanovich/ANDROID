package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.Arrays;

public class PushPage extends BasePage {

    public PushPage(AndroidDriver driver) {
        super(driver);
    }
    //    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id=\"by.bpssberbank.sbolb.ift:id/switch1\"]")
    //    private AndroidElement SWICH_BUTTON;

    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/btn_open_push_history")
    private AndroidElement PUSH_HISTORY_BUTTON;

    public void waitLoadingAccountPage() {
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickPushHistory() {
        PUSH_HISTORY_BUTTON.click();
    }

    @Override
    public boolean isShown() {
        for (AndroidElement androidElement : Arrays.asList(PUSH_HISTORY_BUTTON)) {
            if (!androidElement.isDisplayed()) {
                return false;
            }
        }
        return false;
    }
}


