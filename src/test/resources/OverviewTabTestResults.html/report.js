$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/overview/overview_tab_batch_ordering.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Michael Sikorski"
    },
    {
      "line": 2,
      "value": "#Feature: Ordering of batches in the Overview tab"
    }
  ],
  "line": 4,
  "name": "Ordering of batches in Overview tab",
  "description": "\r\nI want to order batches according to start date,\r\nend date, room, building, location, trainer/cotrainer, \r\ncurriculum, or name (ascending and descending order).",
  "id": "ordering-of-batches-in-overview-tab",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@OverviewTabOrderingTest"
    }
  ]
});
formatter.scenario({
  "line": 10,
  "name": "Default ordering",
  "description": "",
  "id": "ordering-of-batches-in-overview-tab;default-ordering",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I have just logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I have landed on the overview tab",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "batches should be in ascending order according to start date",
  "keyword": "Then "
});
formatter.match({
  "location": "testOverviewTab.i_have_just_logged_in()"
});
formatter.result({
  "duration": 4914989041,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.i_have_landed_on_the_overview_tab()"
});
formatter.result({
  "duration": 5012571198,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.batches_should_be_in_ascending_order_according_to_start_date()"
});
formatter.result({
  "duration": 1852993938,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Click start date column once",
  "description": "",
  "id": "ordering-of-batches-in-overview-tab;click-start-date-column-once",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I am on the overview tab",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I clicked on start date column(overview)",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "batches should be in descending order according to start date",
  "keyword": "Then "
});
formatter.match({
  "location": "testOverviewTab.i_am_on_the_overview_tab()"
});
formatter.result({
  "duration": 5394884,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.i_clicked_on_start_date_column()"
});
formatter.result({
  "duration": 93010401,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.batches_should_be_in_descending_order_according_to_start_date()"
});
formatter.result({
  "duration": 1132620585,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Click start date column again",
  "description": "",
  "id": "ordering-of-batches-in-overview-tab;click-start-date-column-again",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "I have already clicked on start date once",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I clicked on start date column(overview)",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "batches should be in ascending order according to start date",
  "keyword": "Then "
});
formatter.match({
  "location": "testOverviewTab.i_have_already_clicked_on_start_date_once()"
});
formatter.result({
  "duration": 1037277487,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.i_clicked_on_start_date_column()"
});
formatter.result({
  "duration": 44656562,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.batches_should_be_in_ascending_order_according_to_start_date()"
});
formatter.result({
  "duration": 1082396585,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Click end date column",
  "description": "",
  "id": "ordering-of-batches-in-overview-tab;click-end-date-column",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "I am on the overview page",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I click on end date column(overview)",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "batches should be in ascending order according to end date",
  "keyword": "Then "
});
formatter.match({
  "location": "testOverviewTab.i_am_on_the_overview_page()"
});
formatter.result({
  "duration": 5499475,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.i_click_on_end_date_column()"
});
formatter.result({
  "duration": 78614351,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.batches_should_be_in_ascending_order_according_to_end_date()"
});
formatter.result({
  "duration": 1831471794,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Click end date column again",
  "description": "",
  "id": "ordering-of-batches-in-overview-tab;click-end-date-column-again",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "I am on the overview page",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I click on end date column(overview) again",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "batches should be in descending order according to end date",
  "keyword": "Then "
});
formatter.match({
  "location": "testOverviewTab.i_am_on_the_overview_page()"
});
formatter.result({
  "duration": 7077764,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.i_click_on_end_date_column_again()"
});
formatter.result({
  "duration": 43667675,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.batches_should_be_in_descending_order_according_to_end_date()"
});
formatter.result({
  "duration": 1084580894,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Click room column once",
  "description": "",
  "id": "ordering-of-batches-in-overview-tab;click-room-column-once",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 36,
  "name": "I am on the overview page",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "I click on room column(overview)",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "batches should be in ascending order according to room",
  "keyword": "Then "
});
formatter.match({
  "location": "testOverviewTab.i_am_on_the_overview_page()"
});
formatter.result({
  "duration": 4962176,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.i_click_on_room_column()"
});
formatter.result({
  "duration": 73151503,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.batches_should_be_in_ascending_order_according_to_room()"
});
formatter.result({
  "duration": 2120837400,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Click room column again",
  "description": "",
  "id": "ordering-of-batches-in-overview-tab;click-room-column-again",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 41,
  "name": "I am on the overview page",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "I click on room column(overview) again",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "batches should be in descending order according to room",
  "keyword": "Then "
});
formatter.match({
  "location": "testOverviewTab.i_am_on_the_overview_page()"
});
formatter.result({
  "duration": 6916160,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.i_click_on_room_column_again()"
});
formatter.result({
  "duration": 85515031,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.batches_should_be_in_descending_order_according_to_room()"
});
formatter.result({
  "duration": 1538473476,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "Click building column once",
  "description": "",
  "id": "ordering-of-batches-in-overview-tab;click-building-column-once",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 46,
  "name": "I am on the overview page",
  "keyword": "Given "
});
formatter.step({
  "line": 47,
  "name": "I click on building column(overview)",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "batches should be in ascending order according to building",
  "keyword": "Then "
});
formatter.match({
  "location": "testOverviewTab.i_am_on_the_overview_page()"
});
formatter.result({
  "duration": 7783842,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.i_click_on_building_column()"
});
formatter.result({
  "duration": 85155573,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.batches_should_be_in_ascending_order_according_to_building()"
});
formatter.result({
  "duration": 2455700442,
  "error_message": "java.lang.AssertionError: Batches should be in ascending order according to building, but they aren\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.overview.testOverviewTab.batches_should_be_in_ascending_order_according_to_building(testOverviewTab.java:260)\r\n\tat ✽.Then batches should be in ascending order according to building(src/test/resources/overview/overview_tab_batch_ordering.feature:48)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 50,
  "name": "Click building column again",
  "description": "",
  "id": "ordering-of-batches-in-overview-tab;click-building-column-again",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 51,
  "name": "I am on the overview page",
  "keyword": "Given "
});
formatter.step({
  "line": 52,
  "name": "I click on building column(overview) again",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "batches should be in descending order according to building",
  "keyword": "Then "
});
formatter.match({
  "location": "testOverviewTab.i_am_on_the_overview_page()"
});
formatter.result({
  "duration": 6050366,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.i_click_on_building_column_again()"
});
formatter.result({
  "duration": 61932424,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.batches_should_be_in_descending_order_according_to_building()"
});
formatter.result({
  "duration": 1833139571,
  "error_message": "java.lang.AssertionError: Batches should be in descending order according to building, but they aren\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.overview.testOverviewTab.batches_should_be_in_descending_order_according_to_building(testOverviewTab.java:271)\r\n\tat ✽.Then batches should be in descending order according to building(src/test/resources/overview/overview_tab_batch_ordering.feature:53)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 55,
  "name": "Click location column once",
  "description": "",
  "id": "ordering-of-batches-in-overview-tab;click-location-column-once",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 56,
  "name": "I am on the overview page",
  "keyword": "Given "
});
formatter.step({
  "line": 57,
  "name": "I click on location column(overview)",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "batches should be in ascending order according to location",
  "keyword": "Then "
});
formatter.match({
  "location": "testOverviewTab.i_am_on_the_overview_page()"
});
formatter.result({
  "duration": 8314722,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.i_click_on_location_column()"
});
formatter.result({
  "duration": 97648989,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.batches_should_be_in_ascending_order_according_to_location()"
});
formatter.result({
  "duration": 2808749318,
  "error_message": "java.lang.AssertionError: Batches should be in ascending order according to location, but they aren\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.overview.testOverviewTab.batches_should_be_in_ascending_order_according_to_location(testOverviewTab.java:282)\r\n\tat ✽.Then batches should be in ascending order according to location(src/test/resources/overview/overview_tab_batch_ordering.feature:58)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 60,
  "name": "Click location column again",
  "description": "",
  "id": "ordering-of-batches-in-overview-tab;click-location-column-again",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 61,
  "name": "I am on the overview page",
  "keyword": "Given "
});
formatter.step({
  "line": 62,
  "name": "I click on location column(overview) again",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "batches should be in descending order according to location",
  "keyword": "Then "
});
formatter.match({
  "location": "testOverviewTab.i_am_on_the_overview_page()"
});
formatter.result({
  "duration": 7194060,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.i_click_on_location_column_again()"
});
formatter.result({
  "duration": 65858139,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.batches_should_be_in_descending_order_according_to_location()"
});
formatter.result({
  "duration": 1732338155,
  "error_message": "java.lang.AssertionError: Batches should be in descending order according to location, but they aren\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.overview.testOverviewTab.batches_should_be_in_descending_order_according_to_location(testOverviewTab.java:293)\r\n\tat ✽.Then batches should be in descending order according to location(src/test/resources/overview/overview_tab_batch_ordering.feature:63)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 65,
  "name": "Click trainer/cotrainer column once",
  "description": "",
  "id": "ordering-of-batches-in-overview-tab;click-trainer/cotrainer-column-once",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 66,
  "name": "I am on the overview page",
  "keyword": "Given "
});
formatter.step({
  "line": 67,
  "name": "I click on trainer/cotrainer column(overview)",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "batches should be in ascending order according to trainer/cotrainer",
  "keyword": "Then "
});
formatter.match({
  "location": "testOverviewTab.i_am_on_the_overview_page()"
});
formatter.result({
  "duration": 7271841,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.i_click_on_trainer_cotrainer_column()"
});
formatter.result({
  "duration": 120977483,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.batches_should_be_in_ascending_order_according_to_trainer_cotrainer()"
});
formatter.result({
  "duration": 2870446887,
  "error_message": "java.lang.AssertionError: Batches should be in ascending order according to trainer/cotrainer, but they aren\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.overview.testOverviewTab.batches_should_be_in_ascending_order_according_to_trainer_cotrainer(testOverviewTab.java:304)\r\n\tat ✽.Then batches should be in ascending order according to trainer/cotrainer(src/test/resources/overview/overview_tab_batch_ordering.feature:68)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 70,
  "name": "Click trainer/cotrainer column again",
  "description": "",
  "id": "ordering-of-batches-in-overview-tab;click-trainer/cotrainer-column-again",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 71,
  "name": "I am on the overview page",
  "keyword": "Given "
});
formatter.step({
  "line": 72,
  "name": "I click on trainer/cotrainer column(overview) again",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "batches should be in descending order according to trainer/cotrainer",
  "keyword": "Then "
});
formatter.match({
  "location": "testOverviewTab.i_am_on_the_overview_page()"
});
formatter.result({
  "duration": 6950143,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.i_click_on_trainer_cotrainer_column_again()"
});
formatter.result({
  "duration": 55408949,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.batches_should_be_in_descending_order_according_to_trainer_cotrainer()"
});
formatter.result({
  "duration": 1647517119,
  "error_message": "java.lang.AssertionError: Batches should be in descending order according to trainer/cotrainer, but they aren\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.overview.testOverviewTab.batches_should_be_in_descending_order_according_to_trainer_cotrainer(testOverviewTab.java:315)\r\n\tat ✽.Then batches should be in descending order according to trainer/cotrainer(src/test/resources/overview/overview_tab_batch_ordering.feature:73)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 75,
  "name": "Click curriculum column once",
  "description": "",
  "id": "ordering-of-batches-in-overview-tab;click-curriculum-column-once",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 76,
  "name": "I am on the overview page",
  "keyword": "Given "
});
formatter.step({
  "line": 77,
  "name": "I click on curriculum column(overview)",
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "batches should be in ascending order according to curriculum",
  "keyword": "Then "
});
formatter.match({
  "location": "testOverviewTab.i_am_on_the_overview_page()"
});
formatter.result({
  "duration": 8112338,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.i_click_on_curriculum_column()"
});
formatter.result({
  "duration": 117226588,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.batches_should_be_in_ascending_order_according_to_curriculum()"
});
formatter.result({
  "duration": 2667645232,
  "error_message": "java.lang.AssertionError: Batches should be in ascending order according to curriculum, but they aren\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.overview.testOverviewTab.batches_should_be_in_ascending_order_according_to_curriculum(testOverviewTab.java:326)\r\n\tat ✽.Then batches should be in ascending order according to curriculum(src/test/resources/overview/overview_tab_batch_ordering.feature:78)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 80,
  "name": "Click curriculum column again",
  "description": "",
  "id": "ordering-of-batches-in-overview-tab;click-curriculum-column-again",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 81,
  "name": "I am on the overview page",
  "keyword": "Given "
});
formatter.step({
  "line": 82,
  "name": "I click on curriculum column(overview) again",
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "batches should be in descending order according to curriculum",
  "keyword": "Then "
});
formatter.match({
  "location": "testOverviewTab.i_am_on_the_overview_page()"
});
formatter.result({
  "duration": 8314344,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.i_click_on_curriculum_column_again()"
});
formatter.result({
  "duration": 87388590,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.batches_should_be_in_descending_order_according_to_curriculum()"
});
formatter.result({
  "duration": 1677253548,
  "error_message": "java.lang.AssertionError: Batches should be in descending order according to curriculum, but they aren\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.overview.testOverviewTab.batches_should_be_in_descending_order_according_to_curriculum(testOverviewTab.java:337)\r\n\tat ✽.Then batches should be in descending order according to curriculum(src/test/resources/overview/overview_tab_batch_ordering.feature:83)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 85,
  "name": "Click name column once",
  "description": "",
  "id": "ordering-of-batches-in-overview-tab;click-name-column-once",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 86,
  "name": "I am on the overview page",
  "keyword": "Given "
});
formatter.step({
  "line": 87,
  "name": "I click on name column(overview)",
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "batches should be in ascending order according to name",
  "keyword": "Then "
});
formatter.match({
  "location": "testOverviewTab.i_am_on_the_overview_page()"
});
formatter.result({
  "duration": 8589978,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.i_click_on_name_column()"
});
formatter.result({
  "duration": 112811906,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.batches_should_be_in_ascending_order_according_to_name()"
});
formatter.result({
  "duration": 2786891881,
  "status": "passed"
});
formatter.scenario({
  "line": 90,
  "name": "Click name column again",
  "description": "",
  "id": "ordering-of-batches-in-overview-tab;click-name-column-again",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 91,
  "name": "I am on the overview page",
  "keyword": "Given "
});
formatter.step({
  "line": 92,
  "name": "I click on name column(overview) again",
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "batches should be in descending order according to name",
  "keyword": "Then "
});
formatter.match({
  "location": "testOverviewTab.i_am_on_the_overview_page()"
});
formatter.result({
  "duration": 7491217,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.i_click_on_name_column_again()"
});
formatter.result({
  "duration": 72203396,
  "status": "passed"
});
formatter.match({
  "location": "testOverviewTab.batches_should_be_in_descending_order_according_to_name()"
});
formatter.result({
  "duration": 3866333891,
  "status": "passed"
});
});