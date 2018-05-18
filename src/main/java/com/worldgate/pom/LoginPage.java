package com.worldgate.pom;

import com.worldgate.util.PropUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    private static WebElement element;

    public static WebElement user(WebDriver wd) {
        element = wd.findElement(By.xpath(PropUtil.getVal("userName")));
        return element;
    }

    public static WebElement pass(WebDriver wd) {
        element = wd.findElement(By.xpath(PropUtil.getVal("passWord")));
        return element;
    }

    public static WebElement loginButton(WebDriver wd) {
        element = wd.findElement(By.xpath(PropUtil.getVal("loginButton")));
        return element;
    }

    public static WebElement forgotPassword(WebDriver wd) {
        element = wd.findElement(By.id(PropUtil.getVal("forgotPassword")));
        return element;
    }

    public static WebElement forgotPasswordHeader(WebDriver wd) {
        element = wd.findElement(By.id(PropUtil.getVal("forgotPasswordHead")));
        return element;
    }

    public static WebElement openOverview(WebDriver wd) {
        element = wd.findElement(By.cssSelector(PropUtil.getVal("overviewButton")));
        return element;
    }

    public static WebElement openBatches(WebDriver wd) {
        element = wd.findElement(By.cssSelector(PropUtil.getVal("batchesButton")));
        return element;
    }

    public static WebElement openLocations(WebDriver wd) {
        element = wd.findElement(By.cssSelector(PropUtil.getVal("locationsButton")));
        return element;
    }

    public static WebElement openCurricula(WebDriver wd) {
        element = wd.findElement(By.cssSelector(PropUtil.getVal("curriculaButton")));
        return element;
    }

    public static WebElement openTrainers(WebDriver wd) {
        element = wd.findElement(By.cssSelector(PropUtil.getVal("trainersButton")));
        return element;
    }

    public static WebElement openProfile(WebDriver wd) {
        element = wd.findElement(By.cssSelector(PropUtil.getVal("profileButton")));
        return element;
    }

    public static WebElement openReports(WebDriver wd) {
        element = wd.findElement(By.cssSelector(PropUtil.getVal("reportsButton")));
        return element;
    }

    public static WebElement openSettings(WebDriver wd) {
        element = wd.findElement(By.cssSelector(PropUtil.getVal("settingsButton")));
        return element;
    }
    public static WebElement titleOverview(WebDriver wd) {
        element = wd.findElement(By.cssSelector(PropUtil.getVal("overviewTitle")));
        return element;
    }

    public static WebElement titleBatchesTrainer(WebDriver wd) {
        element = wd.findElement(By.cssSelector(PropUtil.getVal("batchesTitleTrainer")));
        return element;
    }

    public static WebElement titleBatchesVP(WebDriver wd) {
        element = wd.findElement(By.cssSelector(PropUtil.getVal("batchesTitleVP")));
        return element;
    }

    public static WebElement titleLocations(WebDriver wd) {
        element = wd.findElement(By.cssSelector(PropUtil.getVal("locationsTitle")));
        return element;
    }

    public static WebElement titleCurricula(WebDriver wd) {
        element = wd.findElement(By.cssSelector(PropUtil.getVal("curriculaTitle")));
        return element;
    }

    public static WebElement titleTrainers(WebDriver wd) {
        element = wd.findElement(By.cssSelector(PropUtil.getVal("trainersTitle")));
        return element;
    }

    public static WebElement titleProfile(WebDriver wd) {
        element = wd.findElement(By.cssSelector(PropUtil.getVal("profileTitle")));
        return element;
    }
    public static WebElement titleReports(WebDriver wd) {
        element = wd.findElement(By.cssSelector(PropUtil.getVal("reportsTitle")));
        return element;
    }

    public static WebElement titleSettings(WebDriver wd) {
        element = wd.findElement(By.cssSelector(PropUtil.getVal("settingsTitle")));
        return element;
    }

    @FindBy(xpath = "//a[@href='mercurywelcome.php']")
    public WebElement homeLink;
}
