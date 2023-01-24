package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static driver.ThreadManager.getDriver;

public class WebformPage extends BasePage{
    static By indexLink = By.linkText("Return to index");
    static By submitButton = By.xpath("//*[@class='btn btn-outline-primary mt-3']");
    static By month = By.className("datepicker-switch");
    static By dropdown = By.name("my-select");
    static By datePickerDays = By.className("datepicker-days");
    static By dateInputBox = By.name("my-date");

    public static IndexPage clickIndexLink(){
        getDriver().findElement(indexLink).click();
        return new IndexPage();
    }

    public static WebElement getSubmitButton(){
        return getDriver().findElement(submitButton);
    }

    public static WebElement getDropDown(){
        return getDriver().findElement(dropdown);
    }


    public static List<String> getDropDownOptionsValueList(WebElement dropDown) {
        Select select = new Select(dropDown);
        List<WebElement> selectOptions = select.getOptions();
        List<String> optionText = new ArrayList<>();
        for (WebElement options :
                selectOptions) {
            optionText.add(options.getText());
        }
        return optionText;
    }

    public static void clickDatePicker(){
        getDriver().findElement(dateInputBox).click();
    }


    public static boolean isDatePickerPopupDisplayed() {
        return driverWait(5).until(ExpectedConditions.visibilityOfElementLocated(datePickerDays)).isDisplayed();
    }

    public static boolean idMonthInDatePickerDisplayed(){
        return driverWait(5).until(ExpectedConditions.visibilityOfElementLocated(month)).isDisplayed();
    }

    public static String getMonthValue(){
        return driverWait(5).until(ExpectedConditions.visibilityOfElementLocated(month)).getText();
    }
}
