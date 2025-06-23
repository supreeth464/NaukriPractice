package com.practise1.intl.QA.selenium.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static WebDriver driver;

    public static void initializeDriver() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();

            // ✅ Detect GitHub Actions environment
            boolean isCI = System.getenv("GITHUB_ACTIONS") != null;

            if (isCI) {
                // ✅ Headless for GitHub Actions
                options.addArguments("--headless=new");
                options.addArguments("--disable-gpu");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
            } else {
                // ✅ Path for local Windows system
                System.setProperty("webdriver.chrome.driver", "C:/Users/Supreeth.R/Desktop/TP Project/chromedriver.exe");
            }

            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}