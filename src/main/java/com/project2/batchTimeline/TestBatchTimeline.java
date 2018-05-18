package com.project2.batchTimeline;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestBatchTimeline {
	
	static WebDriver wd;
	static {
		File chrome = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:\\Users\\Michael\\AppData\\Local\\Google\\Chrome\\User Data");
		wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static final SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy");
	public static List<Date> dates = new ArrayList<>();
	private Date earliestDate() {
		List<WebElement> rows = wd.findElements(By.xpath("//table/tbody/tr"));
		//dates = new ArrayList<>();
		if (rows.size() > 0) {
			try {
				dates.add(formatter.parse(wd.findElement(By.xpath("//table/tbody/tr[1]/td[9]")).getText().replaceAll("\\.", "")));
			} catch (Exception e) {
				e.printStackTrace();
			}
			for (int i=2; i<rows.size()-1; i+=2) {
				String xpath = "//table/tbody/tr["+(i+1)+"]/td[9]";
				try {
					dates.add(formatter.parse(wd.findElement(By.xpath(xpath)).getText().replaceAll("\\.", "")));
				} catch (NoSuchElementException nsee) {
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			Collections.sort(dates);
			return dates.get(0);
		} else {
			return null;
		}
	}
	private Date latestDate() {
		return dates.get(dates.size()-1);
	}
	
	@Given("^I have logged in$")
	public void i_have_logged_in() throws Throwable {
		wd.get("https://dev.assignforce.revaturelabs.com/");
		wd.findElement(By.id("username")).sendKeys("test.trainer@revature.com.int1");
		wd.findElement(By.id("password")).sendKeys("trainer123");
		wd.findElement(By.id("Login")).click();
	}

	@Given("^I click on the batches tab$")
	public void i_click_on_the_batches_tab() throws Throwable {
		Thread.sleep(5000);
		wd.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[2]/a/span/span")).click();
	}

	@Then("^I am on the batches tab$")
	public void i_am_on_the_batches_tab() throws Throwable {
		//Assert.assertTrue(wd.getCurrentUrl().equals("https://dev.assignforce.revaturelabs.com/batches"));
		Assert.assertTrue(wd.getCurrentUrl().equals("https://dev.assignforce.revaturelabs.com/batches"), 
				"The browser should be on the batches tab, but it isn't!");
	}
	
	@Then("^There is an option to change number of trainers per page$")
	public void there_is_an_option_to_change_number_of_trainers_per_page() throws Throwable {
	    Assert.assertTrue(wd.findElement(By.xpath("//input[@max='completeTrainerList.length']")) != null, 
	    		"The input for changing number of trainers per page is missing!");
	}

	@Given("^I set the number of trainers per page to \"([^\"]*)\"$")
	public void i_set_the_number_of_trainers_per_page_to(String arg1) throws Throwable {
		wd.findElement(By.xpath("//input[@max='completeTrainerList.length']"))
			.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),arg1);
	}

	@Then("^The timeline should contain \"([^\"]*)\" trainers$")
	public void the_timeline_should_contain_trainers(String arg1) throws Throwable {
	    List<WebElement> swimlanes = wd.findElements(By.xpath("//g[@class='swimlanes']/line"));
	    Assert.assertEquals(swimlanes.size(), Integer.parseInt(arg1), 
	    		"There should be " + arg1 + " trainers in the timeline, but there aren't!");
	}
	
	@Then("^There is an option to filter batches by start date$")
	public void there_is_an_option_to_filter_batches_by_start_date() throws Throwable {
		Assert.assertNotEquals(null, wd.findElement(By.xpath("//md-datepicker[@ng-model=\"StartDate\"]")),
				"The input field for choosing start date is missing!");
	}
	
	@Then("^There is an option to filter batches by end date$")
	public void there_is_an_option_to_filter_batches_by_end_date() throws Throwable {
		Assert.assertNotEquals(null, wd.findElement(By.xpath("//md-datepicker[@ng-model=\"EndDate\"]")),
				"The input field for choosing end date is missing!");
	}
	
	@Then("^There is an option to filter batches by curriculum$")
	public void there_is_an_option_to_filter_batches_by_curriculum() throws Throwable {
		Assert.assertNotEquals(null, wd.findElement(By.xpath("//md-select[@ng-model=\"selectCurricula\"]")),
				"The input field for choosing curricula is missing!");
	}
	
	@Then("^There is an option to filter batches by focus$")
	public void there_is_an_option_to_filter_batches_by_focus() throws Throwable {
		Assert.assertNotEquals(null, wd.findElement(By.xpath("//md-select[@ng-model=\"selectFoci\"]")),
				"The input field for choosing focus is missing!");
	}
	
	@Then("^There is an option to filter batches by location$")
	public void there_is_an_option_to_filter_batches_by_location() throws Throwable {
		Assert.assertNotEquals(null, wd.findElement(By.xpath("//md-select[@ng-model=\"selectLocations\"]")),
				"The input field for choosing location is missing!");
	}
	
	@Then("^There is an option to filter batches by building$")
	public void there_is_an_option_to_filter_batches_by_building() throws Throwable {
		Assert.assertNotEquals(null, wd.findElement(By.xpath("//md-select[@ng-model=\"selectBuildings\"]")),
				"The input field for choosing building is missing!");
	}

	@Given("^I set the Start Date to the earliest date that is in the Batches table$")
	public void i_set_the_Start_Date_to_the_earliest_date_that_is_in_the_Batches_table() throws Throwable {
		wd.quit();
//		wd.findElement(By.xpath("//md-datepicker[@ng-model=\"StartDate\"]")).click();
//		try {
//			Date d = earliestDate();
//			String earliestDate = new SimpleDateFormat("MMMM").format(d) + " " + new SimpleDateFormat("YYYY").format(d);
//			wd.findElement(By.xpath("//td[@aria-label='" + earliestDate + "']")).click();
//			SimpleDateFormat specific = new SimpleDateFormat("EEEE MMMM d YYYY");
//			String specificDay = specific.format(d);
//			wd.findElement(By.xpath("//td[contains(@aria-label,'" + specificDay + "')]")).click();
//		} catch (Exception e) {
//			System.out.println("There was an exception while setting the start date");
//			System.out.println(e.getMessage());
//		}
	}

	@Given("^I set the End date to the latest date that is in the Batches table$")
	public void i_set_the_End_date_to_the_latest_date_that_is_in_the_Batches_table() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//		wd.findElement(By.xpath("//md-datepicker[@ng-model=\"EndDate\"]")).click();
//		try {
//			Date d = latestDate();
//			String monthYear = new SimpleDateFormat("MMMM").format(d) + " " + new SimpleDateFormat("YYYY").format(d);
//			wd.findElement(By.xpath("//td[@aria-label='" + monthYear + "']")).click();
//			SimpleDateFormat specific = new SimpleDateFormat("EEEE MMMM d YYYY");
//			String specificDay = specific.format(d);
//			WebDriverWait wait = new WebDriverWait(wd,10);
//			wd.findElement(By.xpath("//td[contains(@aria-label,'" + specificDay + "')]")).click();
//			//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(@aria-label,'\" + specificDay + \"')]")));
//			
//		} catch (Exception e) {
//			System.out.println("There was an exception while setting the end date");
//			System.out.println(e.getMessage());
//		}
	}

}
