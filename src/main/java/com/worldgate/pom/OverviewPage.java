package com.worldgate.pom;

import com.worldgate.util.PropUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverviewPage {


    private static WebElement element;

    public static WebElement user(WebDriver wd) {
        element = wd.findElement(By.xpath(PropUtil.getVal("userName")));
        return element;
    }



}
