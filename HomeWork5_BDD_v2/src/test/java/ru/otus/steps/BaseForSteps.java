package ru.otus.steps;

import org.openqa.selenium.WebDriver;
import ru.otus.DriverFactory.WebDriverFactory;
import ru.otus.DriverFactory.WebDriverType;

public class BaseForSteps {
    WebDriver driver = WebDriverFactory.createDriver(WebDriverType.CHROME);
//    public void createWebDriver () {
//        driver = WebDriverFactory.createDriver(WebDriverType.CHROME);
//
//    }
}
