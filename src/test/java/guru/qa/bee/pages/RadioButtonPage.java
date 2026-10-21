package guru.qa.bee.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RadioButtonPage {

    @Step("Открываем раздел 'Смена тарифа'")
    public RadioButtonPage openPage() {
        open("/radio-button");
        return this;
    }

    @Step("Выбираем тариф 'BEE CONTACT LITE'")
    public RadioButtonPage selectBeeContactLite() {
        // Кликаем по кнопке Impressive (так как это демо-сайт)
        $("label[for='impressiveRadio']").click();
        return this;
    }

    @Step("Проверяем, что тариф 'BEE CONTACT LITE' успешно применен")
    public RadioButtonPage shouldHaveTariffSelected() {
        // Проверяем, что сайт отобразил успешный выбор (на сайте это слово Impressive)
        $(".text-success").shouldHave(text("Impressive"));
        return this;
    }
}