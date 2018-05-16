package com.worldgate.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MasterDriver {

    public static WebDriver driver;

//    public static void main(String[] args) throws IOException, InterruptedException {
//        getDriver();
//        loginTrainer();
//        logout();
//    }

    public static WebDriver getDriver() {

        if (driver == null) {
            ChromeOptions options = new ChromeOptions().addArguments(PropUtil.getVal("chromeUserData"));
            File chrome = new File("src/main/resources/chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
            driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void logout(WebDriver driver) {

        String tempxpath = PropUtil.getVal("logoutButton");
        driver.findElement(By.xpath(tempxpath)).click();
        driver.close();
    }

}
