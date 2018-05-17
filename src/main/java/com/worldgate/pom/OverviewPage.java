package com.worldgate.pom;

import com.worldgate.util.PropUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class OverviewPage {


    private static WebElement element;

    public static WebElement user(WebDriver wd) {
        element = wd.findElement(By.xpath(PropUtil.getVal("userName")));
        return element;
    }

    public static List<WebElement> rows(WebDriver wd) {
        return wd.findElements(By.xpath(PropUtil.getVal("rowTable")));
    }

    public static WebElement nameColumn(WebDriver wd) {
        element = wd.findElement(By.cssSelector(PropUtil.getVal("nameColumn")));
        return element;
    }

    public static WebElement startDateColumn(WebDriver wd) {
        element = wd.findElement(By.cssSelector(PropUtil.getVal("startDateColumn")));
        return element;
    }

    public static Date getStartDate(WebElement we) throws ParseException {
        SimpleDateFormat currDate = new SimpleDateFormat("MMM dd, yyyy");
        Date temp;
        try {
//            temp = currDate.parse(we.findElement(By.xpath(PropUtil.getVal("//table/tbody/tr[1]/td[1]"))).
//                    getText().replaceAll("\\.", ""));
            temp = currDate.parse(String.valueOf(we.findElement(By.cssSelector("tr.ng-scope:nth-child(1) > td:nth-child(7)"))));
        } catch (ParseException | IllegalArgumentException e) {
            return currDate.parse("JAN 01, 1000");
        }
        return temp;
    }
}
