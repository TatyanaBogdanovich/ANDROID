package tests;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.PreloginPage;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class AndroidBaseTest {

    public static final String APPIUM_LOCAL_URL = "http://127.0.0.1:4723/wd/hub"; //
    public static final String APPIUM_REMOTE_URL = "http://localhost:4723/wd/hub";

    public static final String ANDROID_PLATFORM_NAME = "Android";
    public static AndroidDriver driver;

    Logger log = Logger.getLogger(AndroidBaseTest.class.getName());

    @BeforeClass
    public void setUp() {
        driver = initDriver();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.closeApp();
            driver.quit();
        }
    }

    @AfterMethod(alwaysRun = true)
    public void afterTest(ITestResult result) {
        if (!result.isSuccess()) {
            makeScreenshot();
        }
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] makeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    private AndroidDriver initDriver() {
        try {
            driver = new AndroidDriver(new URL(APPIUM_LOCAL_URL), getLocalCapabilities());
            log.info("Appium url: " + APPIUM_LOCAL_URL);
        } catch (Exception ex) {
            throw new RuntimeException("Appium driver could not be initialized." + ex.getMessage());
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }

    private DesiredCapabilities getLocalCapabilities() {


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel 6a API 30");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("app", "C:\\Users\\tatyana.bogdanovich\\IdeaProjects\\ANDROID\\src\\test\\resources\\App\\app-ift.apk");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("appPackage", "by.bpssberbank.sbolb.ift");
        capabilities.setCapability("appActivity", "by.bpssberbank.sbolb.presentation.MainActivity");
        capabilities.setCapability("newCommandTimeout", 600);
        return capabilities;
    }
}