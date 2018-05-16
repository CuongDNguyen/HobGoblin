package locationMethods;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddLocationMethods {
	private static Properties prop = new Properties();
	private static AddLocationMethods a = null;

	private AddLocationMethods() {
		super();
		InputStream locProps = AddLocationMethods.class.getClassLoader()
				.getResourceAsStream("location.properties");
		try {
			prop.load(locProps);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static AddLocationMethods getAddLocInstance() {
		if(a==null) {
			a = new AddLocationMethods();
		}
		return a;
	}
	
	public static Boolean addValidLocation(WebDriver wd) {
		if(wd.getCurrentUrl().contains("location")) {
			Random gen = new Random();
			int g = gen.nextInt(1000);
			wd.findElement(By.id(prop.getProperty("addLocationButton"))).click();
			WebElement name=wd.findElement(By.xpath(prop.getProperty("LocName")));
			name.sendKeys("Unused Test Location " + g);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement city = wd.findElement(By.xpath(prop.getProperty("LocCity")));
			city.sendKeys("Worldgate Test City");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement state = wd.findElement(By.xpath(prop.getProperty("LocState")));
			state.sendKeys("k");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement save = wd.findElement(By.xpath(prop.getProperty("LocSave")));
			save.click();

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			return wd.getPageSource().contains("Unused Test Location " + g);
		}
		else {
			return false;
		}
	}
	
	public static boolean addInvalidLocation(WebDriver wd) {
		if(wd.getCurrentUrl().contains("location")) {
			wd.findElement(By.id(prop.getProperty("addLocationButton"))).click();

			
			WebElement city = wd.findElement(By.xpath(prop.getProperty("LocCity")));
			city.sendKeys("Fail Case City");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement state = wd.findElement(By.xpath(prop.getProperty("LocState")));
			state.sendKeys("k");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
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
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			wd.findElement(By.id(prop.getProperty("addLocationButton"))).click();
			
			WebElement name=wd.findElement(By.xpath(prop.getProperty("LocName")));
			name.sendKeys("Worldgate Test Location");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement city = wd.findElement(By.xpath(prop.getProperty("LocCity")));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			city.sendKeys("Old Hometown");
			WebElement state = wd.findElement(By.xpath(prop.getProperty("LocState")));
			state.sendKeys("k");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement save = wd.findElement(By.xpath(prop.getProperty("LocSave")));
			save.click();

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			return wd.getPageSource().contains("Worldgate Test Location");
		}
		else {
			return false;
		}
	}
}
