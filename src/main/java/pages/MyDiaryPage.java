package pages;

import static com.codeborne.selenide.Selenide.$$;

public class MyDiaryPage {

    public static final String MOOD_POST_ITEM_CSS = ".MoodPostItem.media-content";
    public static final String BADGE_CSS = ".badge.pull-right";

    public String getText(String locator) {
        return $$(locator).get(0).getText();
    }
}
