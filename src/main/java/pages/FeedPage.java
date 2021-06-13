package pages;

import com.codeborne.selenide.Condition;
import constans.IConstans;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FeedPage implements IConstans {
    public static final String UPDATE_MOOD_BUTTON_CSS = "#LinkUpdate";
    public static final String Me_DROP_DOWN_CSS = "#LIMe";
    public static final String ACCOUNT_DROP_DOWN_CSS = "#Settings";

    public RateYourHappinessModalPage clickOnUpdateMoodButton() {
        $(UPDATE_MOOD_BUTTON_CSS).click();
        return new RateYourHappinessModalPage();
    }

    public FeedPage waitForMoodButtonVisible() {
        $(UPDATE_MOOD_BUTTON_CSS).shouldBe(Condition.visible, Duration.ofSeconds(10));
        return this;
    }

    public MyUpdatesPage clickMeDropDownAndMyUpdates() {
        $(Me_DROP_DOWN_CSS).click();
        $$(Me_DROP_DOWN_CSS + " a").findBy(text("My updates")).click();
        return new MyUpdatesPage();
    }
}
