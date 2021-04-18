package steps;

import cucumber.api.java.ru.Дано;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.MainPage;

public class OpenPage extends BasePage {
    public OpenPage(WebDriver driver) {
        super(driver);
    }

    @Дано("Я открываю страницу {page}")
    public void iOpenPage(String page) {
        MainPage main = new MainPage(driver);
        main.openPage(page);
    }
    @Дано("Я пишу текст")
    public void iPrint () {
        System.out.println("123123123123 NTRCN NEN!!!!");
    }
}
