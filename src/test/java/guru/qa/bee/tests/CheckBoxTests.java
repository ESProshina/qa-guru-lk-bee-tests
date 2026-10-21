package guru.qa.bee.tests;

import guru.qa.bee.pages.CheckBoxPage;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Owner("ESProshina")
@Feature("Check Box")
public class CheckBoxTests extends TestBase {

    private final CheckBoxPage checkBoxPage = new CheckBoxPage();

    @Test
    @Story("Выбор чекбоксов")
    @DisplayName("Успешный выбор чекбокса Home")
    @Severity(SeverityLevel.NORMAL)
    void selectHomeCheckboxTest() {
        checkBoxPage
                .openPage()
                .selectHomeCheckbox()
                .shouldHaveResult("desktop");
    }
}
