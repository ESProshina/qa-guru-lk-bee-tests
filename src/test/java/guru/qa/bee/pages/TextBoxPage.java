package guru.qa.bee.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage {

    private final SelenideElement userNameInput = $("#userName");
    private final SelenideElement userEmailInput = $("#userEmail");
    private final SelenideElement currentAddressInput = $("#currentAddress");
    private final SelenideElement permanentAddressInput = $("#permanentAddress");
    private final SelenideElement submitButton = $("#submit");
    private final SelenideElement outputBox = $("#output");

    @Step("Открываем страницу Text Box")
    public TextBoxPage openPage() {
        open("/text-box");
        return this;
    }

    @Step("Вводим имя пользователя: {name}")
    public TextBoxPage typeUserName(String name) {
        userNameInput.setValue(name);
        return this;
    }

    @Step("Вводим email: {email}")
    public TextBoxPage typeUserEmail(String email) {
        userEmailInput.setValue(email);
        return this;
    }

    @Step("Вводим текущий адрес: {address}")
    public TextBoxPage typeCurrentAddress(String address) {
        currentAddressInput.setValue(address);
        return this;
    }

    @Step("Вводим постоянный адрес: {address}")
    public TextBoxPage typePermanentAddress(String address) {
        permanentAddressInput.setValue(address);
        return this;
    }

    @Step("Нажимаем кнопку Submit")
    public TextBoxPage submit() {
        submitButton.click();
        return this;
    }

    @Step("Проверяем, что в результате отображается имя: {name}")
    public TextBoxPage shouldHaveOutputName(String name) {
        outputBox.shouldHave(text(name));
        return this;
    }
}
