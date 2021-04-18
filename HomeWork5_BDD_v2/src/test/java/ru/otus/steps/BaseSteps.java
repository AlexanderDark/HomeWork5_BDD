package ru.otus.steps;

import io.cucumber.java.ru.Дано;
import org.openqa.selenium.WebDriver;
import ru.otus.DriverFactory.WebDriverFactory;
import ru.otus.DriverFactory.WebDriverType;
import ru.otus.Pages.BasePage;
import ru.otus.Pages.MainPage;

public class BaseSteps {
    public MainPage mainPage;
    public WebDriverFactory wdf;

    @Дано("я печатаю текст {string}")
    public void atinfoIsOpen(String string) {
        System.out.println(string);
    }


   @Дано("я открываю страницу отуса")
    public void openPage () {
       mainPage.openURL();
    }
    @Дано("я поднимаю драйвер")
    public void getDriver () {
        mainPage.mainSwtUp();

    }
/*    @Дано("я закрываю драйвер")
    public void closeDriver () {
        WebDriverFactory.closeDriver(driver);
    }*/
}
