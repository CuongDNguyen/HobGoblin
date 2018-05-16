package com.worldgate.locationMethods;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BuildingMethods {
	private static Properties prop = new Properties();
	private static BuildingMethods a = null;

	private BuildingMethods() {
		super();
		InputStream locProps = BuildingMethods.class.getClassLoader()
				.getResourceAsStream("location.properties");
		try {
			prop.load(locProps);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static BuildingMethods getAddBldgInstance() {
		if(a==null) {
			a = new BuildingMethods();
		}
		return a;
	}
	
	public static int addValidBuilding(WebDriver wd) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Random gen = new Random();
		int g = gen.nextInt(5000);
		if(wd.getCurrentUrl().contains("location")) {
			WebElement checkbox = wd.findElement(By.xpath(prop.getProperty("Checkbox")));
			WebElement addBldg = wd.findElement(By.id(prop.getProperty("addBldg")));
			
			Actions actions = new Actions(wd);
			
			actions.moveToElement(checkbox).click().perform();
			actions.moveToElement(addBldg).click().perform();
			
			
			WebElement name = wd.findElement(By.xpath(prop.getProperty("BldgName")));
			name.sendKeys("Test Building " + g);
			
			WebElement save = wd.findElement(By.xpath(prop.getProperty("BldgSave")));
			save.click();
	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			return g;
		}
		else {
			return 0;
		}
	}
	
	public static boolean addInvalidBuilding(WebDriver wd) {
		if(wd.getCurrentUrl().contains("location")) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement checkbox = wd.findElement(By.xpath(prop.getProperty("Checkbox")));
			WebElement addBldg = wd.findElement(By.id(prop.getProperty("addBldg")));
			
			Actions actions = new Actions(wd);
			
			actions.moveToElement(checkbox).click().perform();
			actions.moveToElement(addBldg).click().perform();
			WebElement save = wd.findElement(By.xpath(prop.getProperty("BldgSave")));
			save.click();
			WebElement name = wd.findElement(By.xpath(prop.getProperty("BldgName")));
			name.sendKeys(Keys.ESCAPE);
			return wd.getPageSource().contains("No Such Building");
		}
		else {
			return false;
		}

	}
	
	public static boolean readdBuilding(WebDriver wd) {
		if(wd.getCurrentUrl().contains("location")) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			wd.findElement(By.id(prop.getProperty("addBldg"))).click();
			
			WebElement name = wd.findElement(By.xpath(prop.getProperty("BldgName")));
			name.sendKeys("Used Building");
			
			WebElement save = wd.findElement(By.xpath(prop.getProperty("BldgSave")));
			save.click();
	
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			
			return wd.getPageSource().contains("Used Building ");
		}
		else {
			return false;
		}
	}
}
