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

    public static WebElement forgotPassword(WebDriver wd){
        element = wd.findElement(By.id(PropUtil.getVal("forgotPassword")));
        return element;
    }

    public static WebElement forgotPasswordHeader(WebDriver wd){
        element = wd.findElement(By.id(PropUtil.getVal("forgotPasswordHead")));
        return element;
    }



    @FindBy(xpath="//a[@href='mercurywelcome.php']")
    public WebElement homeLink;
}
