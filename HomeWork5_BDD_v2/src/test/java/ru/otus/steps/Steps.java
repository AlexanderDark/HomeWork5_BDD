package ru.otus.steps;

import io.cucumber.java.ru.Дано;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.otus.DriverFactory.WebDriverFactory;
import ru.otus.DriverFactory.WebDriverType;
import ru.otus.Pages.BasePage;
import ru.otus.Pages.MainPage;

public class Steps extends BaseForSteps {
MainPage mainPage = new MainPage(driver);
    @Дано("я печатаю текст {string}")
    public void atinfoIsOpen(String string) {
        System.out.println(string);
    }


   @Дано("я открываю страницу отуса")
    public void openPage () {
        mainPage.open();
    }

    @Дано("^я поднимаю драйвер$")
    public WebDriver getDriver () {
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
            driver.manage().window().maximize();
            return driver;
        }
    }
/*    @Дано("я закрываю драйвер")
    public void closeDriver () {
        WebDriverFactory.closeDriver(driver);
    }*/

