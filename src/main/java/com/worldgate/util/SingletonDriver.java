package com.worldgate.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class SingletonDriver {

    public static WebDriver driver;

    public static WebDriver getDriver() {


        if (driver == null) {
            File chrome = new File("src/main/resources/chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());

            driver = new ChromeDriver();

        }
        return driver;
    }

}
