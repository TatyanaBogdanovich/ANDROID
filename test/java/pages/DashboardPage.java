package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.stream.Stream;

public class DashboardPage extends BasePage {
    /**
     * @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"by.bpssberbank.sbolb.ift:id/recycler_view\"]/android.widget.FrameLayout[1]/android.view.ViewGroup")
     * private AndroidElement ACCOUNTS;
     * @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"by.bpssberbank.sbolb.ift:id/recycler_view\"]/android.widget.FrameLayout[2]/android.view.ViewGroup")
     * private AndroidElement CORPO_CART;
     * @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"by.bpssberbank.sbolb.ift:id/recycler_view\"]/android.widget.FrameLayout[3]/android.view.ViewGroup")
     * private AndroidElement IN_WORK;
     **/
    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/documentsListFragment")
    private AndroidElement DOCUMENT_LIST;
    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/createDocumentFragment")
    private AndroidElement CREATE_DOCUMENT;
    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/bankDocumentsTabFragment")
    private AndroidElement CORRESPONDENCE_LIST;
    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/moreSettingsFragment")
    private AndroidElement SEKTION_MORE;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id=\"by.bpssberbank.sbolb.ift:id/layout_title\"]/android.widget.ImageView")
    private AndroidElement CHANGE_CASTOMER;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"by.bpssberbank.sbolb.ift:id/image_more\"])[1]")
    private AndroidElement ACCOUNT_LIST;
    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"by.bpssberbank.sbolb.ift:id/recycler_view\"]/android.view.ViewGroup[2]")
    private AndroidElement ACCOUNT_VIEW;
    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"by.bpssberbank.sbolb.ift:id/recycler_view\"]/android.view.ViewGroup[4]")
    private AndroidElement ALL_ACCOUNT_BUTTON;

    public DashboardPage(AndroidDriver driver) {
        super(driver);
    }

    /**
     * public boolean isAccountVisible (){
     * return this.ACCOUNTS.isDisplayed();
     * }
     * public void waitLoadingDashboardPage () {
     * wait.until(ExpectedConditions.visibilityOf(IN_WORK));
     * }
     **/
    public void clickDocumentListButton() {
        DOCUMENT_LIST.click();
    }

    public void clickCreateDocumentButton() {
        CREATE_DOCUMENT.click();
    }

    public void clickCorrespondenceDocumentButton() {
        CORRESPONDENCE_LIST.click();
    }

    public void clickSektionMoreButton() {
        SEKTION_MORE.click();
    }

    public void clickAccountListButton() {
        ACCOUNT_LIST.click();
    }

    public void waitLoadingDashboardPage() {
        try {
            Thread.sleep(15 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void waitLoadingAccountPage() {
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickAccountViewButton() {
        ACCOUNT_VIEW.click();
    }
    //public void clickAllAccountsButton() {ALL_ACCOUNT_BUTTON.click();}

    @Override
    public boolean isShown() {
        return Stream.of(DOCUMENT_LIST, CREATE_DOCUMENT, CORRESPONDENCE_LIST, SEKTION_MORE, ACCOUNT_LIST, ACCOUNT_VIEW, ALL_ACCOUNT_BUTTON).allMatch(AndroidElement::isDisplayed);
    }
}
