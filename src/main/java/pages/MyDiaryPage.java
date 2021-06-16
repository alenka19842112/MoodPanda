package pages;

import constans.IConstans;
import static com.codeborne.selenide.Selenide.$$;

public class MyDiaryPage extends DropDownPage implements IConstans {

    public static final String MOOD_POST_ITEM_CSS = ".MoodPostItem.media-content";
    public static final String BADGE_CSS = ".badge.pull-right";

    public String getMoodDigitText(int numberOfDigit) {
        return $$(BADGE_CSS).get(numberOfDigit - 1).getText();
    }

    public String getMoodPostText(int numberOfPost) {
        return $$(MOOD_POST_ITEM_CSS).get(numberOfPost - 1).getText();
    }
}
