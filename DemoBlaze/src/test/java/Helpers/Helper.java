package Helpers;

import org.openqa.selenium.WebElement;

import java.util.List;

public class Helper {
    public void wait(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public int generateRandomNumber(int start, int end) {
        return (int) (Math.random() * end) + start;
    }

    public int getObjetcsNumber(List<WebElement> elements) {
        return elements.size();
    }
}
