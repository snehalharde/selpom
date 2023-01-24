package driver;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static driver.ThreadManager.*;

public final class Driver {
    private Driver() {
    }

    public static void initDriver(){
        if (getDriver() == null) {
            WebDriver driver = DriverFactory.getDriver("chrome");
            setDriver(driver);
            getDriver().get(ConfigReader.getConfig().url());
            getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

    }

    public static void quitDriver(){
        if (getDriver() != null) {
            getDriver().quit();
            setDriver(null);
        }
    }
}
