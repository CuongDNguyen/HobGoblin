package com.worldgate.request;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.worldgate.delegate.CucumberDelegate;
import com.worldgate.delegate.TestNgDelegate;

public class RequestHelper {
	private static CucumberDelegate cucumber = new CucumberDelegate();
	private static TestNgDelegate testNg = new TestNgDelegate();
	public static String process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		/*Get request*/
		String requestHandled = request.getRequestURI().substring(request.getContextPath().length()+1);
		while(requestHandled.indexOf("/")>0) {
			requestHandled = requestHandled.substring(0, requestHandled.indexOf("/"));
		}
		
		//Changing between controllers
		switch(requestHandled) {
		case "runCucumber.do": 
			cucumber.runCucumber(request, response);
			break;
		case "runTestNg.do":
			System.out.println("Hello");
			testNg.runTestNg(request, response);
			break;
		case "curriculaTab.do":
			cucumber.curriculaTab(request, response);
			break;
		case "loginTest.do":
			cucumber.loginTest(request, response);
			break;
		case "batchTest.do":
			cucumber.batchTest(request, response);
			break;
		case "overviewTest.do":
			cucumber.overviewTest(request, response);
			break;
		default:
			cucumber.runCucumber(request, response);
			break;
		}
		return "404.html";
	}
}
