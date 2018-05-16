package buildingMethods;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddBuildingMethods {
	private static Properties prop = new Properties();
	private static AddBuildingMethods a = null;

	private AddBuildingMethods() {
		super();
		InputStream locProps = AddBuildingMethods.class.getClassLoader()
				.getResourceAsStream("location.properties");
		try {
			prop.load(locProps);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static AddBuildingMethods getAddBldgInstance() {
		if(a==null) {
			a = new AddBuildingMethods();
		}
		return a;
	}
	
	public static boolean addValidBuilding(WebDriver wd) {
		Random gen = new Random();
		int g = gen.nextInt(1000);
		if(wd.getCurrentUrl().contains("location")) {
			wd.findElement(By.xpath(prop.getProperty("Checkbox"))).click();
			wd.findElement(By.id(prop.getProperty("addBldg"))).click();
			
			WebElement name = wd.findElement(By.xpath(prop.getProperty("BldgName")));
			name.sendKeys("Test Building " + g);
			
			WebElement save = wd.findElement(By.xpath(prop.getProperty("BldgSave")));
			save.click();
	
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			return wd.getPageSource().contains("Test Building " + g);
		}
		else {
			return false;
		}
	}
	
	public static boolean addInvalidBuilding(WebDriver wd) {
		if(wd.getCurrentUrl().contains("location")) {
			wd.findElement(By.id(prop.getProperty("addBldg"))).click();
			WebElement save = wd.findElement(By.xpath(prop.getProperty("LocSave")));
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
wd.findElement(By.id(prop.getProperty("addBldg"))).click();
			
			WebElement name = wd.findElement(By.xpath(prop.getProperty("BldgName")));
			name.sendKeys("Used Building");
			
			WebElement save = wd.findElement(By.xpath(prop.getProperty("BldgSave")));
			save.click();
	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			return wd.getPageSource().contains("Used Building ");
		}
		else {
			return false;
		}
	}
}
