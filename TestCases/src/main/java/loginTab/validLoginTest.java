package loginTab;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class validLoginTest {

	WebDriver dr;

	@Given("^navigate to assignforce page$")
	public void navigate() throws IOException {
//		Properties prop = new Properties();
//		InputStream input = null;
//		input = new FileInputStream("src/test/resources/cuong.properties");
//		prop.load(input);
		File chrome = new File("C:/revature/ServletAngular/src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
		dr = new ChromeDriver();
		dr.get("https://dev.assignforce.revaturelabs.com");
	}

	@When("^user logged in with credentials")
	public void login() throws IOException {
//		Properties prop = new Properties();
//		InputStream input = null;
//		input = new FileInputStream("src/test/resources/cuong.properties");
//		prop.load(input);
		dr.findElement(By.xpath("//input[@id='username']")).sendKeys("test.trainer@revature.com.int1");
		dr.findElement(By.xpath("//input[@id='password']")).sendKeys("trainer123");
		dr.findElement(By.xpath("//input[@id='Login']")).click();
	}

	@Then("^home page should be displayed$")
	public void verifySuccessful() throws IOException {
		try {
//			Properties prop = new Properties();
//			InputStream input = null;
//			input = new FileInputStream("src/test/resources/cuong.properties");
//			prop.load(input);
			TimeUnit.SECONDS.sleep(7);
			String current = dr.getCurrentUrl();
			if (current.contains("https://dev.assignforce.revaturelabs.com/home")) {
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