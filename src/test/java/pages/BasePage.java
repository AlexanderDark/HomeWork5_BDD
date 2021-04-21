package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

@Component
public class BasePage {
    //Объявление веб-драйвера
    protected WebDriver driver;

    //Конструктор базового класса
    public void initDriver (WebDriver driver) {this.driver = driver;}

    //Открытие страницы
    public void openURL(String url) {
        driver.get(url);
    }

    //Получить заголовок страницы
    public String getTitle() {
        return driver.getTitle();
    }

    //Присутствие элемента в DOM
    public boolean elementIsPresent(By selector) {
        return !driver.findElements(selector).isEmpty();
    }

    //Видимость элемента
    public boolean elementIsDisplayed(By selector) {
        return driver.findElement(selector).isDisplayed();
    }
}
