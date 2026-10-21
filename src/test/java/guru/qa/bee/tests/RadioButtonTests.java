package guru.qa.bee.tests;

import guru.qa.bee.pages.RadioButtonPage;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Owner("ESProshina")
@Feature("Тарифы")
public class RadioButtonTests extends TestBase {

    private final RadioButtonPage radioButtonPage = new RadioButtonPage();

    @Test
    @Story("Выбор тарифа")
    @DisplayName("Успешный переход на тариф BEE CONTACT LITE")
    @Severity(SeverityLevel.NORMAL)
    void selectTariffTest() {
        radioButtonPage
                .openPage()
                .selectBeeContactLite()
                .shouldHaveTariffSelected();
    }
}