package core;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import utils.DriverOptions;

public class BaseTest {
    protected static WebDriver nav = null;

    @BeforeAll
    public static void projectSetup(){
        nav = DriverFactory.getDriver(DriverOptions.CHROME);
    }

    @BeforeEach
    public void setUp(){
        nav.get("https://www.selenium.dev/selenium/web/web-form.html");
    }

    @AfterAll
    public static void tearDown(){
        nav.quit();
    }
}
