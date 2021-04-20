package ru.otus.Pages;

import org.openqa.selenium.WebDriver;
import ru.otus.DriverFactory.WebDriverFactory;
import ru.otus.DriverFactory.WebDriverType;

public class MainPage extends BasePage {
    private static final String URL = "https://otus.ru";
    public MainPage(WebDriver driver) {
        super(driver);
    }
    public MainPage open() {

        driver.get(URL);
        return this;
    }
    public void mainSwtUp () {
        WebDriverType wDT;
        wDT = WebDriverType.CHROME;
        WebDriverFactory factory = new WebDriverFactory();
        if (driver == null) {
            driver = factory.createDriver(wDT);
            driver.manage().window().maximize();}
        //logger.info("Драйвер поднят!");
    }
}
