 import com.codeborne.selenide.Configuration;
 import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OpenPage {

    @Test
    void successfulOpenPage() {
        Configuration.holdBrowserOpen = true;
        open("https://snoonu.com/");
        $("[name=search]").setValue("Snoomart").pressEnter();
           $("[id=__next]").shouldHave(text("Snoomart"));
    }
}
