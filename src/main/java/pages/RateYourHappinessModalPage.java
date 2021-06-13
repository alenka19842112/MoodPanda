package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class RateYourHappinessModalPage {
    public static final String SLIDER_CSS = ".ui-slider-handle";
    public static final String UPDATE_MOOD_BUTTON = ".ButtonUpdate";
    public static final String INPUT_CSS = "#TextBoxUpdateMoodTag";

    public RateYourHappinessModalPage inputText(String text) {
        $(INPUT_CSS).sendKeys(text);
        return this;
    }
    public RateYourHappinessModalPage waitForInputVisible(){
        $(INPUT_CSS).shouldBe(Condition.visible, Duration.ofSeconds(10));
        return this;
    }

    public MoodUpdatedModalPage updateMood(int moodValue) {
        $(SLIDER_CSS).click();
        int defaultMoodValue = 5;
        Keys direction = null;
        if (moodValue > defaultMoodValue) {
            direction = Keys.ARROW_RIGHT;
        } else if (moodValue < defaultMoodValue) {
            direction = Keys.ARROW_LEFT;
        }
        if (moodValue != defaultMoodValue) {
            for (int i = 0; i < Math.abs(moodValue - defaultMoodValue); i++) {
                $(SLIDER_CSS).sendKeys(direction);
            }
        }
        $(UPDATE_MOOD_BUTTON).click();
        return new MoodUpdatedModalPage();
    }
}
