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

public class vpSkills {
	WebDriver dr;
	@Given("^navigate to curricula tab as vp$")
	public void navigate_to_curricula_tab_as_vp() throws IOException {
//		Properties prop = new Properties();
//		InputStream input = null;
//		input = new FileInputStream("src/test/resources/cuong.properties");
//		prop.load(input);
		File chrome = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
	    dr=new ChromeDriver();
	    dr.get("https://dev.assignforce.revaturelabs.com");    
	    dr.findElement(By.xpath("//input[@id='username']")).sendKeys("test.vpoftech@revature.com.int1");
	    dr.findElement(By.xpath("//input[@id='password']")).sendKeys("yuvi1712");
	    dr.findElement(By.xpath("//input[@id='Login']")).click();
	}

	@When("^curricula tab clicked$")
	public void curricula_tab_clicked() throws InterruptedException, IOException {
//		Properties prop = new Properties();
//		InputStream input = null;
//		input = new FileInputStream("src/test/resources/cuong.properties");
//		prop.load(input);
		TimeUnit.SECONDS.sleep(7);
		dr.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[4]/a/span/span")).click();
		TimeUnit.SECONDS.sleep(2);
	}

	@Then("^skills form default appear$")
	public void skills_form_default_appear() throws IOException {
//		Properties prop = new Properties();
//		InputStream input = null;
//		input = new FileInputStream("src/test/resources/cuong.properties");
//		prop.load(input);
		String realTimeSkills = dr.findElement(By.xpath("//*[@id=\"skillArrow\"]")).getText();
		if (realTimeSkills.contains("keyboard_arrow_up")) {
			Assert.assertFalse(false);
		} else {
			Assert.assertFalse(true);
		}
		dr.close();
	}
}
