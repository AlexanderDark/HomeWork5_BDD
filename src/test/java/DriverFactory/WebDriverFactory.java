package DriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    protected static WebDriver driver;
    public static WebDriver createDriver(WebDriverType wdType) {
        switch (wdType) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
        return driver;
    }
}
