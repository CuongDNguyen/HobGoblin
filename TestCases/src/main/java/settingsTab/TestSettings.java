package settingsTab;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSettings {
	private static WebDriver driver;
	private static WebDriverWait wait;
	private static SettingsPage settingsPage;

	@BeforeClass
	public static void setUpClass() {
		System.setProperty("webdriver.chrome.driver", "/Users/jtaylor/Downloads/chromedriver");
		driver = new ChromeDriver();
		settingsPage = new SettingsPage(driver);
		wait = new WebDriverWait(driver, 10);
		wait.pollingEvery(Duration.ofMillis(200));
		
		driver.get("https://dev.assignforce.revaturelabs.com");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test.vpoftech@revature.com.int1");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("yuvi1712");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	}

	@AfterClass
	public static void tearDownClass() {
		driver.quit();
	}
	
	@BeforeMethod
	public static void setUp() {
		By xpath = By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[8]/a");
		wait.until(ExpectedConditions.elementToBeClickable(xpath));
		driver.findElement(xpath).click();
	}

	@Test(priority = 0)
	public void testSettingsTab() {
		wait.until(ExpectedConditions.urlToBe("https://dev.assignforce.revaturelabs.com/settings"));
		assertEquals(driver.getCurrentUrl(), "https://dev.assignforce.revaturelabs.com/settings");
	}
	
	@Test(priority = 1)
	public void testTimelineTrainersPerPage() {
		wait.until(ExpectedConditions.elementToBeClickable(settingsPage.timeLineTrainersPerPageInput));
		settingsPage.timeLineTrainersPerPageInput.sendKeys("2");
		settingsPage.timeLineTrainersPerPageInput.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(settingsPage.submitButton));
		settingsPage.submitButton.click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[2]/a")).click();
		wait.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(By.xpath("//*[@id=\"timeline\"]"), By.xpath("//*[@id='x axis']")));
		assertEquals(driver.findElement(By.xpath("//*[@id='x axis']")).findElements(By.className("tick")).size(), 2);
	}
	
	@Test(priority = 2)
	public void testDefaultBatchLocation() {
		wait.until(ExpectedConditions.elementToBeClickable(settingsPage.defaultBatchLocationSelector));
		
		Select select = new Select(settingsPage.defaultBatchLocationSelector);
		select.deselectAll();
		select.selectByVisibleText("Revature HQ - Reston, VA");
		
		wait.until(ExpectedConditions.elementToBeClickable(settingsPage.submitButton));
		settingsPage.submitButton.click();
	}
}
