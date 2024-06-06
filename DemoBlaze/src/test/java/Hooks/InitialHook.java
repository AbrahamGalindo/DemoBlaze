package Hooks;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitialHook {

    public static WebDriver driver;
    public static String _userName;

    @Before
    public void createWebDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
    }

    @After
    public void clearDriver() {
        driver.quit();
    }
}
