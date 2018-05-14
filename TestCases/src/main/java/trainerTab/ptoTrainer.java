package trainerTab;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ptoTrainer {
	WebDriver dr;

	@Given("^navigate to trainer$")
	public void navigate_to_trainer() throws IOException {
//		Properties prop = new Properties();
//		InputStream input = null;
//		input = new FileInputStream("src/test/resources/cuong.properties");
//		prop.load(input);
		File chrome = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
		dr = new ChromeDriver();
		dr.get("https://dev.assignforce.revaturelabs.com");
		dr.findElement(By.xpath("//input[@id='username']")).sendKeys("test.trainer@revature.com.int1");
		dr.findElement(By.xpath("//input[@id='password']")).sendKeys("trainer123");
		dr.findElement(By.xpath("//input[@id='Login']")).click();
	}

	@When("^tab is clicked$")
	public void tab_is_clicked() throws InterruptedException, IOException {
//		Properties prop = new Properties();
//		InputStream input = null;
//		input = new FileInputStream("src/test/resources/cuong.properties");
//		prop.load(input);
		TimeUnit.SECONDS.sleep(7);
		dr.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[5]/a")).click();
	}

	@And("^calendar button clicked$")
	public void calendar_button_clicked() throws InterruptedException, IOException {
//		Properties prop = new Properties();
//		InputStream input = null;
//		input = new FileInputStream("src/test/resources/cuong.properties");
//		prop.load(input);
		TimeUnit.SECONDS.sleep(3);
		dr.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-toolbar[1]/div/button[2]")).click();
	}

	@Then("^Calender shows$")
	public void calender_shows() {
	}

}
