package tests;

import driver.ThreadManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IndexPage;
import pages.WebformPage;

import java.time.Duration;
import java.util.List;

import static pages.BasePage.waiterVisible;
import static pages.IndexPage.getLinkList;

public class IndexPageTests extends BaseTest {

    @Test
    public void validateLinkCount(){
        WebformPage.clickIndexLink();
        List<WebElement> link = getLinkList();
        List<WebElement> links = waiterVisible(link);

        Assert.assertEquals(links.size(), 413);
    }


}
