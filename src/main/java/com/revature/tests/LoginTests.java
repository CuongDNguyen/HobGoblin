package com.revature.tests;

import buildingMethods.AddBuildingMethods;
import locationMethods.AddLocationMethods;
import locationMethods.McCombLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LoginTests {

    static WebDriver wd;
    @BeforeSuite
    public void setup() {
        AddLocationMethods a = AddLocationMethods.getAddLocInstance();
        AddBuildingMethods b = AddBuildingMethods.getAddBldgInstance();
        File chrome = new File("src/main/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        McCombLogin.login(wd);
    }

}
