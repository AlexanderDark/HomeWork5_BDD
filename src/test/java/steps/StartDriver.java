package steps;

import DriverFactory.WebDriverFactory;
import DriverFactory.WebDriverType;
import cucumber.api.java.ru.Дано;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class StartDriver extends BasePage {


    public StartDriver(WebDriver driver) {
        super(driver);
    }

    @Дано("Я запускаю {driverName} драйвер")
    public void startDriver (WebDriverType driverName) {
        WebDriverFactory.createDriver(driverName);
    }
}
