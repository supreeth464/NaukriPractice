package com.practise1.intl.QA.selenium.Hooks;

import com.practise1.intl.QA.selenium.Pom.practicePage;
import com.practise1.intl.QA.selenium.core.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class hooks {
    private static WebDriver driver;
    @Before
    public void setup() {
        DriverManager.initializeDriver();
        driver = DriverManager.getDriver();
        driver.get("https://www.naukri.com/nlogin/login");
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }
    public static WebDriver getDriver() {
        return driver;
    }
}
