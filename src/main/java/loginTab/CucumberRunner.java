package loginTab;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
plugin = {
		"pretty",
		"html:C:/Users/azncd/OneDrive/Desktop/GitForked/HobGoblin/AngularHG/src/app/cucumber-reports",
		"json:C:/Json/LoginJson.json"},
tags = {"@loginTest" }, 
features = { "C:/revature/TestCases/src/test/resources/loginTest.feature" })

public class CucumberRunner extends AbstractTestNGCucumberTests {
}
