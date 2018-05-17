package com.worldgate.locationMethods;

import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocationMethods {
	private static Properties prop = new Properties();
	private static LocationMethods a = null;

	private LocationMethods() {
		super();
		InputStream locProps = LocationMethods.class.getClassLoader()
				.getResourceAsStream("location.properties");
		try {
			prop.load(locProps);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static LocationMethods getAddLocInstance() {
		if(a==null) {
			a = new LocationMethods();
		}
		return a;
	}
	
	public static int addValidLocation(WebDriver wd) {
		if(wd.getCurrentUrl().contains("location")) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Random gen = new Random();
			int g = gen.nextInt(5000);
			wd.findElement(By.id(prop.getProperty("addLocationButton"))).click();
			WebElement name=wd.findElement(By.xpath(prop.getProperty("LocName")));
			name.sendKeys("Unused Test Location " + g);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement city = wd.findElement(By.xpath(prop.getProperty("LocCity")));
			city.sendKeys("Worldgate Test City " + g);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement state = wd.findElement(By.xpath(prop.getProperty("LocState")));
			state.sendKeys("k");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement save = wd.findElement(By.xpath(prop.getProperty("LocSave")));
			save.click();

			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			return g;
		}
		else {
			return 0;
		}
	}
	
	public static boolean addInvalidLocation(WebDriver wd) {
		if(wd.getCurrentUrl().contains("location")) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			wd.findElement(By.id(prop.getProperty("addLocationButton"))).click();
			
			WebElement city = wd.findElement(By.xpath(prop.getProperty("LocCity")));
			city.sendKeys("Fail Case City");
			WebElement state = wd.findElement(By.xpath(prop.getProperty("LocState")));
			state.sendKeys("k");
			WebElement save = wd.findElement(By.xpath(prop.getProperty("LocSave")));
			save.click();
			state.sendKeys(Keys.ESCAPE);
			return wd.getPageSource().contains("Fail Case City");
		}
		else {
			return false;
		}
	}
	
	public static Boolean addPrevUsedName(WebDriver wd) {
		if(wd.getCurrentUrl().contains("location")) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebDriverWait wait = new WebDriverWait(wd, 10);
			wait.pollingEvery(Duration.ofMillis(200));
			wait.until(ExpectedConditions.elementToBeClickable(By.id(prop.getProperty("addLocationButton"))));
			wd.findElement(By.id(prop.getProperty("addLocationButton"))).click();
			
			WebElement name=wd.findElement(By.xpath(prop.getProperty("LocName")));
			name.sendKeys("Worldgate Test Location");
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement city = wd.findElement(By.xpath(prop.getProperty("LocCity")));
			city.sendKeys("Old Hometown");
			WebElement state = wd.findElement(By.xpath(prop.getProperty("LocState")));
			state.sendKeys("k");
			WebElement save = wd.findElement(By.xpath(prop.getProperty("LocSave")));
			save.click();

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			return wd.getPageSource().contains("Worldgate Test Location");
		}
		else {
			return false;
		}
	}
	
	public static boolean editLocation(int id, WebDriver wd) {
		if(wd.getCurrentUrl().contains("location")) {
			WebElement checkbox = wd.findElement(By.xpath("//*[@aria-label=\"Toggle  Worldgate Test City "
					+ id +  ", KS]"));
			WebElement editBldg = wd.findElement(By.xpath(prop.getProperty("edit")));
			
			Actions actions = new Actions(wd);
			
			actions.moveToElement(checkbox).click().perform();
			actions.moveToElement(editBldg).click().perform();
			
			WebElement editName = wd.findElement(By.xpath(prop.getProperty("editName")));
			editName.sendKeys("Edited Test Location " + id);
			
			WebElement editSave = wd.findElement(By.xpath(prop.getProperty("editSave")));
			editSave.click();
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			return wd.getPageSource().contains("Edited Test Location " + id);
		}
		else {
			return false;
		}
	}
	
	public static boolean editToExistingName(WebDriver wd) {
		if(wd.getCurrentUrl().contains("location")) {
			List<WebElement> checks = wd.findElements(By.tagName("md-checkbox"));
			WebElement editBldg = wd.findElement(By.xpath(prop.getProperty("edit")));
			
			Actions actions = new Actions(wd);
			
			actions.moveToElement(checks.get(0)).click().perform();
			actions.moveToElement(editBldg).click().perform();
			
			WebElement editName = wd.findElement(By.xpath(prop.getProperty("editName")));
			editName.sendKeys("Building and Room Test Location");
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean addRoomToLocation(WebDriver wd) {
		if(wd.getCurrentUrl().contains("location")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean editMultipleLocations(WebDriver wd) {
		if(wd.getCurrentUrl().contains("location")) {
			WebElement checkbox = wd.findElement(By.xpath(prop.getProperty("Checkbox")));
			WebElement rCheckbox = wd.findElement(By.xpath(prop.getProperty("RestonCheckbox")));
			WebElement edit = wd.findElement(By.id(prop.getProperty("edit")));
			
			Actions actions = new Actions(wd);
			
			actions.moveToElement(checkbox).click().perform();
			actions.moveToElement(rCheckbox).click().perform();
			actions.moveToElement(edit).click().perform();	
			return true;
			}
		else {
			return false;
		}
	}
	
	public static boolean deleteLocation(int id, WebDriver wd) {
		if(wd.getCurrentUrl().contains("location")) {
			WebElement checkbox = wd.findElement(By.xpath("//*[@aria-label=\"Toggle  Worldgate Test City "
					+ id +  ", KS]"));
			WebElement delete = wd.findElement(By.xpath(prop.getProperty("delete")));
			
			Actions actions = new Actions(wd);
			
			actions.moveToElement(checkbox).click().perform();
			actions.moveToElement(delete).click().perform();
			
			if(wd.getPageSource().contains("Worldgate Test City " + id)) {
				return false;
			}
			else {
				return true;
			}
		}
		else {
			return false;
		}
	}
}
