package tests;

import config.FrameworkConfig;
import driver.Driver;
import driver.ThreadManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import static driver.Driver.initDriver;
import static driver.Driver.quitDriver;

public class BaseTest {

    @BeforeMethod
    public void setup(){
        initDriver();
    }

    @AfterMethod
    public void Cleanup(){
       quitDriver();
    }
}
