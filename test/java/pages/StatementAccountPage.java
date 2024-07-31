package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.stream.Stream;

public class StatementAccountPage extends BasePage {

    @AndroidFindBy(xpath = "(//android.widget.FrameLayout[@resource-id=\"by.bpssberbank.sbolb.ift:id/main_host_navigation\"])[2]/android.widget.LinearLayout")
    private AndroidElement SCREEN_INFO_ACCOUNT;

    public StatementAccountPage(AndroidDriver driver) {
        super(driver);
    }

    public void waitLoadingScreenPage() {
        try {
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendScreenInfoAccount() {
        SCREEN_INFO_ACCOUNT.sendKeys();
    }

//      public void clickAllAccountsButton() { ALL_ACCOUNT_BUTTON.click(); //

    @Override
    public boolean isShown() {
        return Stream.of(SCREEN_INFO_ACCOUNT).allMatch(AndroidElement::isDisplayed);
    }
}

