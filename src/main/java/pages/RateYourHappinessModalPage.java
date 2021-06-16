package pages;

import constans.IConstans;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.$;

public class RateYourHappinessModalPage extends BasePage implements IConstans {
    public static final String SLIDER_CSS = ".ui-slider-handle";
    public static final String UPDATE_MOOD_BUTTON = ".ButtonUpdate";
    public static final String INPUT_CSS = "#TextBoxUpdateMoodTag";

    //@Step("Input text on Rate your Happiness Modal")
    public RateYourHappinessModalPage inputText(String text) {
        waitForElementVisible(INPUT_CSS);
        $(INPUT_CSS).sendKeys(text);
        return this;
    }

    //@Step("Update Mood on Rate your Happiness Modal")
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
