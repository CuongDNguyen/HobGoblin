package overviewTestNG;

import com.worldgate.pom.OverviewPage;
import com.worldgate.util.MasterDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OverviewTests {


    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeSuite
    static void baseMethod() {
        driver = MasterDriver.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, 8);
        driver.get("https://dev.assignforce.revaturelabs.com/home");
        driver = MasterDriver.trainerLogin(driver);
    }

//
//    List<WebElement> rows;
//    ArrayList<List> dates;
//
//    @Test
//    public void sortNameAscending() throws ParseException {
//        rows = OverviewPage.rows(driver);
//        for (WebElement row : rows) {
//            Date temp = OverviewPage.getStartDate(row);
//            System.out.println(temp);
//            if (temp != null) {
//                dates.add(temp);
//            }
//        }
//        System.out.println(dates);
//    }

    @Test(dependsOnMethods = "sortNameAscending")
    public void sortNameReverse() {
        OverviewPage.startDateColumn(driver).click();

    }


    @AfterSuite
    static void exitTest() {
        MasterDriver.logout(driver);
    }
}

