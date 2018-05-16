package loginTestNG;

import com.worldgate.pom.LoginPage;
import com.worldgate.util.LogUtil;
import com.worldgate.util.MasterDriver;
import com.worldgate.util.PropUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoginTests {


    static WebDriver driver;

    @BeforeMethod
    static void baseMethod(){
        driver = MasterDriver.getDriver();
    }

    @Test(groups = {"logintest"})
    public void loginTrainer() {
        LoginPage.user(driver).sendKeys(PropUtil.getVal("trainerUser"));
        LoginPage.pass(driver).sendKeys(PropUtil.getVal("trainerPass"));
        LoginPage.loginButton(driver).click();
        if (driver.getCurrentUrl().contains(PropUtil.getVal("homePage"))){
            Assert.assertTrue(true);
        }

    }

    @Test(groups = {"logintest"})
    public void loginVP() {
        LoginPage.user(driver).sendKeys(PropUtil.getVal("vpUser"));
        LoginPage.pass(driver).sendKeys(PropUtil.getVal("vpPass"));
        LoginPage.loginButton(driver).click();
        if (driver.getCurrentUrl().contains(PropUtil.getVal("homePage"))){
            Assert.assertTrue(true);
        }
    }

    @Test(groups = {"logintest"})
    public void forgotPassword(){
        
    }

    @AfterMethod
    static void logout(){
        String tempxpath = PropUtil.getVal("logoutButton");
        driver.findElement(By.xpath(tempxpath)).click();
    }

    @AfterSuite
    static void exitTest(){
        MasterDriver.logout(driver);
    }

}
