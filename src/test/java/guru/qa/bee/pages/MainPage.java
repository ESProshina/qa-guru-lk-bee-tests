package guru.qa.bee.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;

public class MainPage {

    private final SelenideElement body = $("body");

    @Step("Открываем главную страницу")
    public MainPage openPage() {
        open("/");
        return this;
    }

    @Step("Проверяем, что title содержит {expectedTitle}")
    public MainPage shouldHaveTitle(String expectedTitle) {
        title().contains(expectedTitle);
        return this;
    }

    @Step("Проверяем, что страница загрузилась")
    public MainPage shouldBeLoaded() {
        body.shouldBe(visible);
        return this;
    }
}
