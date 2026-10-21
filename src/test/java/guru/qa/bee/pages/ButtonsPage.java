package guru.qa.bee.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ButtonsPage {

    @Step("Открываем раздел 'Подтверждение действий'")
    public ButtonsPage openPage() {
        open("/buttons");
        return this;
    }

    @Step("Дважды кликаем по кнопке подтверждения")
    public ButtonsPage doubleClick() {
        $("#doubleClickBtn").doubleClick();
        return this;
    }

    @Step("Проверяем сообщение об успехе")
    public ButtonsPage shouldHaveMessage(String expectedMessage) {
        $("#doubleClickMessage").shouldHave(text(expectedMessage));
        return this;
    }
}
