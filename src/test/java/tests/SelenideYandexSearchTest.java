package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideYandexSearchTest {

    @Test
    void selenideYandexSearchTest() {
        open("https://yandex.ru/");
        $("#text").setValue("Selenide").pressEnter();
        // assert
        $("#search-result").shouldHave(Condition.text("Selenide"));
    }
}
