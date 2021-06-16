package pages;

import com.codeborne.selenide.Condition;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    public void waitForElementVisible(String locator) {
        $(locator).shouldBe(Condition.visible, Duration.ofSeconds(10));
    }
}
