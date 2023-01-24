package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.*;

import static driver.ThreadManager.getDriver;
import static pages.WebformPage.*;
import static utils.utilities.getMonth;
import static utils.utilities.getYear;

public class WebFormPageTests extends BaseTest{

    @Test
    public void addInputsInBoxes(){
        WebElement submitButton = getSubmitButton();
        waiterClickable(submitButton);
        Assert.assertEquals(getDriver().getTitle(), "Web form");
    }



    @Test(description = "dropdown options")
    public void validateDropDownList(){
        List<String> ddOptions = new ArrayList<>(Arrays.asList("Open this select menu", "One", "Two", "Three"));
        WebElement dropDown = getDropDown();
        List<String> dropDownListValues = getDropDownOptionsValueList(dropDown);
        Assert.assertTrue(dropDownListValues.containsAll(ddOptions));
    }



    @Test(description = "Date picker")
    public void validateDatePicker(){
        clickDatePicker();
        boolean datePickerPopup = isDatePickerPopupDisplayed();
        Assert.assertTrue(datePickerPopup);
        Assert.assertTrue(idMonthInDatePickerDisplayed());
        Assert.assertEquals(getMonthValue().toUpperCase(), getMonth() + " " + getYear());
    }

}
