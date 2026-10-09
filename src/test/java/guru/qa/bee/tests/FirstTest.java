package guru.qa.bee.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;

@Owner("ESProshina")
@Feature("Smoke")
public class FirstTest extends TestBase {

    @Test
    @Story("Открытие главной страницы")
    @DisplayName("Главная страница demoqa открывается, title содержит ToolsQA")
    @Severity(SeverityLevel.CRITICAL)
    void mainPageOpens() {
        open("/");
        // Проверяем заголовок страницы через title() — это надёжнее
        title().contains("ToolsQA");
        // И что тело страницы вообще отрисовалось
        $("body").shouldBe(visible);
    }
}