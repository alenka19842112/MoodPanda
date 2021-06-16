package pages;

import constans.IConstans;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DropDownPage extends BasePage implements IConstans {
    public static final String ME_DROP_DOWN_CSS = "#LIMe";
    public static final String ACCOUNT_DROP_DOWN_CSS = "#Settings";

    @Step("click 'My Updates' from DropDown 'Me'")
    public MyUpdatesPage clickMyUpdatesFromDropDown() {
        waitForElementVisible(ME_DROP_DOWN_CSS);
        $(ME_DROP_DOWN_CSS).click();
        $$(ME_DROP_DOWN_CSS + " a").findBy(text("My updates")).click();
        return new MyUpdatesPage();
    }
}
