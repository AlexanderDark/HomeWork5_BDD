package steps;

import DriverFactory.WebDriverFactory;
import DriverFactory.WebDriverType;
import common.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public WebDriver driver;
    public Logger logger = BaseClass.getLogger();

    @Before(value="@TestUI")
    public void SetupDriver() {
        //Получаем имя браузера из параметра -Dbrowser командной строки, если не указан то по умолчанию chrome
        String browser = Optional.ofNullable(System.getProperty("browser")).orElse("chrome");

        //Получаем имя драйвера из класса Enum
        WebDriverType wDT = WebDriverType.findByName(browser);

        //Создаём вебдрайвер
        driver = WebDriverFactory.createDriver(wDT);
        //Устанавливаем максимальный размер окна
        driver.manage().window().maximize();
        logger.info("Запущен драйвер " + wDT.getBrowserName());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        BaseClass.setDriver(driver);
    }

    @After(value="@TestUI")
    public void setDown() {
        if (driver != null) {
            driver.quit();
            logger.info("Вебдрайвер выключен");
        } else {
            logger.error("Вебдрайвер не найден");
        }
    }
}
