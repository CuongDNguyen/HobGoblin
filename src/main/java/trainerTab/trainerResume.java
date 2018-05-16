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

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class trainerResume {
	WebDriver dr;
	
	@Given("^navigate to vp trainer tab$")
	public void navigate_to_vp_trainer_tab() throws IOException {
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

	@When("^download resume button clicked$")
	public void download_resume_button_clicked() throws IOException, InterruptedException {
//		Properties prop = new Properties();
//		InputStream input = null;
//		input = new FileInputStream("src/test/resources/cuong.properties");
//		prop.load(input);
	    TimeUnit.SECONDS.sleep(7);
	    dr.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[5]/a")).click();
		TimeUnit.SECONDS.sleep(2);
		dr.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/md-list/md-list-item[1]/div[1]/div[1]/button[1]")).click();
	}

	@Then("^download resume$")
	public void download_resume() {
	}

}
