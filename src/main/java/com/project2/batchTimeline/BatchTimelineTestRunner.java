package com.project2.batchTimeline;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features={"src/test/resources/batch_timeline.feature"},
tags= {"@BatchTimelineTest"}, plugin= {"pretty","html:/TestCases/src/test/resources/TestResults/BatchTimelineTestResults.html"})
public class BatchTimelineTestRunner extends AbstractTestNGCucumberTests{

}
