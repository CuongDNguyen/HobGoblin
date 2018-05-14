package loginTab;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
plugin = {
		"pretty",
		"html:C:/Users/azncd/OneDrive/Desktop/GitForked/HobGoblin/AngularHG/src/app/cucumber-reports",
		"json:C:/Json/LoginJson.json"},
tags = {"@validTest" }, 
features = { "C:/revature/ServletAngular/src/test/resources/loginTest.feature" })

public class CucumberRunner extends AbstractTestNGCucumberTests {
}
