package com.worldgate.delegate;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.testng.TestNG;

public class TestNgDelegate {
	public void runTestNg (HttpServletRequest request, HttpServletResponse response) throws Throwable {
		TestNG runner = new TestNG();
		List<String> suitefiles = new ArrayList<String>();
		
		suitefiles.add("C:\\revature\\ServletAngular\\src\\test\\java\\locationTests.xml");
		
		runner.setTestSuites(suitefiles);
		runner.run();
	}
}
