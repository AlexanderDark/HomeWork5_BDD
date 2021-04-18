package pages;

import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }
    public MainPage openPage (String string) {
        driver.get("https://otus.ru");
        return this;
    }
}
