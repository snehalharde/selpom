package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static driver.ThreadManager.getDriver;

public class BasePage {

    public static WebDriverWait driverWait(int seconds) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(seconds));
    }

    public static WebElement waiterClickable(WebElement webElement) {
        return driverWait(10).until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public static List<WebElement> waiterVisible(List<WebElement> webElement) {
        return driverWait(10).until(ExpectedConditions.visibilityOfAllElements(webElement));
    }
}
