package com.worldgate.test.overviewTab;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features={"src/test/resources/overview_tab_batch_ordering.feature"},
tags= {"@OverviewTabOrderingTest"}, plugin= {"pretty","html:src/test/resources/cucumberTests/OverviewTabTestResults.html"})
public class OverviewTabTestRunner extends AbstractTestNGCucumberTests {

}
