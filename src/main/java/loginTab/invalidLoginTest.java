package loginTab;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class invalidLoginTest {

	WebDriver dr;

	@Given("^navigate to login page$")
	public void navigate_to_login_page() throws IOException {
//		Properties prop = new Properties();
//		InputStream input = null;
//		input = new FileInputStream("src/test/resources/cuong.properties");
//		prop.load(input);
		File chrome = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
		dr = new ChromeDriver();
		dr.get("https://dev.assignforce.revaturelabs.com");
	}

	@When("^user logged in with incorrect credentials$")
	public void user_logged_in_with_incorrect_credentials() throws IOException {
//		Properties prop = new Properties();
//		InputStream input = null;
//		input = new FileInputStream("src/test/resources/cuong.properties");
//		prop.load(input);
		dr.findElement(By.xpath("//input[@id='username']")).sendKeys("wrong");
		dr.findElement(By.xpath("//input[@id='password']")).sendKeys("wrong");
		dr.findElement(By.xpath("//input[@id='Login']")).click();
	}

	@Then("^error message appears$")
	public void error_message_appears() throws IOException {
//		Properties prop = new Properties();
//		InputStream input = null;
//		input = new FileInputStream("src/test/resources/cuong.properties");
//		prop.load(input);
		try {
			TimeUnit.SECONDS.sleep(1);
			String actualMessage = dr.findElement(By.xpath("//*[@id=\\\"error\\\"]")).getText();
			if (actualMessage.contains("Please check your username and password. If you still can't log in, contact your Salesforce administrator.")) {
				Assert.assertFalse(false);
			} else {
				Assert.assertFalse(true);
			}
			dr.close();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
