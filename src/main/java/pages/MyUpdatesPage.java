package pages;

import com.codeborne.selenide.Condition;
import constans.IConstans;

import static com.codeborne.selenide.Selenide.$$;

public class MyUpdatesPage implements IConstans {

    public static final String DELETE_BUTTON_CSS = ".glyphicon.glyphicon-trash.ButtonDelete";

    public Boolean isExistDeletedElementIDOnMyDiaryPage(String elementId) {
        return $$(DELETE_BUTTON_CSS).find(Condition.id(elementId)).isDisplayed();
    }

    public String clickDeleteButtonMyDiary(int numberOfPost) {
        String elementId = $$(DELETE_BUTTON_CSS).get(numberOfPost - 1).getAttribute("id");
        $$(DELETE_BUTTON_CSS).get(numberOfPost - 1).click();
        return elementId;
    }
}
