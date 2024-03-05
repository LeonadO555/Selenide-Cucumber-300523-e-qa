package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

import static com.codeborne.selenide.Selenide.*;

public class Hooks {
    @Before
    public void setUp(){
        System.out.println("=====Before method started=====");
        WebDriverManager.chromedriver().setup();
        System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
        open("https://www.saucedemo.com/");
        clearBrowserCookies();
        clearBrowserLocalStorage();
        System.out.println("=====Before method finished=====");
    }

    @After
    public void tearDown(){
        closeWebDriver();
    }
}
