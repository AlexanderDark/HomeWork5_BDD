package steps;

import common.BaseClass;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.То;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import pages.MainPage;

import java.util.Optional;

public class Steps extends BaseStep{
    private Logger logger = LogManager.getLogger(Steps.class);
        @Value("${correctLogin}")
        private String correctLogin;

        @Value("${correctPassword}")
        String correctPassword;

        @Autowired
        private MainPage mainPage;

        String login;
        String pass;
        WebDriver driver = BaseClass.getDriver();

        @Дано("я запускаю браузер")
        public void loginPage() {
            mainPage.initDriver(driver);
        }

        @То("я осуществляю вход на сайт")
        public void checkLogin() {
            Assert.assertTrue(mainPage.checkLogin());
        }

        @То("я получаю предупреждение")
        public void isAlertPresent() {
            Assert.assertTrue(mainPage.elementIsDisplayed(By.xpath("//div[contains(text(),'не существует')]")));
        }

        @И("я ввожу корректные учётные данные")
        public void setUserDefinedCreds() {
            setCreds();
            System.out.println(login + "-" + pass);
        }

        @Когда("я ввожу логин и пароль")
        public void fillAuthForm() {
            mainPage.openPage()
                    .auth()
                    .fillAuthForm(login, pass);
        }

        @И("я ввожу логин {string}")
        public void setLogin(String login) {
            this.login = login;
        }

        @И("я ввожу пароль {string}")
        public void setPass(String pass) {
            this.pass = pass;
        }

        @Когда("я перехожу по прямой ссылке {string}")
        public void openUrl(String url) {
            mainPage.openURL(url);
        }

        @То("происходит успешный переход в раздел {string}")
        public void checkTitle(String title) {

            logger.info(driver.getTitle());
            Assert.assertTrue(mainPage.getTitle().contains(title));
        }

        @Когда("я нажимаю на кнопку Оставить заявку")
        public void putApplicationForm () {
            mainPage.putAppForm();
    }

        public void setCreds() {
            //Получаем имя пользователя из параметра -Dlogin командной строки
            login = Optional.ofNullable(System.getProperty("login")).orElse(correctLogin);

            //Получаем пароль из параметра -Dpassword командной строки
            pass = Optional.ofNullable(System.getProperty("password")).orElse(correctPassword);
        }
    }
