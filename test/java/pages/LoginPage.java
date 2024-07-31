package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.stream.Stream;


public class LoginPage extends BasePage {

    private String email = "sMobile";
    private String pwd = "1";

    private String invalidEmail = "sMobile_12345";
    private final String invalidPwd = "1";

//    private final String textError = "Введен неверный логин или пароль";
//    private final String positiveButton = "OK";


    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/email_et")
    private AndroidElement EMAIL_FIELD;

    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/password_et")
    private AndroidElement PASS_FIELD;

    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/login_btn")
    private AndroidElement LOGIN_BUTTON;

    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/md_content")
    private AndroidElement TEXT_ERROR;

    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/md_buttonDefaultPositive")
    private AndroidElement POSITIVE_BUTTON;

    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/demo_button")
    private AndroidElement DEMO_BUTTON;

    @AndroidFindBy(id = "by.bpssberbank.sbolb.ift:id/btn_recovery")
    private AndroidElement RESET_PWD;

    public LoginPage(AndroidDriver driver) {
        super(driver);
    }

    @Override
    public boolean isShown() {
        return false;
    }

    public void clickDemoButton() {
        DEMO_BUTTON.click();
    }

    public void clickResedPwdButton() {
        RESET_PWD.click();
    }

    public void setEmailField() {
        EMAIL_FIELD.sendKeys(email);
    }

    public void setInvalidEmailField() {
        EMAIL_FIELD.sendKeys(invalidEmail);
    }

    public void setPasswordField() {
        PASS_FIELD.sendKeys(pwd);
    }

    public void setInvalidPasswordField() {
        PASS_FIELD.sendKeys(invalidPwd);
    }

    public void clickLoginButton() {
        LOGIN_BUTTON.click();
    }

    public String setTextError() {
        return TEXT_ERROR.getText();
    }

    public void clickPositiveButton() {
        POSITIVE_BUTTON.click();
        new LoginPage(driver);
    }

    boolean isShown;

    {
        Stream.of(EMAIL_FIELD, PASS_FIELD, LOGIN_BUTTON, DEMO_BUTTON, RESET_PWD).allMatch(AndroidElement::isDisplayed);
    }
}

