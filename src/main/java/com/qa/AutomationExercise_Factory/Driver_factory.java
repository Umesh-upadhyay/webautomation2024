package com.qa.AutomationExercise_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.AutomationExercise.exceptions.Browser_exception;

import config.Config_Reader;

public class Driver_factory {

    WebDriver driver;
    Config_Reader reader;

    // Constructor to receive the Config_Reader instance
    public Driver_factory(Config_Reader reader) {
        this.reader = reader;  // Initialize reader with the passed instance
    }

    // Initialize WebDriver using Config_Reader
    public WebDriver initDriver() {
        // Fetch browser name from config file
        String browserName = reader.browser_Cfg().trim().toLowerCase();

        switch (browserName) {

            case "chrome":
                driver = new ChromeDriver();
                System.out.println("Chrome browser is successfully launched.");
                break;

            case "firefox":
                driver = new FirefoxDriver();
                System.out.println("Firefox browser is successfully launched.");
                break;

            case "edge":
                driver = new EdgeDriver();
                System.out.println("Edge browser is successfully launched.");
                break;

            default:
                System.out.println("Invalid browser in config file.");
                throw new Browser_exception("===INVALID BROWSER===");
        }

        // Maximize the browser window and set cookies
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        // Fetch URL from config file and open it
        String url = reader.url_Cfg();
        if (!url.isEmpty()) {
            driver.get(url);  // Navigate to the URL
        } else {
            System.out.println("URL is not provided in the config file.");
        }

        return driver;
    }
}