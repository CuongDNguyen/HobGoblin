

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.worldgate.locationMethods.BuildingMethods;
import com.worldgate.locationMethods.LocationMethods;
import com.worldgate.locationMethods.McCombLogin;

public class LocationTestsOLD {
	static WebDriver wd;
	static int locNum, bldgNum, rmNum;
	@BeforeSuite
	public void setup() {
		LocationMethods a = LocationMethods.getAddLocInstance();
		BuildingMethods b = BuildingMethods.getAddBldgInstance();
		File chrome = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
		wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		McCombLogin.login(wd);
	}
	
	@AfterSuite
	public void tearDown() {
		wd.close();
	}
	
	@Test (priority = 1)
	public void navigationTest() {
		  assertTrue(com.worldgate.locationMethods.PageMethods.navigateTo(wd).equals("https://dev.assignforce.revaturelabs.com/locations"));
	}
	
	@Test (priority = 2, groups = "location")
	public void validLocationTest() {
		locNum = LocationMethods.addValidLocation(wd);
		assertTrue(wd.getPageSource().contains("Unused Test Location " + locNum));
	}
	
	@Test (priority = 2, groups = "location")
	public void invalidLocationTest() {
		assertFalse(LocationMethods.addInvalidLocation(wd));
	}
	
	@Test (priority = 2, groups = "location")
	public void reusedNameTest() {
		assertTrue(LocationMethods.addPrevUsedName(wd));
	}
	
	@Test (priority = 3, groups = "building")
	public void validBuildingTest() {
		assertTrue(BuildingMethods.addValidBuilding(wd));
	}
	
	@Test (priority = 4, groups = "building")
	public void invalidBuildingTest() {
		assertFalse(BuildingMethods.addValidBuilding(wd));
	}
	
	@Test(priority = 5, groups = "building")
	public void reusedBuildingTest() {
		assertTrue(BuildingMethods.readdBuilding(wd));
	}
}
