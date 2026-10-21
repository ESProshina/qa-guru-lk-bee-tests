package guru.qa.bee.tests;

import guru.qa.bee.pages.ButtonsPage;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Owner("ESProshina")
@Feature("Управление услугами")
public class ButtonsTests extends TestBase {

    private final ButtonsPage buttonsPage = new ButtonsPage();

    @Test
    @Story("Подтверждение смены тарифа")
    @DisplayName("Успешное подтверждение действия двойным кликом")
    @Severity(SeverityLevel.NORMAL)
    void doubleClickTest() {
        buttonsPage
                .openPage()
                .doubleClick()
                .shouldHaveMessage("You have done a double click");
    }
}