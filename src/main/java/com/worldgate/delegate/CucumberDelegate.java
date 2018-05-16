package com.worldgate.delegate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import cucumber.api.cli.Main;

public class CucumberDelegate {

	public void runCucumber(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		Main.main(new String[]{"-g", "trainerTab", "C:/revature/ServletAngular/src/test/resources/trainerTest.feature"});
	}
	
	public void curriculaTab(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		Main.main(new String[]{"-g", "curriculaTab", "C:/revature/ServletAngular/src/test/resources/curriculaTest.feature"});
	}
	
	public void loginTest(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		Main.main(new String[]{"-g", "loginTab", "C:/revature/ServletAngular/src/test/resources/loginTest.feature"});
	}
	
	public void batchTest(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		Main.main(new String[]{"-g", "com.worldgate.test.batchesTab", "C:/revature/ServletAngular/src/test/resources/batches_tab_batch_ordering.feature"});
	}
	
	public void overviewTest(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		Main.main(new String[]{"-g", "com.worldgate.test.overviewTab", "C:/revature/ServletAngular/src/test/resources/overview_tab_batch_ordering.feature"});
	}
}

