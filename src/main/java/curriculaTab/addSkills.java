package curriculaTab;

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

public class addSkills {
	WebDriver dr;
	@Given("^navigate to curricula as vp$")
	public void navigate_to_curricula_as_vp() throws InterruptedException, IOException {
		File chrome = new File("src/main/resources/chromedriver.exe");
//		Properties prop = new Properties();
//		InputStream input = null;
//		input = new FileInputStream("src/test/resources/cuong.properties");
//		prop.load(input);
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
	    dr=new ChromeDriver();
	    dr.get("https://dev.assignforce.revaturelabs.com");    
	    dr.findElement(By.xpath("//input[@id='username']")).sendKeys("test.vpoftech@revature.com.int1");
	    dr.findElement(By.xpath("//input[@id='password']")).sendKeys("yuvi1712");
	    dr.findElement(By.xpath("//input[@id='Login']")).click();
		TimeUnit.SECONDS.sleep(7);
		dr.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[4]/a/span/span")).click();
		TimeUnit.SECONDS.sleep(2);
	}

	@When("^new skill filled out$")
	public void new_skill_filled_out() throws IOException {
//		Properties prop = new Properties();
//		InputStream input = null;
//		input = new FileInputStream("src/test/resources/cuong.properties");
//		prop.load(input);
		dr.findElement(By.xpath("//*[@id=\"input_1\"]")).sendKeys("A new skill");
		dr.findElement(By.xpath("//*[@id=\"skill\"]/form/div/div/div")).click();
	}

	@Then("^add new skills$")
	public void add_new_skills() throws IOException {
//		Properties prop = new Properties();
//		InputStream input = null;
//		input = new FileInputStream("src/test/resources/cuong.properties");
//		prop.load(input);
		if (dr.getPageSource().contains("A new skill"))
		{
			Assert.assertFalse(false);
		dr.quit();
		}
		else Assert.assertFalse(true);
		dr.quit();
	}
}
