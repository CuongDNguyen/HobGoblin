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

public class expandButton {
	WebDriver dr;
	@Given("^current tab is curricula$")
	public void current_tab_is_curricula() throws IOException {
//		Properties prop = new Properties();
//		InputStream input = null;
//		input = new FileInputStream("src/test/resources/cuong.properties");
//		prop.load(input);
		File chrome = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
	    dr=new ChromeDriver();
	    dr.get("https://dev.assignforce.revaturelabs.com");    
	    dr.findElement(By.xpath("//input[@id='username']")).sendKeys("test.trainer@revature.com.int1");
	    dr.findElement(By.xpath("//input[@id='password']")).sendKeys("trainer123");
	    dr.findElement(By.xpath("//input[@id='Login']")).click();
	    try {
			TimeUnit.SECONDS.sleep(7);
			dr.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[4]/a/span/span")).click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("^expand buttons are clicked$")
	public void expand_buttons_are_clicked() throws InterruptedException, IOException {
//		Properties prop = new Properties();
//		InputStream input = null;
//		input = new FileInputStream("src/test/resources/cuong.properties");
//		prop.load(input);
	       TimeUnit.SECONDS.sleep(1);
	       dr.findElement(By.xpath("//*[@id=\\\"view\\\"]/md-card/md-content/md-card[1]/md-toolbar/div/button")).click();
	       TimeUnit.SECONDS.sleep(1);
	       dr.findElement(By.xpath("//*[@id=\\\"view\\\"]/md-card/md-content/md-card[2]/md-toolbar/div/button")).click();
	}

	@Then("^information should expand/collapse$")
	public void information_should_expand_collapse() throws IOException {
//		Properties prop = new Properties();
//		InputStream input = null;
//		input = new FileInputStream("src/test/resources/cuong.properties");
//		prop.load(input);
		String realtimeCore = dr.findElement(By.xpath("//*[@id=\\\"coreArrow\\\"]")).getText();
	       String realtimeFocus = dr.findElement(By.xpath("//*[@id=\\\"focusArrow\\\"]")).getText();
	       if (realtimeCore.contains("keyboard_arrow_down") & realtimeFocus.contains("keyboard_arrow_down")) {
	    	  Assert.assertFalse(false);
	    	  dr.close();
	       } else {
	    	  Assert.assertFalse(true);
	    	  dr.close();
	       }
	}
}
