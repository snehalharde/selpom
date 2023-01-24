package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;

import static driver.ThreadManager.getDriver;

public class utilities {



    public static Month getMonth(){
        return getLocalDate().getMonth();

    }

    public static LocalDate getLocalDate() {
        LocalDate date = LocalDate.now();
        return date;
    }

    public static int getYear(){
        return getLocalDate().getYear();
    }
}
