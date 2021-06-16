package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class MoodUpdatedModalPage extends BasePage{
    public static final String GO_TO_MY_DIARY_BUTTON_CSS = ".ButtonMyDiary ";

    @Step("click 'Go to My Diary' Button on 'Mood Updated' Modal")
    public MyDiaryPage clickGoToMyDiaryButton() {
        waitForElementVisible(GO_TO_MY_DIARY_BUTTON_CSS);
        $(GO_TO_MY_DIARY_BUTTON_CSS).click();
        return new MyDiaryPage();
    }
}
