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
import org.testng.Assert;

public class newTrainer {
	WebDriver dr;
	@Given("^navigate to vp trainer$")
	public void navigate_to_vp_trainer() throws IOException {
//		Properties prop = new Properties();
//		InputStream input = null;
//		input = new FileInputStream("src/test/resources/cuong.properties");
//		prop.load(input);
		File chrome = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
		dr = new ChromeDriver();
		dr.get("https://dev.assignforce.revaturelabs.com");
		dr.findElement(By.xpath("//input[@id='username']")).sendKeys("test.vpoftech@revature.com.int1");
		dr.findElement(By.xpath("//input[@id='password']")).sendKeys("yuvi1712");
		dr.findElement(By.xpath("//input[@id='Login']")).click();
	}

	@When("^add trainer button clicked$")
	public void trainer_tab_clicked() throws IOException, InterruptedException {
//		Properties prop = new Properties();
//		InputStream input = null;
//		input = new FileInputStream("src/test/resources/cuong.properties");
//		prop.load(input);
		TimeUnit.SECONDS.sleep(7);
		dr.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[5]/a")).click();
		TimeUnit.SECONDS.sleep(2);
		dr.findElement(By.xpath("//*[@id=\\\"view\\\"]/md-card/md-toolbar[1]/div/button[1]")).click();
	}
	
	@And("^add trainer form filled$")
	public void trainer_form_filled() throws IOException, InterruptedException {
//		Properties prop = new Properties();
//		InputStream input = null;
//		input = new FileInputStream("src/test/resources/cuong.properties");
//		prop.load(input);
		TimeUnit.SECONDS.sleep(1);
		dr.findElement(By.xpath("//form/md-dialog-content/div/div/md-input-container[1]/input[1]")).sendKeys("first name");
		dr.findElement(By.xpath("//form/md-dialog-content/div/div/md-input-container[2]/input[1]")).sendKeys("last name");
		dr.findElement(By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-actions/button[1]")).click();
		TimeUnit.SECONDS.sleep(1);
		
	}

	@Then("^new trainer added$")
	public void new_trainer_added() throws IOException {
//		Properties prop = new Properties();
//		InputStream input = null;
//		input = new FileInputStream("src/test/resources/cuong.properties");
//		prop.load(input);
		if (dr.getPageSource().contains("first name") & dr.getPageSource().contains("last name")) {
			Assert.assertFalse(false);
		} else {
			Assert.assertFalse(true);
		}
	}
}
