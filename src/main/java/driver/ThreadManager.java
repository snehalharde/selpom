package driver;

import org.openqa.selenium.WebDriver;

public final class ThreadManager {

    private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();


    private ThreadManager() {
    }

    public static WebDriver getDriver() {

            return driverThreadLocal.get();

    }

    public static void setDriver(WebDriver driver) {
        driverThreadLocal.set(driver);
    }
}
