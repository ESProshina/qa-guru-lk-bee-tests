package guru.qa.bee.tests;

import guru.qa.bee.pages.MainPage;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Owner("ESProshina")
@Feature("Smoke")
public class FirstTest extends TestBase {

    private final MainPage mainPage = new MainPage();

    @Test
    @Story("Открытие главной страницы")
    @DisplayName("Главная страница demoqa открывается, title содержит ToolsQA")
    @Severity(SeverityLevel.CRITICAL)
    void mainPageOpens() {
        mainPage
                .openPage()
                .shouldHaveTitle("ToolsQA")
                .shouldBeLoaded();
    }
}