package guru.qa.bee.tests;

import guru.qa.bee.pages.TextBoxPage;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Owner("ESProshina")
@Feature("Text Box")
public class TextBoxTest extends TestBase {

    private final TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    @Story("Заполнение формы Text Box")
    @DisplayName("Успешное заполнение всех полей Text Box")
    @Severity(SeverityLevel.NORMAL)
    void fillAllFieldsTest() {
        textBoxPage
                .openPage()
                .typeUserName("Елена Прошина")
                .typeUserEmail("elena@example.com")
                .typeCurrentAddress("г. Москва, ул. Тверская, д. 1")
                .typePermanentAddress("г. Санкт-Петербург, ул. Невский проспект, д. 10")
                .submit()
                .shouldHaveOutputName("Елена Прошина");
    }
}
