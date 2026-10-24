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
        // Взаимодействие с UI-элементом, который на сайте называется Impressive
        $("label[for='impressiveRadio']").click();
        return this;
    }


    @Step("Проверяем, что выбранный тариф отображается как: {expectedTariff}")
    public RadioButtonPage shouldHaveSelectedTariff(String expectedTariff) {
        $(".text-success").shouldHave(text(expectedTariff));
        return this;
    }
}