package loginTestNG;

import com.worldgate.pom.LoginPage;
import com.worldgate.util.MasterDriver;
import com.worldgate.util.PropUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTests {

    private static WebDriver driver;

    @BeforeSuite
    static void baseMethod() {
        driver = MasterDriver.getDriver();
    }

    @Test(groups = {"logintest"})
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

    @Test(groups = {"logintest"})
    public void loginVP() throws InterruptedException {
        driver.get("https://dev.assignforce.revaturelabs.com/home");
        LoginPage.user(driver).sendKeys(PropUtil.getVal("vpUser"));
        LoginPage.pass(driver).sendKeys(PropUtil.getVal("vpPass"));
        LoginPage.loginButton(driver).click();
        if (driver.getCurrentUrl().contains(PropUtil.getVal("homePage"))) {
            Assert.assertTrue(true);
        }
        Thread.sleep(2000);
        String tempxpath = PropUtil.getVal("logoutButton");
        driver.findElement(By.xpath(tempxpath)).click();
    }

//    @AfterMethod(onlyForGroups = "logintest")
//    static void logout() {
//        String tempxpath = PropUtil.getVal("logoutButton");
//        driver.findElement(By.xpath(tempxpath)).click();
//        System.out.println("Logging out");
//    }

    @Test
    public void forgotPassword() {
        driver.get("https://dev.assignforce.revaturelabs.com/home");
        LoginPage.forgotPassword(driver).click();
        String header = LoginPage.forgotPasswordHeader(driver).getText();
        if (header.equals("Forgot Your Password")) {
            Assert.assertTrue(true);
        }
    }



    @AfterSuite
    static void exitTest() {
        MasterDriver.logout(driver);
    }

}
