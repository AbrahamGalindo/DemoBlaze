package Pages;

import Hooks.InitialHook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage extends InitialHook {
    public WebElement waitForElement(By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public WebElement waitForElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement findElement(String text) {
        waitForElement(By.xpath("//*[contains(text(),'" + text + "')]"));
        return driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]"));
    }

    public WebElement waitForElementClickable(By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public List<WebElement> findElements(String text) {
        waitForElement(By.xpath("//*[contains(text(),'" + text + "')]"));
        return driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]"));
    }

    public List<WebElement> findElements(By element) {
        waitForElement(element);
        return driver.findElements(element);
    }

    public void click(By element) {
        waitForElement(element).click();
    }

    public void click(WebElement element) {
        waitForElement(element).click();
    }

    public void click(String text) {
        waitForElement(By.xpath("//*[text()='" + text + "']")).click();
    }

    public void sendKeys(By element, String text) {
        clear(element);
        waitForElement(element).sendKeys(text);
    }

    public void clear(By element) {
        waitForElement(element).clear();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public boolean hasElement(String element) {
        try {
            return findElement(element).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void switchFrame(String title) {
        WebElement iframe_element = driver.findElement(By.xpath("//iframe[@title='" + title + "']"));
        driver.switchTo().frame(iframe_element);
    }


    public void switchToMain(WebDriver driver) {
        driver.switchTo().defaultContent();
    }
}
