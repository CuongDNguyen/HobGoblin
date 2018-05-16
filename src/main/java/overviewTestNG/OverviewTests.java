package overviewTestNG;

import com.worldgate.pom.LoginPage;
import com.worldgate.util.MasterDriver;
import com.worldgate.util.PropUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OverviewTests {


    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeSuite
    static void baseMethod() {
        driver = MasterDriver.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, 8);
    }

    @Test(groups = {"name"})
    public void loginTrainer() throws InterruptedException {
        driver.get("https://dev.assignforce.revaturelabs.com/home");
        LoginPage.user(driver).sendKeys(PropUtil.getVal("trainerUser"));
        LoginPage.pass(driver).sendKeys(PropUtil.getVal("trainerPass"));
        LoginPage.loginButton(driver).click();
        if (driver.getCurrentUrl().contains(PropUtil.getVal("homePage"))) {
            Assert.assertTrue(true);
        }
        Thread.sleep(2000);
        String tempxpath = PropUtil.getVal("logoutButton");
        driver.findElement(By.xpath(tempxpath)).click();

    }


}
