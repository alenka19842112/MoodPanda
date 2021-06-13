package tests;

import constansTest.IConstansTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodPandaTest extends BaseTest implements IConstansTest {

    @Test(description = "checking the text in the last Mood Post field on My Diary page", priority = 1)
    public void lastMoodPostTest() {
        loginPage
                .openPage()
                .login(LOGIN, PASSWORD)
                .waitForMoodButtonVisible()
                .clickOnUpdateMoodButton()
                .waitForInputVisible()
                .inputText("I'm Ok")
                .updateMood(10)
                .clickGoToMyDiaryButton();
        Assert.assertEquals(myDiaryPage.getText(MOOD_POST_ITEM_CSS), "I'm Ok");
    }

    @Test(description = "checking the last mood digit on My Diary page", priority = 1)
    public void lastMoodDigitTest() {
        loginPage
                .openPage()
                .login(LOGIN, PASSWORD)
                .waitForMoodButtonVisible()
                .clickOnUpdateMoodButton()
                .updateMood(1)
                .clickGoToMyDiaryButton();
        Assert.assertEquals(myDiaryPage.getText(BADGE_CSS), "1");
    }

    @Test(description = "delete post mood Diary on My Updates page", priority = 1)
    public void deleteLastMoodDiaryTest() {
        loginPage
                .openPage()
                .login(LOGIN, PASSWORD)
                .clickMeDropDownAndMyUpdates();
        String elementId = myUpdatesPage.clickDeleteButtonMyDiary(1);
        Assert.assertFalse(myUpdatesPage.isExistDeletedElementIDOnMyDiaryPage(elementId));
    }
}
