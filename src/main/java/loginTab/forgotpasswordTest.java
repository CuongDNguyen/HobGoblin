package loginTab;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class forgotpasswordTest {

	WebDriver dr;

	@Given("^navigate to login$")
	public void navigate_to_login() throws IOException {
//		Properties prop = new Properties();
//		InputStream input = null;
//		input = new FileInputStream("src/test/resources/cuong.properties");
//		prop.load(input);
		File chrome = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
		dr = new ChromeDriver();
		dr.get("https://dev.assignforce.revaturelabs.com");
	}

	@When("^user click forgot password button$")
	public void user_click_forgot_password_button() throws InterruptedException {
//		Properties prop = new Properties();
//		InputStream input = null;
		dr.findElement(By.xpath("//*[@id=\\\"forgot_password_link\\\"]")).click();
		TimeUnit.SECONDS.sleep(2);
	}

	@Then("^redirects to forgot password page$")
	public void redirects_to_forgot_password_page() {
//		Properties prop = new Properties();
//		InputStream input = null;
//		try {
//			input = new FileInputStream("src/test/resources/cuong.properties");
//		} catch (FileNotFoundException e1) {
//			e1.printStackTrace();
//		}
//		try {
//			prop.load(input);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		String actual = dr.findElement(By.xpath("//*[@id=\\\"header\\\"]")).getText();
		if (actual.contains("Forgot Your Password")) {
			Assert.assertFalse(false);
		} else
			Assert.assertFalse(true);
		dr.close();
	}
}
