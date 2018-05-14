package trainerTab;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin={"pretty","html:C:/Reports/CucumberTests"},
		tags= {"@trainerTest"},
		features = {"C:/revature/ServletAngular/src/test/resources/trainerTest.feature"}
		)
public class trainerRunner extends AbstractTestNGCucumberTests {

}
