package com.worldgate.test.batchesTab;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features={"src/test/resources/batches_tab_batch_ordering.feature"},
tags= {"@BatchesTabOrderingTest"}, plugin= {"pretty","html:src/test/resources/cucumberTests/BatchesTabTestResults.html"})
public class BatchesTabTestRunner extends AbstractTestNGCucumberTests {

}
