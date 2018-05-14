package locationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class McCombLogin {
//	
//	@FindBy(id="username")
//	private static WebElement un;
//	
//	@FindBy(name="pw")
//	private static WebElement pw;
//	
//	@FindBy(name="Login")
//	private static WebElement log;
//	
//	
//	
//	public McCombLogin(WebDriver driver) {
//		super();
//		PageFactory.initElements(driver, this);
//
//	}



	public static void login(WebDriver wd) {
		
		wd.get("https://dev.assignforce.revaturelabs.com");
//		un.sendKeys("test.vpoftech@revature.com.int1");
		wd.findElement(By.name("username")).sendKeys("test.vpoftech@revature.com.int1");
		wd.findElement(By.name("pw")).sendKeys("yuvi1712");
		wd.findElement(By.name("Login")).click();
//		pw.sendKeys("yuvi1712");
//		log.click();
	}
}
