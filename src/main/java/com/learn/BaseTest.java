package com.learn;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();

    @BeforeMethod
    @Parameters("browser")
    public void setupTest(String browser) throws MalformedURLException {
    	ChromeOptions ops = new ChromeOptions();
    	ops.setCapability("browserName", browser);
    	ops.setCapability("enableVNC", true);
      //  DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setCapability("browserName", browser);
//        capabilities.setCapability("enableVNC", true);

        driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), ops));
    	
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    @AfterMethod
    public void tearDown() {
        getDriver().quit();
    }

    @AfterClass
    void terminate() {
        driver.remove();
    }
}
