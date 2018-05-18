package settingsTab;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import java.io.File;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSettings {
	private static WebDriver driver;
	private static WebDriverWait wait;
	private static SettingsPage settingsPage;
	private static NavBarPage navBarPage;

	@DataProvider(name = "TimelineTrainersPerPageProvider")
	public static Object[][] timeLineTrainersPerPageData() {
		return new Object[][] {{"2"}, {"3"}};
	}

	@DataProvider(name = "DefaultBatchLengthProvider")
	public static Object[][] defaultBatchLengthProvider() {
		return new Object[][] {{"11", "5/7/2018"}, {"12", "5/7/2018"}};
	}
	
	@DataProvider(name = "DefaultBatchLocationProvider")
	public static Object[][] defaultBatchLocationProvider() {
		return new Object[][] {{"Revature"}, {"Tampa"}};
	}

	private void overwriteText(WebElement element, String input) {
		element.clear();
		element.sendKeys(input);
	}
	
	private void clickSaveButton() {
		wait.until(ExpectedConditions.elementToBeClickable(settingsPage.submitButton)).click();
		WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//md-toast")));
		wait.until(ExpectedConditions.elementToBeClickable(toast.findElement(By.tagName("button")))).click();
		wait.until(ExpectedConditions.invisibilityOf(toast));
	}

	@BeforeClass
	public static void setUpClass() {
		// Windows
//		File chrome = new File("src/main/resources/chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
//		ChromeOptions options = new ChromeOptions().addArguments("user-data-dir=C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\User Data");
		
		// Mac
		System.setProperty("webdriver.chrome.driver", "/Users/jtaylor/Downloads/chromedriver");
		ChromeOptions options = new ChromeOptions().addArguments("user-data-dir=/Users/jtaylor/Library/Application Support/Google/Chrome/Default");
		
		driver = new ChromeDriver(options);
		settingsPage = new SettingsPage(driver);
		navBarPage = new NavBarPage(driver);
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
		wait.until(ExpectedConditions.and(ExpectedConditions.visibilityOf(navBarPage.settingsTab), ExpectedConditions.elementToBeClickable(navBarPage.settingsTab)));
		navBarPage.settingsTab.click();
	}

	@Test(priority = 0, enabled = true)
	public void testSettingsTab() {
		wait.until(ExpectedConditions.urlToBe(SettingsPage.URL));
		assertEquals(driver.getCurrentUrl(), SettingsPage.URL);
	}

	@Test(priority = 1, dataProvider = "TimelineTrainersPerPageProvider", enabled = true)
	public void testTimelineTrainersPerPage(String input) {
		wait.until(ExpectedConditions.elementToBeClickable(settingsPage.timeLineTrainersPerPageInput));

		overwriteText(settingsPage.timeLineTrainersPerPageInput, input);
		clickSaveButton();

		navBarPage.batchesTab.click();
		WebElement hideBatchlessTrainersCheckBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"view\"]/md-card/md-content[3]/div/div[1]/div[1]/div[8]/md-checkbox[2]")));
		hideBatchlessTrainersCheckBox.click();

		WebElement headers = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(By.xpath("//*[@id=\"timeline\"]"), By.xpath("//*[@id='x axis']")));

		assertEquals(headers.findElements(By.className("tick")).size(), Integer.parseInt(input));
	}

	@Test(priority = 2, enabled = true, dataProvider = "DefaultBatchLocationProvider")
	public void testDefaultBatchLocation(String location) {
		wait.until(ExpectedConditions.elementToBeClickable(settingsPage.defaultBatchLocationSelector)).click();

		List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("md-option")));

		for (WebElement option : options) {
			if (option.getText().contains(location)) {
				option.click();
				break;
			}
		}

		clickSaveButton();
		navBarPage.batchesTab.click();
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/form/div[4]/div/md-input-container[1]/md-select")));
		
		assertTrue(element.getText().contains(location));
	}

	//	@Test
	public void testMinBatchSize() {
		// Change the min batch size to 10, and click submit
		wait.until(ExpectedConditions.elementToBeClickable(settingsPage.minBatchSizeInput));
		overwriteText(settingsPage.minBatchSizeInput, "10");
		wait.until(ExpectedConditions.elementToBeClickable(settingsPage.submitButton));
		settingsPage.submitButton.click();

		// Go to batches page, and check 
		navBarPage.batchesTab.click();
	}

	@Test(priority = 2, dataProvider = "DefaultBatchLengthProvider", enabled = true)
	public void testDefaultBatchLength(String length, String date) {
		// Change the default batch length to 30 days, and click submit
		wait.until(ExpectedConditions.elementToBeClickable(settingsPage.defaultBatchLengthInput));
		overwriteText(settingsPage.defaultBatchLengthInput, length);
		clickSaveButton();

		// Go to batches page, and check
		navBarPage.batchesTab.click();
		WebElement startDateElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/form/div[2]/div[1]/md-input-container[1]/md-datepicker/div/input")));
		WebElement endDateElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/form/div[2]/div[1]/md-input-container[2]/md-datepicker/div/input")));
		startDateElement.click();
		startDateElement.sendKeys(date);
		startDateElement.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.attributeToBeNotEmpty(endDateElement, "value"));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");

		LocalDate startDate = LocalDate.parse(date, formatter);
		LocalDate endDate = LocalDate.parse(endDateElement.getAttribute("value"), formatter);
		assertEquals(ChronoUnit.WEEKS.between(startDate, endDate) + 1, Integer.parseInt(length));
	}

	@Test(enabled = true)
	public void testClearButton() {
		wait.until(ExpectedConditions.and(
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("input")),
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("md-select"))));
		
		String timeLineTrainersPerPageValue = settingsPage.timeLineTrainersPerPageInput.getAttribute("value");
		String reportsOutgoingGradsValue = settingsPage.reportsOutgoingGradsInput.getAttribute("value");
		String reportsCandidatesIncomingValue = settingsPage.reportsCandidatesIncomingInput.getAttribute("value");
		String minimumBatchSizeValue = settingsPage.minBatchSizeInput.getAttribute("value");
		String maximumBatchSizeValue = settingsPage.maxBatchSizeInput.getAttribute("value");
		String defaultBatchLengthValue = settingsPage.defaultBatchLengthInput.getAttribute("value");
		String minimumDayBetweenTrainerBatches = settingsPage.minDayBetweenTrainerBatchesInput.getAttribute("value");
		String defaultBatchLocationValue = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list/md-list-item[4]/md-input-container/md-select/md-select-value/span[1]/div")).getText();
		String defaultBatchBuildingValue = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list/md-list-item[5]/md-input-container/md-select/md-select-value/span[1]")).getText();

		overwriteText(settingsPage.timeLineTrainersPerPageInput, "100000");
		overwriteText(settingsPage.reportsOutgoingGradsInput, "100000");
		overwriteText(settingsPage.reportsCandidatesIncomingInput, "100000");
		overwriteText(settingsPage.minBatchSizeInput, "100000");
		overwriteText(settingsPage.maxBatchSizeInput, "100000");
		overwriteText(settingsPage.defaultBatchLengthInput, "100000");
		overwriteText(settingsPage.minDayBetweenTrainerBatchesInput, "100000");
		
		wait.until(ExpectedConditions.elementToBeClickable(settingsPage.resetButton)).click();
		WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//md-toast")));
		assertTrue(toast.getText().contains("Settings reset."));
		wait.until(ExpectedConditions.elementToBeClickable(toast.findElement(By.tagName("button")))).click();
		wait.until(ExpectedConditions.invisibilityOf(toast));
		
		assertEquals(settingsPage.timeLineTrainersPerPageInput.getAttribute("value"), timeLineTrainersPerPageValue);
		assertEquals(settingsPage.reportsOutgoingGradsInput.getAttribute("value"), reportsOutgoingGradsValue);
		assertEquals(settingsPage.reportsCandidatesIncomingInput.getAttribute("value"), reportsCandidatesIncomingValue);
		assertEquals(settingsPage.minBatchSizeInput.getAttribute("value"), minimumBatchSizeValue);
		assertEquals(settingsPage.maxBatchSizeInput.getAttribute("value"), maximumBatchSizeValue);
		assertEquals(settingsPage.defaultBatchLengthInput.getAttribute("value"), defaultBatchLengthValue);
		assertEquals(settingsPage.minDayBetweenTrainerBatchesInput.getAttribute("value"), minimumDayBetweenTrainerBatches);
	}

	@Test(enabled = true)
	public void testSubmitButton() {
		wait.until(ExpectedConditions.and(
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("input")),
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("md-select"))));

		String timeLineTrainersPerPageValue = "2";
		String reportsOutgoingGradsValue = "20";
		String reportsCandidatesIncomingValue = "20";
		String minimumBatchSizeValue = "20";
		String maximumBatchSizeValue = "30";
		String defaultBatchLengthValue = "10";
		String minimumDayBetweenTrainerBatches = "7";
		String defaultBatchLocationValue = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list/md-list-item[4]/md-input-container/md-select/md-select-value/span[1]/div")).getText();
		String defaultBatchBuildingValue = driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list/md-list-item[5]/md-input-container/md-select/md-select-value/span[1]")).getText();

		overwriteText(settingsPage.timeLineTrainersPerPageInput, timeLineTrainersPerPageValue);
		overwriteText(settingsPage.reportsOutgoingGradsInput, reportsOutgoingGradsValue);
		overwriteText(settingsPage.reportsCandidatesIncomingInput, reportsCandidatesIncomingValue);
		overwriteText(settingsPage.minBatchSizeInput, minimumBatchSizeValue);
		overwriteText(settingsPage.maxBatchSizeInput, maximumBatchSizeValue);
		overwriteText(settingsPage.defaultBatchLengthInput, defaultBatchLengthValue);
		overwriteText(settingsPage.minDayBetweenTrainerBatchesInput, minimumDayBetweenTrainerBatches);
		
		wait.until(ExpectedConditions.elementToBeClickable(settingsPage.submitButton)).click();
		WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//md-toast")));
		assertTrue(toast.getText().contains("All settings have been updated"));
		wait.until(ExpectedConditions.elementToBeClickable(toast.findElement(By.tagName("button")))).click();
		wait.until(ExpectedConditions.invisibilityOf(toast));

		wait.until(ExpectedConditions.elementToBeClickable(settingsPage.submitButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(navBarPage.overviewTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(navBarPage.settingsTab)).click();

		wait.until(ExpectedConditions.and(
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("input")),
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("md-select"))));
		
		assertEquals(settingsPage.timeLineTrainersPerPageInput.getAttribute("value"), timeLineTrainersPerPageValue);
		assertEquals(settingsPage.reportsOutgoingGradsInput.getAttribute("value"), reportsOutgoingGradsValue);
		assertEquals(settingsPage.reportsCandidatesIncomingInput.getAttribute("value"), reportsCandidatesIncomingValue);
		assertEquals(settingsPage.minBatchSizeInput.getAttribute("value"), minimumBatchSizeValue);
		assertEquals(settingsPage.maxBatchSizeInput.getAttribute("value"), maximumBatchSizeValue);
		assertEquals(settingsPage.defaultBatchLengthInput.getAttribute("value"), defaultBatchLengthValue);
		assertEquals(settingsPage.minDayBetweenTrainerBatchesInput.getAttribute("value"), minimumDayBetweenTrainerBatches);
	}
	
	@Test(enabled = false)
	public void testSaveButtonInvalidValues() {
		wait.until(ExpectedConditions.and(
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("input")),
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("md-select"))));

		String timeLineTrainersPerPageValue = "-1";
		String reportsOutgoingGradsValue = "-1";
		String reportsCandidatesIncomingValue = "-1";
		String minimumBatchSizeValue = "-1";
		String maximumBatchSizeValue = "-1";
		String defaultBatchLengthValue = "-1";
		String minimumDayBetweenTrainerBatches = "-1";

		overwriteText(settingsPage.timeLineTrainersPerPageInput, timeLineTrainersPerPageValue);
		overwriteText(settingsPage.reportsOutgoingGradsInput, reportsOutgoingGradsValue);
		overwriteText(settingsPage.reportsCandidatesIncomingInput, reportsCandidatesIncomingValue);
		overwriteText(settingsPage.minBatchSizeInput, minimumBatchSizeValue);
		overwriteText(settingsPage.maxBatchSizeInput, maximumBatchSizeValue);
		overwriteText(settingsPage.defaultBatchLengthInput, defaultBatchLengthValue);
		overwriteText(settingsPage.minDayBetweenTrainerBatchesInput, minimumDayBetweenTrainerBatches);
		
		wait.until(ExpectedConditions.elementToBeClickable(settingsPage.submitButton)).click();
		WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//md-toast")));
		String text = toast.getText();
		wait.until(ExpectedConditions.elementToBeClickable(toast.findElement(By.tagName("button")))).click();
		wait.until(ExpectedConditions.invisibilityOf(toast));
		assertFalse(text.contains("All settings have been updated"));
	}
}
