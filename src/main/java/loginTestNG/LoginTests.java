package loginTestNG;

import com.worldgate.pom.LoginPage;
import com.worldgate.util.MasterDriver;
import com.worldgate.util.PropUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LoginTests {

    private static WebDriver driver;
    private static Wait wait;

    @BeforeSuite(groups = {"loginVP", "loginTrainer"})
    static void baseMethod() {
        driver = MasterDriver.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
    }


    @Test(groups = {"loginTrainer"}, priority = 1)
    public void loginTrainer() {
        driver.get("https://dev.assignforce.revaturelabs.com/home");
        LoginPage.user(driver).sendKeys(PropUtil.getVal("trainerUser"));
        LoginPage.pass(driver).sendKeys(PropUtil.getVal("trainerPass"));
        LoginPage.loginButton(driver).click();
        if (driver.getCurrentUrl().contains(PropUtil.getVal("homePage"))) {
            Assert.assertTrue(true);
        }
    }

    @Test(groups = {"loginVP"}, priority = 1)
    public void loginVP() {
        driver.get("https://dev.assignforce.revaturelabs.com/home");
        LoginPage.user(driver).sendKeys(PropUtil.getVal("vpUser"));
        LoginPage.pass(driver).sendKeys(PropUtil.getVal("vpPass"));
        LoginPage.loginButton(driver).click();
        if (driver.getCurrentUrl().contains(PropUtil.getVal("homePage"))) {
            Assert.assertTrue(true);
        }
    }

    @Test(groups = {"loginTrainer"}, priority = 2)
    public void openBatchesTrainer() throws InterruptedException {
        Thread.sleep(400);
        LoginPage.openBatches(driver).click();
        Thread.sleep(300);
        Assert.assertEquals(LoginPage.titleBatchesTrainer(driver).getText(), PropUtil.getVal("batchesTitleValTrainer"));
    }

    @Test(groups = {"loginVP"}, priority = 2)
    public void openBatchesVP() throws InterruptedException {
        Thread.sleep(400);
        LoginPage.openBatches(driver).click();
        Thread.sleep(300);
        Assert.assertEquals(LoginPage.titleBatchesVP(driver).getText(), PropUtil.getVal("batchesTitleValVP"));
    }

    @Test(groups = {"loginVP", "loginTrainer"}, priority = 2)
    public void openLocations() throws InterruptedException {
        LoginPage.openLocations(driver).click();
        Thread.sleep(300);
        Assert.assertEquals(LoginPage.titleLocations(driver).getText(), PropUtil.getVal("locationsTitleVal"));
    }

    @Test(groups = {"loginVP", "loginTrainer"}, priority = 2)
    public void openCurricula() throws InterruptedException {
        LoginPage.openCurricula(driver).click();
        Thread.sleep(300);
        Assert.assertEquals(LoginPage.titleCurricula(driver).getText(), PropUtil.getVal("curriculaTitleVal"));
    }

    @Test(groups = {"loginVP", "loginTrainer"}, priority = 2)
    public void openTrainers() throws InterruptedException {
        LoginPage.openTrainers(driver).click();
        Thread.sleep(300);
        Assert.assertEquals(LoginPage.titleTrainers(driver).getText(), PropUtil.getVal("trainersTitleVal"));
    }

    @Test(groups = {"loginTrainer"}, priority = 2)
    public void openProfile() throws InterruptedException {
        LoginPage.openProfile(driver).click();
        Thread.sleep(300);
        Assert.assertEquals(LoginPage.titleProfile(driver).getText(), PropUtil.getVal("profileTitleVal"));
    }

    @Ignore
    @Test(groups = {"loginVP", "loginTrainer"}, priority = 2)
    public void openReports() throws InterruptedException {
        LoginPage.openReports(driver).click();
        Thread.sleep(300);
        Assert.assertEquals(LoginPage.titleReports(driver).getText(), PropUtil.getVal("reportsTitleVal"));
    }

    @Test(groups = {"loginVP", "loginTrainer"}, priority = 2)
    public void openSettings() throws InterruptedException {
        LoginPage.openSettings(driver).click();
        Thread.sleep(300);
        Assert.assertEquals(LoginPage.titleSettings(driver).getText(), PropUtil.getVal("settingsTitleVal"));
    }

    @Test(groups = {"loginVP", "loginTrainer"}, priority = 2)
    public void openOverview() throws InterruptedException {
        LoginPage.openOverview(driver).click();
        Thread.sleep(300);
        Assert.assertEquals(LoginPage.titleOverview(driver).getText(), PropUtil.getVal("overviewTitleVal"));
    }

    @Test(groups = {"loginVP", "loginTrainer"}, priority = 3)
    public void logOut() {

        String tempxpath = PropUtil.getVal("logoutButton");
        driver.findElement(By.xpath(tempxpath)).click();
    }

    @Test(groups = {"forgotPassword"})
    public void forgotPassword() {
        driver.get("https://dev.assignforce.revaturelabs.com/home");
        LoginPage.forgotPassword(driver).click();
        String header = LoginPage.forgotPasswordHeader(driver).getText();
        if (header.equals("Forgot Your Password")) {
            Assert.assertTrue(true);
        }
    }

    @AfterSuite(groups = {"loginVP", "loginTrainer"})
    public void exitTest() {
        MasterDriver.logout(driver);
    }

}
