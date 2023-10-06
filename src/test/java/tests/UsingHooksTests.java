package tests;

import core.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsingHooksTests extends BaseTest {
    @Test
    public void pageTitleShouldBeWebForm(){
        nav.get("https://www.selenium.dev/selenium/web/web-form.html");

        String title = nav.getTitle();
        assertEquals("Web form", title);
    }
}
