package loginTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class LoginTests {

    static WebDriver driver;

    static void baseMethod(){
        File chrome = new File("src/main/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
        driver = new ChromeDriver();

    }
}
