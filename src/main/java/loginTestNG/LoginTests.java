package loginTestNG;

import com.worldgate.pom.LoginPage;
import com.worldgate.util.MasterDriver;
import com.worldgate.util.PropUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LoginTests {

    private static WebDriver driver;
    private static Wait wait;

    @BeforeSuite
    static void baseMethod() {
        driver = MasterDriver.getDriver();
    }


    @Test(groups = {"loginTrainer"}, priority = 1)
    public void loginTrainer() throws InterruptedException {
        driver.get("https://dev.assignforce.revaturelabs.com/home");
        LoginPage.user(driver).sendKeys(PropUtil.getVal("trainerUser"));
        LoginPage.pass(driver).sendKeys(PropUtil.getVal("trainerPass"));
        LoginPage.loginButton(driver).click();
        if (driver.getCurrentUrl().contains(PropUtil.getVal("homePage"))) {
            Assert.assertTrue(true);
        }
    }

    @Test(groups = {"loginVP"}, priority = 1)
    public void loginVP() throws InterruptedException {
        driver.get("https://dev.assignforce.revaturelabs.com/home");
        LoginPage.user(driver).sendKeys(PropUtil.getVal("vpUser"));
        LoginPage.pass(driver).sendKeys(PropUtil.getVal("vpPass"));
        LoginPage.loginButton(driver).click();
        if (driver.getCurrentUrl().contains(PropUtil.getVal("homePage"))) {
            Assert.assertTrue(true);
        }
    }

    @Test(groups = {"loginVP", "loginTrainer"}, priority = 2)
    public void openBatches() throws InterruptedException {
        LoginPage.openBatches(driver).click();

    }

    @Test(groups = {"loginVP", "loginTrainer"}, priority = 2)
    public void openLocations() throws InterruptedException {
        LoginPage.openLocations(driver).click();
    }

    @Test(groups = {"loginVP", "loginTrainer"}, priority = 2)
    public void openCurricula() throws InterruptedException {
        LoginPage.openCurricula(driver).click();
    }

    @Test(groups = {"loginVP", "loginTrainer"}, priority = 2)
    public void openTrainers() throws InterruptedException {
        LoginPage.openTrainers(driver).click();
    }

    @Test(groups = {"loginVP", "loginTrainer"}, priority = 2)
    public void openProfile() throws InterruptedException {
        LoginPage.openProfile(driver).click();
    }

    @Ignore
    @Test(groups = {"loginVP", "loginTrainer"}, priority = 2)
    public void openReports() throws InterruptedException {
        LoginPage.openReports(driver).click();
    }

    @Test(groups = {"loginVP", "loginTrainer"}, priority = 2)
    public void openSettings() throws InterruptedException {
        LoginPage.openSettings(driver).click();
    }

    @Test(groups = {"loginVP", "loginTrainer"}, priority = 3)
    public void logOut() {

        String tempxpath = PropUtil.getVal("logoutButton");
        driver.findElement(By.xpath(tempxpath)).click();
    }

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
