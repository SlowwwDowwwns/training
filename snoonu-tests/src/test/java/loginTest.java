import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class loginTest {

  /*  @Test
    static void setUp() {
        Configuration.browser = "chrome"; // установка браузера Chrome
        Configuration.startMaximized = true; // открытие окна браузера в максимальном размере
    }*/

    @Test
    void loginWithOTP() {
        // открытие страницы авторизации
        open("https://snoonu.com");

        // поиск поля для ввода номера телефона и ввод номера
       /* $("PhoneForm_form__XAF8l").setValue("21343208");*/
/*        // нажатие на кнопку отправки OTP-кода
        $("[type='submit']").click();

        // поиск поля для ввода OTP-кода и ввод кода
        $("[name='otp']").waitUntil(visible, 5000).setValue("123456");

        // нажатие на кнопку входа
        $("[type='submit']").click();

        // проверка того, что мы успешно авторизовались и видим какую-то информацию на странице
        $(".welcome-message").shouldHave(visible);*/
    }
}