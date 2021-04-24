package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

@Component
public class MainPage extends BasePage {
    private static final String URL = "https://otus.ru";
    private final By auth = By.cssSelector(".header2__auth.js-open-modal");
    private final By name = By.cssSelector("input[type='text']");
    private final By pass = By.cssSelector("input[type='password']");
    private final By submit = By.xpath("//*[contains(text(),'Войти')]");
    private final By userMenu = By.cssSelector(".header2-menu__item-text__username");
    private final By appForm = By.cssSelector("button.course-header2__button");

        //Переход на страницу отуса
    public MainPage openPage () {
        super.driver.get(URL);
        return this;
    }
    //Переход на форму аутентификации
    public MainPage auth() {
        super.driver.findElement(auth).click();
        return this;
    }
    //Заполнить форму аутентификации
    public void fillAuthForm(String userName, String password) {
        (new WebDriverWait(super.driver, 5))
                .until(ExpectedConditions.elementToBeClickable(submit));
        super.driver.findElement(name).sendKeys(userName);
        super.driver.findElement(pass).sendKeys(password);
        super.driver.findElement(submit).click();
    }
    public MainPage putAppForm () {
        super.driver.findElement(appForm).click();
        return this;
    }

    //Проверить успешный вход
    public boolean checkLogin() {
        return !super.driver.findElements(userMenu).isEmpty();
    }
}
