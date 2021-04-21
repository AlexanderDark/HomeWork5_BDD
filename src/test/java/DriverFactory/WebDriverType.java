package DriverFactory;

public enum WebDriverType {
    FIREFOX("firefox"),
    CHROME("chrome");

    String wDT;
    WebDriverType (String wDT) {
        this.wDT = wDT;
    }

    public String getBrowserName() {
        return wDT;
    }

    //Возвращаем подходящий браузера, поиск регистронезависим
    public static WebDriverType findByName(String nameBrowser) {
        for (WebDriverType value: values()) {
            if (value.wDT.equals(nameBrowser.replace("'","").toLowerCase())) {
                return value;
            }
        }
        return CHROME;
    }
}
