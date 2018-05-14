package com.worldgate.test.overviewTab;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class testOverviewTab {
	
	static WebDriver wd;
	static {
		File chrome = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
		wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public static final SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy");
	
	public static <T extends Comparable> boolean isSortedAscending(List<T> array) {
		if (array.size() > 0) {
			T temp = array.get(0);
			for (int i=1; i<array.size(); i++) {
				if (temp.compareTo(array.get(i)) > 0) {
					return false;
				}
				temp = array.get(i);
			}
		}
		return true;
	}
	
	public static <T extends Comparable> boolean isSortedDescending(List<T> array) {
		if (array.size() > 0) {
			T temp = array.get(0);
			for (int i=1; i<array.size(); i++) {
				if (temp.compareTo(array.get(i)) < 0) {
					return false;
				}
				temp = array.get(i);
			}
		}
		return true;
	}
	
	public static boolean isDateSortedAscending(List<Date> array) {
		if (array.size() > 0) {
			Date temp = array.get(0);
			for (int i=1; i<array.size(); i++) {
				if (temp.compareTo(array.get(i)) > 0) {
					return false;
				}
				temp = array.get(i);
			}
		}
		return true;
	}
	
	public static boolean isDateSortedDescending(List<Date> array) {
		if (array.size() > 0) {
			Date temp = array.get(0);
			for (int i=1; i<array.size(); i++) {
				if (temp.compareTo(array.get(i)) < 0) {
					return false;
				}
				temp = array.get(i);
			}
		}
		return true;
	}
	
	public static boolean sortTestDate(int column, String order) throws ParseException {
		List<WebElement> rows = wd.findElements(By.xpath("//table/tbody/tr"));
		List<Date> dates = new ArrayList<>();
		if (rows.size() > 0) {
			dates.add(formatter.parse(wd.findElement(By.xpath("//table/tbody/tr[1]/td["+column+"]")).getText().replaceAll("\\.", "")));
			for (int i=2; i<rows.size(); i+=2) {
				String xpath = "//table/tbody/tr["+(i+1)+"]/td["+column+"]";
				dates.add(formatter.parse(wd.findElement(By.xpath(xpath)).getText().replaceAll("\\.", "")));
			}
			if (order.equals("ascending")) {
				return isDateSortedAscending(dates);
			} else {
				return isDateSortedDescending(dates);
			}
		} else {
			return true;
		}
	}
	
	public static boolean sortTestString(int column, String order) throws ParseException {
		List<WebElement> rows = wd.findElements(By.xpath("//table/tbody/tr"));
		List<String> strings = new ArrayList<>();
		if (rows.size() > 0) {
			strings.add(wd.findElement(By.xpath("//table/tbody/tr[1]/td["+column+"]")).getText());
			for (int i=2; i<rows.size(); i+=2) {
				String xpath = "//table/tbody/tr["+(i+1)+"]/td["+column+"]";
				strings.add(wd.findElement(By.xpath(xpath)).getText());
			}
			if (order.equals("ascending")) {
				return isSortedAscending(strings);
			} else {
				return isSortedDescending(strings);
			}
		} else {
			return true;
		}
	}
	
	public static boolean sortTestInt(int column, String order) throws ParseException {
		List<WebElement> rows = wd.findElements(By.xpath("//table/tbody/tr"));
		List<Integer> nums = new ArrayList<>();
		if (rows.size() > 0) {
			try {
				nums.add(Integer.parseInt(wd.findElement(By.xpath("//table/tbody/tr[1]/td["+column+"]")).getText()));
			} catch (NumberFormatException e) {}
			for (int i=2; i<rows.size(); i+=2) {
				String xpath = "//table/tbody/tr["+(i+1)+"]/td["+column+"]";
				try {
					nums.add(Integer.parseInt(wd.findElement(By.xpath(xpath)).getText()));
				} catch (NumberFormatException e) {}
			}
			if (order.equals("ascending")) {
				return isSortedAscending(nums);
			} else {
				return isSortedDescending(nums);
			}
		} else {
			return true;
		}
	}
	
	@Given("^I have just logged in$")
	public void i_have_just_logged_in() throws Throwable {
		wd.get("https://dev.assignforce.revaturelabs.com/");
		wd.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("test.trainer@revature.com.int1");
		wd.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("trainer123");
		wd.findElement(By.xpath("//*[@id=\"Login\"]")).click();
	}

	@Given("^I have landed on the overview tab$")
	public void i_have_landed_on_the_overview_tab() throws Throwable {
		//wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		Assert.assertTrue(wd.getCurrentUrl().equals("https://dev.assignforce.revaturelabs.com/home"));
	}

	@Then("^batches should be in ascending order according to start date$")
	public void batches_should_be_in_ascending_order_according_to_start_date() throws Throwable {
//		List<WebElement> rows = wd.findElements(By.xpath("//table/tbody/tr"));
//		List<Date> dates = new ArrayList<>();
//		if (rows.size() > 0) {
//			dates.add(formatter.parse(wd.findElement(By.xpath("//table/tbody/tr[1]/td[7]")).getText().replaceAll("\\.", "")));
//			for (int i=2; i<rows.size(); i+=2) {
//				String xpath = "//table/tbody/tr["+(i+1)+"]/td[7]";
//				dates.add(formatter.parse(wd.findElement(By.xpath(xpath)).getText().replaceAll("\\.", "")));
//			}
//			Assert.assertTrue(isSortedAscending(dates));
//			
//		} else {
//			fail("The batches table should not be empty!");
//		}
		Assert.assertTrue(sortTestDate(7, "ascending"));
	}
	
	@Given("^I am on the overview tab$")
	public void i_am_on_the_overview_tab() throws Throwable {
		Assert.assertTrue(wd.getCurrentUrl().contains("https://dev.assignforce.revaturelabs.com/home"));
	}

	@Given("^I clicked on start date column\\(overview\\)$")
	public void i_clicked_on_start_date_column() throws Throwable {
	    wd.findElement(By.xpath("//table/thead/tr/th[7]")).click();
	}

	@Then("^batches should be in descending order according to start date$")
	public void batches_should_be_in_descending_order_according_to_start_date() throws Throwable {
		Assert.assertTrue(sortTestDate(7, "descending"));
	}

	@Given("^I have already clicked on start date once$")
	public void i_have_already_clicked_on_start_date_once() throws Throwable {
		Assert.assertTrue(sortTestDate(7, "descending"));
	}

	@Given("^I am on the overview page$")
	public void i_am_on_the_overview_page() throws Throwable {
		Assert.assertTrue(wd.getCurrentUrl().contains("https://dev.assignforce.revaturelabs.com/home"));
	}

	@Given("^I click on end date column\\(overview\\)$")
	public void i_click_on_end_date_column() throws Throwable {
		wd.findElement(By.xpath("//table/thead/tr/th[8]")).click();
	}

	@Then("^batches should be in ascending order according to end date$")
	public void batches_should_be_in_ascending_order_according_to_end_date() throws Throwable {
		Assert.assertTrue(sortTestDate(8, "ascending"));
	}

	@Given("^I click on end date column\\(overview\\) again$")
	public void i_click_on_end_date_column_again() throws Throwable {
		wd.findElement(By.xpath("//table/thead/tr/th[8]")).click();
	}

	@Then("^batches should be in descending order according to end date$")
	public void batches_should_be_in_descending_order_according_to_end_date() throws Throwable {
		Assert.assertTrue(sortTestDate(8, "descending"));
	}

	@Given("^I click on room column\\(overview\\)$")
	public void i_click_on_room_column() throws Throwable {
		wd.findElement(By.xpath("//table/thead/tr/th[6]")).click();
	}

	@Then("^batches should be in ascending order according to room$")
	public void batches_should_be_in_ascending_order_according_to_room() throws Throwable {
		Assert.assertTrue(sortTestInt(6, "ascending"));
	}

	@Given("^I click on room column\\(overview\\) again$")
	public void i_click_on_room_column_again() throws Throwable {
		wd.findElement(By.xpath("//table/thead/tr/th[6]")).click();
	}

	@Then("^batches should be in descending order according to room$")
	public void batches_should_be_in_descending_order_according_to_room() throws Throwable {
		Assert.assertTrue(sortTestInt(6, "descending"));
	}

	@Given("^I click on building column\\(overview\\)$")
	public void i_click_on_building_column() throws Throwable {
		wd.findElement(By.xpath("//table/thead/tr/th[5]")).click();
	}

	@Then("^batches should be in ascending order according to building$")
	public void batches_should_be_in_ascending_order_according_to_building() throws Throwable {
		Assert.assertTrue(sortTestString(5, "ascending"));
	}

	@Given("^I click on building column\\(overview\\) again$")
	public void i_click_on_building_column_again() throws Throwable {
		wd.findElement(By.xpath("//table/thead/tr/th[5]")).click();
	}
	
	@Then("^batches should be in descending order according to building$")
	public void batches_should_be_in_descending_order_according_to_building() throws Throwable {
		Assert.assertTrue(sortTestString(5, "ascending"));
	}

	@Given("^I click on location column\\(overview\\)$")
	public void i_click_on_location_column() throws Throwable {
		wd.findElement(By.xpath("//table/thead/tr/th[4]")).click();
	}

	@Then("^batches should be in ascending order according to location$")
	public void batches_should_be_in_ascending_order_according_to_location() throws Throwable {
		Assert.assertTrue(sortTestString(4, "ascending"));
	}

	@Given("^I click on location column\\(overview\\) again$")
	public void i_click_on_location_column_again() throws Throwable {
		wd.findElement(By.xpath("//table/thead/tr/th[4]")).click();
	}

	@Then("^batches should be in descending order according to location$")
	public void batches_should_be_in_descending_order_according_to_location() throws Throwable {
		Assert.assertTrue(sortTestString(4, "descending"));
	}

	@Given("^I click on trainer/cotrainer column\\(overview\\)$")
	public void i_click_on_trainer_cotrainer_column() throws Throwable {
		wd.findElement(By.xpath("//table/thead/tr/th[3]")).click();
	}

	@Then("^batches should be in ascending order according to trainer/cotrainer$")
	public void batches_should_be_in_ascending_order_according_to_trainer_cotrainer() throws Throwable {
		Assert.assertTrue(sortTestString(3, "ascending"));
	}

	@Given("^I click on trainer/cotrainer column\\(overview\\) again$")
	public void i_click_on_trainer_cotrainer_column_again() throws Throwable {
		wd.findElement(By.xpath("//table/thead/tr/th[3]")).click();
	}

	@Then("^batches should be in descending order according to trainer/cotrainer$")
	public void batches_should_be_in_descending_order_according_to_trainer_cotrainer() throws Throwable {
		Assert.assertTrue(sortTestString(3, "descending"));
	}
	
	@Given("^I click on curriculum column\\(overview\\)$")
	public void i_click_on_curriculum_column() throws Throwable {
		wd.findElement(By.xpath("//table/thead/tr/th[2]")).click();
	}

	@Then("^batches should be in ascending order according to curriculum$")
	public void batches_should_be_in_ascending_order_according_to_curriculum() throws Throwable {
		Assert.assertTrue(sortTestString(2, "ascending"));
	}

	@Given("^I click on curriculum column\\(overview\\) again$")
	public void i_click_on_curriculum_column_again() throws Throwable {
		wd.findElement(By.xpath("//table/thead/tr/th[2]")).click();
	}

	@Then("^batches should be in descending order according to curriculum$")
	public void batches_should_be_in_descending_order_according_to_curriculum() throws Throwable {
		Assert.assertTrue(sortTestString(2, "descending"));
	}

	@Given("^I click on name column\\(overview\\)$")
	public void i_click_on_name_column() throws Throwable {
		wd.findElement(By.xpath("//table/thead/tr/th[1]")).click();
	}

	@Then("^batches should be in ascending order according to name$")
	public void batches_should_be_in_ascending_order_according_to_name() throws Throwable {
		Assert.assertTrue(sortTestString(1, "ascending"));
	}

	@Given("^I click on name column\\(overview\\) again$")
	public void i_click_on_name_column_again() throws Throwable {
		wd.findElement(By.xpath("//table/thead/tr/th[1]")).click();
	}

	@Then("^batches should be in descending order according to name$")
	public void batches_should_be_in_descending_order_according_to_name() throws Throwable {
		Assert.assertTrue(sortTestString(1, "descending"));
		wd.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[9]/button")).click();
		wd.close();
	}

}
