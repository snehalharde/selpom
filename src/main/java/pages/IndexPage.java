package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static driver.ThreadManager.getDriver;

public class IndexPage extends BasePage{
    private static By link = By.xpath("//ul/li");

    public static List<WebElement> getLinkList(){
        return getDriver().findElements(link);
    }
}
