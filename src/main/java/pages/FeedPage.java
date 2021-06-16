package pages;

import constans.IConstans;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class FeedPage extends DropDownPage implements IConstans {
    public static final String UPDATE_MOOD_BUTTON_CSS = "#LinkUpdate";

    @Step("click on 'Update Mood' button on Feed Page")
    public RateYourHappinessModalPage clickOnUpdateMoodButton() {
        waitForElementVisible(UPDATE_MOOD_BUTTON_CSS);
        $(UPDATE_MOOD_BUTTON_CSS).click();
        return new RateYourHappinessModalPage();
    }
}
