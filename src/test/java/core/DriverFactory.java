package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.DriverOptions;

import java.time.Duration;

public class DriverFactory {
    public static WebDriver getDriver(DriverOptions opt){
        WebDriver browser;

        switch (opt){
            case FIREFOX -> {
                browser =  new FirefoxDriver();
            }
            default -> {
                browser =  new ChromeDriver();
            }
        }

        browser.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        return browser;
    }
}
