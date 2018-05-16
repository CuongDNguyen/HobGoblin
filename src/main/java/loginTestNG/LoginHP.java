package loginTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginHP {


    public static void loginTrainer(WebDriver wd) {

        wd.get("https://dev.assignforce.revaturelabs.com");
//		un.sendKeys("test.vpoftech@revature.com.int1");
        wd.findElement(By.name("username")).sendKeys("test.vpoftech@revature.com.int1");
        wd.findElement(By.name("pw")).sendKeys("yuvi1712");
        wd.findElement(By.name("Login")).click();
//		pw.sendKeys("yuvi1712");
//		log.click();
    }

    static void loginVP(WebDriver wd){

        wd.get("https://dev.assignforce.revaturelabs.com");
//		un.sendKeys("test.vpoftech@revature.com.int1");
        wd.findElement(By.name("username")).sendKeys("test.vpoftech@revature.com.int1");
        wd.findElement(By.name("pw")).sendKeys("yuvi1712");
        wd.findElement(By.name("Login")).click();
//		pw.sendKeys("yuvi1712");
//		log.click();
    }


}
