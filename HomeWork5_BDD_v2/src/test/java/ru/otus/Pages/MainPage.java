package ru.otus.Pages;

import org.openqa.selenium.WebDriver;
import ru.otus.DriverFactory.WebDriverFactory;
import ru.otus.DriverFactory.WebDriverType;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }
    public void openURL () {
        driver.get("https://otus.ru");
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
