package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {
    LoginPage loginPage;
    FeedPage feedPage;
    RateYourHappinessModalPage rateYourHappinessModalPage;
    MyDiaryPage myDiaryPage;
    MyUpdatesPage myUpdatesPage;

    public void init() {
        loginPage = new LoginPage();
        feedPage = new FeedPage();
        rateYourHappinessModalPage = new RateYourHappinessModalPage();
        myDiaryPage = new MyDiaryPage();
        myUpdatesPage = new MyUpdatesPage();
    }

    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.timeout = 15000;
        Configuration.holdBrowserOpen = true;
        Configuration.headless = false;
        init();
    }

    @AfterMethod
    public void closeBrowser() {
        getWebDriver().quit();
    }
}
