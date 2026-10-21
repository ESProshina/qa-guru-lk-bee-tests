package guru.qa.bee.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CheckBoxPage {

    @Step("Открываем страницу Check Box")
    public CheckBoxPage openPage() {
        open("/checkbox");
        return this;
    }

    @Step("Выбираем чекбокс Home")
    public CheckBoxPage selectHomeCheckbox() {
        // Кликаем по первому элементу с классом rc-tree-checkbox (это и есть квадратик Home)
        $(".rc-tree-checkbox").click();
        return this;
    }

    @Step("Проверяем, что в результате есть текст: {expectedText}")
    public CheckBoxPage shouldHaveResult(String expectedText) {
        // Ждем появления блока с результатом и проверяем текст
        $("#result").shouldBe(visible).shouldHave(text(expectedText));
        return this;
    }
}