$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/batches/batches_tab_batch_ordering.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Michael Sikorski"
    },
    {
      "line": 2,
      "value": "#Feature: Ordering of batches in the Batches tab"
    }
  ],
  "line": 4,
  "name": "Ordering of batches in Batches tab",
  "description": "\r\nI want to order batches according to start date,\r\nend date, room, building, location, trainer/cotrainer, \r\nfocus, curriculum, or name (ascending and descending order).",
  "id": "ordering-of-batches-in-batches-tab",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@BatchesTabOrderingTest"
    }
  ]
});
formatter.scenario({
  "line": 10,
  "name": "Logging in",
  "description": "",
  "id": "ordering-of-batches-in-batches-tab;logging-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I have just logged in(batches)",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I clicked on the Batches tab",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Browser should land on the batches page",
  "keyword": "Then "
});
formatter.match({
  "location": "testBatchesTab.i_have_just_logged_in_batches()"
});
formatter.result({
  "duration": 11637533865,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.i_clicked_on_the_Batches_tab()"
});
formatter.result({
  "duration": 5072631951,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[2]/a/span/span\"}\n  (Session info: chrome\u003d66.0.3359.139)\n  (Driver info: chromedriver\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027LAPTOP-DSAON1VA\u0027, ip: \u0027192.168.0.27\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb), userDataDir\u003dC:\\Users\\Michael\\AppData\\Local\\Temp\\scoped_dir4572_5875}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d66.0.3359.139, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: f780726c1a9d17ab63af4c6c85aba6ad\n*** Element info: {Using\u003dxpath, value\u003d/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[2]/a/span/span}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:416)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:518)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:408)\r\n\tat com.project2.batches.testBatchesTab.i_clicked_on_the_Batches_tab(testBatchesTab.java:157)\r\n\tat ✽.And I clicked on the Batches tab(src/test/resources/batches/batches_tab_batch_ordering.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "testBatchesTab.browser_should_land_on_the_batches_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 15,
  "name": "Redirected to batches page",
  "description": "",
  "id": "ordering-of-batches-in-batches-tab;redirected-to-batches-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I just landed on the Batches page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "batches should be in ascending order according to start date",
  "keyword": "Then "
});
formatter.match({
  "location": "testBatchesTab.i_just_landed_on_the_Batches_page()"
});
formatter.result({
  "duration": 28632003,
  "error_message": "java.lang.AssertionError: Browser should be on the batches page, but it isn\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.i_just_landed_on_the_Batches_page(testBatchesTab.java:168)\r\n\tat ✽.Given I just landed on the Batches page(src/test/resources/batches/batches_tab_batch_ordering.feature:16)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_ascending_order_according_to_start_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 19,
  "name": "Click start date column once",
  "description": "",
  "id": "ordering-of-batches-in-batches-tab;click-start-date-column-once",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "I am on the Batches page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I clicked on start date column(batches)",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "batches should be in descending order according to start date",
  "keyword": "Then "
});
formatter.match({
  "location": "testBatchesTab.i_am_on_the_Batches_page()"
});
formatter.result({
  "duration": 22096068,
  "error_message": "java.lang.AssertionError: Browser should be on the batches page, but it isn\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.i_am_on_the_Batches_page(testBatchesTab.java:180)\r\n\tat ✽.Given I am on the Batches page(src/test/resources/batches/batches_tab_batch_ordering.feature:20)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "testBatchesTab.i_clicked_on_start_date_column_batches()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_descending_order_according_to_start_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 24,
  "name": "Click start date column again",
  "description": "",
  "id": "ordering-of-batches-in-batches-tab;click-start-date-column-again",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "I have already clicked on start date once",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I clicked on start date column(batches)",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "batches should be in ascending order according to start date",
  "keyword": "Then "
});
formatter.match({
  "location": "testBatchesTab.i_have_already_clicked_on_start_date_once()"
});
formatter.result({
  "duration": 5099938643,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.i_clicked_on_start_date_column_batches()"
});
formatter.result({
  "duration": 5036012211,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//table/thead/tr/th[9]\"}\n  (Session info: chrome\u003d66.0.3359.139)\n  (Driver info: chromedriver\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027LAPTOP-DSAON1VA\u0027, ip: \u0027192.168.0.27\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb), userDataDir\u003dC:\\Users\\Michael\\AppData\\Local\\Temp\\scoped_dir4572_5875}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d66.0.3359.139, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: f780726c1a9d17ab63af4c6c85aba6ad\n*** Element info: {Using\u003dxpath, value\u003d//table/thead/tr/th[9]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:416)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:518)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:408)\r\n\tat com.project2.batches.testBatchesTab.i_clicked_on_start_date_column_batches(testBatchesTab.java:186)\r\n\tat ✽.And I clicked on start date column(batches)(src/test/resources/batches/batches_tab_batch_ordering.feature:26)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_ascending_order_according_to_start_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 29,
  "name": "Click end date column",
  "description": "",
  "id": "ordering-of-batches-in-batches-tab;click-end-date-column",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "I am on the Batches page",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "I click on end date column(batches)",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "batches should be in ascending order according to end date",
  "keyword": "Then "
});
formatter.match({
  "location": "testBatchesTab.i_am_on_the_Batches_page()"
});
formatter.result({
  "duration": 33574167,
  "error_message": "java.lang.AssertionError: Browser should be on the batches page, but it isn\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.i_am_on_the_Batches_page(testBatchesTab.java:180)\r\n\tat ✽.Given I am on the Batches page(src/test/resources/batches/batches_tab_batch_ordering.feature:30)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_end_date_column_batches()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_ascending_order_according_to_end_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 34,
  "name": "Click end date column again",
  "description": "",
  "id": "ordering-of-batches-in-batches-tab;click-end-date-column-again",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 35,
  "name": "I am on the Batches page",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "I click on end date column(batches) again",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "batches should be in descending order according to end date",
  "keyword": "Then "
});
formatter.match({
  "location": "testBatchesTab.i_am_on_the_Batches_page()"
});
formatter.result({
  "duration": 10602110,
  "error_message": "java.lang.AssertionError: Browser should be on the batches page, but it isn\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.i_am_on_the_Batches_page(testBatchesTab.java:180)\r\n\tat ✽.Given I am on the Batches page(src/test/resources/batches/batches_tab_batch_ordering.feature:35)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_end_date_column_batches_again()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_descending_order_according_to_end_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 39,
  "name": "Click room column once",
  "description": "",
  "id": "ordering-of-batches-in-batches-tab;click-room-column-once",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 40,
  "name": "I am on the Batches page",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "I click on room column(batches)",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "batches should be in ascending order according to room",
  "keyword": "Then "
});
formatter.match({
  "location": "testBatchesTab.i_am_on_the_Batches_page()"
});
formatter.result({
  "duration": 12947269,
  "error_message": "java.lang.AssertionError: Browser should be on the batches page, but it isn\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.i_am_on_the_Batches_page(testBatchesTab.java:180)\r\n\tat ✽.Given I am on the Batches page(src/test/resources/batches/batches_tab_batch_ordering.feature:40)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_room_column_batches()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_ascending_order_according_to_room()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 44,
  "name": "Click room column again",
  "description": "",
  "id": "ordering-of-batches-in-batches-tab;click-room-column-again",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 45,
  "name": "I am on the Batches page",
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "I click on room column(batches) again",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "batches should be in descending order according to room",
  "keyword": "Then "
});
formatter.match({
  "location": "testBatchesTab.i_am_on_the_Batches_page()"
});
formatter.result({
  "duration": 17974011,
  "error_message": "java.lang.AssertionError: Browser should be on the batches page, but it isn\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.i_am_on_the_Batches_page(testBatchesTab.java:180)\r\n\tat ✽.Given I am on the Batches page(src/test/resources/batches/batches_tab_batch_ordering.feature:45)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_room_column_batches_again()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_descending_order_according_to_room()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 49,
  "name": "Click building column once",
  "description": "",
  "id": "ordering-of-batches-in-batches-tab;click-building-column-once",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 50,
  "name": "I am on the Batches page",
  "keyword": "Given "
});
formatter.step({
  "line": 51,
  "name": "I click on building column(batches)",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "batches should be in ascending order according to building",
  "keyword": "Then "
});
formatter.match({
  "location": "testBatchesTab.i_am_on_the_Batches_page()"
});
formatter.result({
  "duration": 12719210,
  "error_message": "java.lang.AssertionError: Browser should be on the batches page, but it isn\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.i_am_on_the_Batches_page(testBatchesTab.java:180)\r\n\tat ✽.Given I am on the Batches page(src/test/resources/batches/batches_tab_batch_ordering.feature:50)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_building_column_batches()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_ascending_order_according_to_building()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 54,
  "name": "Click building column again",
  "description": "",
  "id": "ordering-of-batches-in-batches-tab;click-building-column-again",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 55,
  "name": "I am on the Batches page",
  "keyword": "Given "
});
formatter.step({
  "line": 56,
  "name": "I click on building column(batches) again",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "batches should be in descending order according to building",
  "keyword": "Then "
});
formatter.match({
  "location": "testBatchesTab.i_am_on_the_Batches_page()"
});
formatter.result({
  "duration": 12407705,
  "error_message": "java.lang.AssertionError: Browser should be on the batches page, but it isn\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.i_am_on_the_Batches_page(testBatchesTab.java:180)\r\n\tat ✽.Given I am on the Batches page(src/test/resources/batches/batches_tab_batch_ordering.feature:55)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_building_column_batches_again()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_descending_order_according_to_building()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 59,
  "name": "Click location column once",
  "description": "",
  "id": "ordering-of-batches-in-batches-tab;click-location-column-once",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 60,
  "name": "I am on the Batches page",
  "keyword": "Given "
});
formatter.step({
  "line": 61,
  "name": "I click on location column(batches)",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "batches should be in ascending order according to location",
  "keyword": "Then "
});
formatter.match({
  "location": "testBatchesTab.i_am_on_the_Batches_page()"
});
formatter.result({
  "duration": 14461370,
  "error_message": "java.lang.AssertionError: Browser should be on the batches page, but it isn\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.i_am_on_the_Batches_page(testBatchesTab.java:180)\r\n\tat ✽.Given I am on the Batches page(src/test/resources/batches/batches_tab_batch_ordering.feature:60)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_location_column_batches()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_ascending_order_according_to_location()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 64,
  "name": "Click location column again",
  "description": "",
  "id": "ordering-of-batches-in-batches-tab;click-location-column-again",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 65,
  "name": "I am on the Batches page",
  "keyword": "Given "
});
formatter.step({
  "line": 66,
  "name": "I click on location column(batches) again",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "batches should be in descending order according to location",
  "keyword": "Then "
});
formatter.match({
  "location": "testBatchesTab.i_am_on_the_Batches_page()"
});
formatter.result({
  "duration": 14027530,
  "error_message": "java.lang.AssertionError: Browser should be on the batches page, but it isn\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.i_am_on_the_Batches_page(testBatchesTab.java:180)\r\n\tat ✽.Given I am on the Batches page(src/test/resources/batches/batches_tab_batch_ordering.feature:65)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_location_column_batches_again()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_descending_order_according_to_location()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 69,
  "name": "Click trainer/cotrainer column once",
  "description": "",
  "id": "ordering-of-batches-in-batches-tab;click-trainer/cotrainer-column-once",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 70,
  "name": "I am on the Batches page",
  "keyword": "Given "
});
formatter.step({
  "line": 71,
  "name": "I click on trainer/cotrainer column(batches)",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "batches should be in ascending order according to trainer/cotrainer",
  "keyword": "Then "
});
formatter.match({
  "location": "testBatchesTab.i_am_on_the_Batches_page()"
});
formatter.result({
  "duration": 14560675,
  "error_message": "java.lang.AssertionError: Browser should be on the batches page, but it isn\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.i_am_on_the_Batches_page(testBatchesTab.java:180)\r\n\tat ✽.Given I am on the Batches page(src/test/resources/batches/batches_tab_batch_ordering.feature:70)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_trainer_cotrainer_column_batches()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_ascending_order_according_to_trainer_cotrainer()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 74,
  "name": "Click trainer/cotrainer column again",
  "description": "",
  "id": "ordering-of-batches-in-batches-tab;click-trainer/cotrainer-column-again",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 75,
  "name": "I am on the Batches page",
  "keyword": "Given "
});
formatter.step({
  "line": 76,
  "name": "I click on trainer/cotrainer column(batches) again",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "batches should be in descending order according to trainer/cotrainer",
  "keyword": "Then "
});
formatter.match({
  "location": "testBatchesTab.i_am_on_the_Batches_page()"
});
formatter.result({
  "duration": 13945594,
  "error_message": "java.lang.AssertionError: Browser should be on the batches page, but it isn\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.i_am_on_the_Batches_page(testBatchesTab.java:180)\r\n\tat ✽.Given I am on the Batches page(src/test/resources/batches/batches_tab_batch_ordering.feature:75)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_trainer_cotrainer_column_batches_again()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_descending_order_according_to_trainer_cotrainer()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 79,
  "name": "Click focus column once",
  "description": "",
  "id": "ordering-of-batches-in-batches-tab;click-focus-column-once",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 80,
  "name": "I am on the Batches page",
  "keyword": "Given "
});
formatter.step({
  "line": 81,
  "name": "I click on focus column(batches)",
  "keyword": "And "
});
formatter.step({
  "line": 82,
  "name": "batches should be in ascending order according to focus",
  "keyword": "Then "
});
formatter.match({
  "location": "testBatchesTab.i_am_on_the_Batches_page()"
});
formatter.result({
  "duration": 14158928,
  "error_message": "java.lang.AssertionError: Browser should be on the batches page, but it isn\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.i_am_on_the_Batches_page(testBatchesTab.java:180)\r\n\tat ✽.Given I am on the Batches page(src/test/resources/batches/batches_tab_batch_ordering.feature:80)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_focus_column_batches()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_ascending_order_according_to_focus()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 84,
  "name": "Click focus column again",
  "description": "",
  "id": "ordering-of-batches-in-batches-tab;click-focus-column-again",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 85,
  "name": "I am on the Batches page",
  "keyword": "Given "
});
formatter.step({
  "line": 86,
  "name": "I click on focus column(batches) again",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "batches should be in descending order according to focus",
  "keyword": "Then "
});
formatter.match({
  "location": "testBatchesTab.i_am_on_the_Batches_page()"
});
formatter.result({
  "duration": 14738893,
  "error_message": "java.lang.AssertionError: Browser should be on the batches page, but it isn\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.i_am_on_the_Batches_page(testBatchesTab.java:180)\r\n\tat ✽.Given I am on the Batches page(src/test/resources/batches/batches_tab_batch_ordering.feature:85)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_focus_column_batches_again()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_descending_order_according_to_focus()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 89,
  "name": "Click curriculum column once",
  "description": "",
  "id": "ordering-of-batches-in-batches-tab;click-curriculum-column-once",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 90,
  "name": "I am on the Batches page",
  "keyword": "Given "
});
formatter.step({
  "line": 91,
  "name": "I click on curriculum column(batches)",
  "keyword": "And "
});
formatter.step({
  "line": 92,
  "name": "batches should be in ascending order according to curriculum",
  "keyword": "Then "
});
formatter.match({
  "location": "testBatchesTab.i_am_on_the_Batches_page()"
});
formatter.result({
  "duration": 13981464,
  "error_message": "java.lang.AssertionError: Browser should be on the batches page, but it isn\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.i_am_on_the_Batches_page(testBatchesTab.java:180)\r\n\tat ✽.Given I am on the Batches page(src/test/resources/batches/batches_tab_batch_ordering.feature:90)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_curriculum_column_batches()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_ascending_order_according_to_curriculum()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 94,
  "name": "Click curriculum column again",
  "description": "",
  "id": "ordering-of-batches-in-batches-tab;click-curriculum-column-again",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 95,
  "name": "I am on the Batches page",
  "keyword": "Given "
});
formatter.step({
  "line": 96,
  "name": "I click on curriculum column(batches) again",
  "keyword": "And "
});
formatter.step({
  "line": 97,
  "name": "batches should be in descending order according to curriculum",
  "keyword": "Then "
});
formatter.match({
  "location": "testBatchesTab.i_am_on_the_Batches_page()"
});
formatter.result({
  "duration": 24662111,
  "error_message": "java.lang.AssertionError: Browser should be on the batches page, but it isn\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.i_am_on_the_Batches_page(testBatchesTab.java:180)\r\n\tat ✽.Given I am on the Batches page(src/test/resources/batches/batches_tab_batch_ordering.feature:95)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_curriculum_column_batches_again()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_descending_order_according_to_curriculum()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 99,
  "name": "Click name column once",
  "description": "",
  "id": "ordering-of-batches-in-batches-tab;click-name-column-once",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 100,
  "name": "I am on the Batches page",
  "keyword": "Given "
});
formatter.step({
  "line": 101,
  "name": "I click on name column(batches)",
  "keyword": "And "
});
formatter.step({
  "line": 102,
  "name": "batches should be in ascending order according to name",
  "keyword": "Then "
});
formatter.match({
  "location": "testBatchesTab.i_am_on_the_Batches_page()"
});
formatter.result({
  "duration": 12441687,
  "error_message": "java.lang.AssertionError: Browser should be on the batches page, but it isn\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.i_am_on_the_Batches_page(testBatchesTab.java:180)\r\n\tat ✽.Given I am on the Batches page(src/test/resources/batches/batches_tab_batch_ordering.feature:100)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_name_column_batches()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_ascending_order_according_to_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 104,
  "name": "Click name column again",
  "description": "",
  "id": "ordering-of-batches-in-batches-tab;click-name-column-again",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 105,
  "name": "I am on the Batches page",
  "keyword": "Given "
});
formatter.step({
  "line": 106,
  "name": "I click on name column(batches) again",
  "keyword": "And "
});
formatter.step({
  "line": 107,
  "name": "batches should be in descending order according to name",
  "keyword": "Then "
});
formatter.match({
  "location": "testBatchesTab.i_am_on_the_Batches_page()"
});
formatter.result({
  "duration": 29494777,
  "error_message": "java.lang.AssertionError: Browser should be on the batches page, but it isn\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.i_am_on_the_Batches_page(testBatchesTab.java:180)\r\n\tat ✽.Given I am on the Batches page(src/test/resources/batches/batches_tab_batch_ordering.feature:105)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_name_column_batches_again()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_descending_order_according_to_name()"
});
formatter.result({
  "status": "skipped"
});
});