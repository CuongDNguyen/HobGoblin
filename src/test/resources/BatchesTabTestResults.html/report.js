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
  "duration": 9440776911,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.i_clicked_on_the_Batches_tab()"
});
formatter.result({
  "duration": 2825472779,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.browser_should_land_on_the_batches_page()"
});
formatter.result({
  "duration": 5028821927,
  "status": "passed"
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
  "duration": 27307447,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_ascending_order_according_to_start_date()"
});
formatter.result({
  "duration": 9748782583,
  "status": "passed"
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
  "duration": 54660960,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.i_clicked_on_start_date_column_batches()"
});
formatter.result({
  "duration": 514295423,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_descending_order_according_to_start_date()"
});
formatter.result({
  "duration": 5937119469,
  "status": "passed"
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
  "duration": 5947973048,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.i_clicked_on_start_date_column_batches()"
});
formatter.result({
  "duration": 128593679,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_ascending_order_according_to_start_date()"
});
formatter.result({
  "duration": 6838797630,
  "status": "passed"
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
  "duration": 11752223,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_end_date_column_batches()"
});
formatter.result({
  "duration": 224329463,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_ascending_order_according_to_end_date()"
});
formatter.result({
  "duration": 9044592373,
  "status": "passed"
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
  "duration": 16142741,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_end_date_column_batches_again()"
});
formatter.result({
  "duration": 200601110,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_descending_order_according_to_end_date()"
});
formatter.result({
  "duration": 7244753978,
  "status": "passed"
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
  "duration": 16521833,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_room_column_batches()"
});
formatter.result({
  "duration": 181170012,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_ascending_order_according_to_room()"
});
formatter.result({
  "duration": 9060420588,
  "status": "passed"
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
  "duration": 19054272,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_room_column_batches_again()"
});
formatter.result({
  "duration": 167795698,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_descending_order_according_to_room()"
});
formatter.result({
  "duration": 7637934856,
  "status": "passed"
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
  "duration": 19071262,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_building_column_batches()"
});
formatter.result({
  "duration": 191979792,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_ascending_order_according_to_building()"
});
formatter.result({
  "duration": 9689817571,
  "error_message": "java.lang.AssertionError: Batches should be in ascending order according to building, but they aren\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.batches_should_be_in_ascending_order_according_to_building(testBatchesTab.java:253)\r\n\tat ✽.Then batches should be in ascending order according to building(src/test/resources/batches/batches_tab_batch_ordering.feature:52)\r\n",
  "status": "failed"
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
  "duration": 16390057,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_building_column_batches_again()"
});
formatter.result({
  "duration": 191819697,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_descending_order_according_to_building()"
});
formatter.result({
  "duration": 7548139185,
  "error_message": "java.lang.AssertionError: Batches should be in descending order according to building, but they aren\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.batches_should_be_in_descending_order_according_to_building(testBatchesTab.java:264)\r\n\tat ✽.Then batches should be in descending order according to building(src/test/resources/batches/batches_tab_batch_ordering.feature:57)\r\n",
  "status": "failed"
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
  "duration": 19283086,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_location_column_batches()"
});
formatter.result({
  "duration": 188933842,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_ascending_order_according_to_location()"
});
formatter.result({
  "duration": 9608275831,
  "error_message": "java.lang.AssertionError: Batches should be in ascending order according to location, but they aren\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.batches_should_be_in_ascending_order_according_to_location(testBatchesTab.java:275)\r\n\tat ✽.Then batches should be in ascending order according to location(src/test/resources/batches/batches_tab_batch_ordering.feature:62)\r\n",
  "status": "failed"
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
  "duration": 17472960,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_location_column_batches_again()"
});
formatter.result({
  "duration": 209876399,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_descending_order_according_to_location()"
});
formatter.result({
  "duration": 8280473186,
  "error_message": "java.lang.AssertionError: Batches should be in descending order according to location, but they aren\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.batches_should_be_in_descending_order_according_to_location(testBatchesTab.java:286)\r\n\tat ✽.Then batches should be in descending order according to location(src/test/resources/batches/batches_tab_batch_ordering.feature:67)\r\n",
  "status": "failed"
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
  "duration": 27229288,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_trainer_cotrainer_column_batches()"
});
formatter.result({
  "duration": 200105345,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_ascending_order_according_to_trainer_cotrainer()"
});
formatter.result({
  "duration": 9284644328,
  "error_message": "java.lang.AssertionError: Batches should be in ascending order according to trainer/cotrainer, but they aren\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.batches_should_be_in_ascending_order_according_to_trainer_cotrainer(testBatchesTab.java:297)\r\n\tat ✽.Then batches should be in ascending order according to trainer/cotrainer(src/test/resources/batches/batches_tab_batch_ordering.feature:72)\r\n",
  "status": "failed"
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
  "duration": 13607281,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_trainer_cotrainer_column_batches_again()"
});
formatter.result({
  "duration": 170385152,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_descending_order_according_to_trainer_cotrainer()"
});
formatter.result({
  "duration": 7357358591,
  "error_message": "java.lang.AssertionError: Batches should be in descending order according to trainer/cotrainer, but they aren\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.batches_should_be_in_descending_order_according_to_trainer_cotrainer(testBatchesTab.java:308)\r\n\tat ✽.Then batches should be in descending order according to trainer/cotrainer(src/test/resources/batches/batches_tab_batch_ordering.feature:77)\r\n",
  "status": "failed"
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
  "duration": 12588944,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_focus_column_batches()"
});
formatter.result({
  "duration": 190446811,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_ascending_order_according_to_focus()"
});
formatter.result({
  "duration": 9488127517,
  "error_message": "java.lang.AssertionError: Batches should be in ascending order according to focus, but they aren\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.batches_should_be_in_ascending_order_according_to_focus(testBatchesTab.java:319)\r\n\tat ✽.Then batches should be in ascending order according to focus(src/test/resources/batches/batches_tab_batch_ordering.feature:82)\r\n",
  "status": "failed"
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
  "duration": 10418229,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_focus_column_batches_again()"
});
formatter.result({
  "duration": 166923108,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_descending_order_according_to_focus()"
});
formatter.result({
  "duration": 7978126704,
  "error_message": "java.lang.AssertionError: Batches should be in descending order according to focus, but they aren\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.batches_should_be_in_descending_order_according_to_focus(testBatchesTab.java:330)\r\n\tat ✽.Then batches should be in descending order according to focus(src/test/resources/batches/batches_tab_batch_ordering.feature:87)\r\n",
  "status": "failed"
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
  "duration": 13234231,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_curriculum_column_batches()"
});
formatter.result({
  "duration": 286370253,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_ascending_order_according_to_curriculum()"
});
formatter.result({
  "duration": 10371150510,
  "error_message": "java.lang.AssertionError: Batches should be in ascending order according to curriculum, but they aren\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.batches_should_be_in_ascending_order_according_to_curriculum(testBatchesTab.java:341)\r\n\tat ✽.Then batches should be in ascending order according to curriculum(src/test/resources/batches/batches_tab_batch_ordering.feature:92)\r\n",
  "status": "failed"
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
  "duration": 26190185,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_curriculum_column_batches_again()"
});
formatter.result({
  "duration": 444415664,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_descending_order_according_to_curriculum()"
});
formatter.result({
  "duration": 8252261052,
  "error_message": "java.lang.AssertionError: Batches should be in descending order according to curriculum, but they aren\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.batches_should_be_in_descending_order_according_to_curriculum(testBatchesTab.java:352)\r\n\tat ✽.Then batches should be in descending order according to curriculum(src/test/resources/batches/batches_tab_batch_ordering.feature:97)\r\n",
  "status": "failed"
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
  "duration": 20800963,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_name_column_batches()"
});
formatter.result({
  "duration": 215238434,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_ascending_order_according_to_name()"
});
formatter.result({
  "duration": 10152274834,
  "error_message": "java.lang.AssertionError: Batches should be in ascending order according to name, but they aren\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.batches_should_be_in_ascending_order_according_to_name(testBatchesTab.java:364)\r\n\tat ✽.Then batches should be in ascending order according to name(src/test/resources/batches/batches_tab_batch_ordering.feature:102)\r\n",
  "status": "failed"
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
  "duration": 14084922,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.i_click_on_name_column_batches_again()"
});
formatter.result({
  "duration": 159747927,
  "status": "passed"
});
formatter.match({
  "location": "testBatchesTab.batches_should_be_in_descending_order_according_to_name()"
});
formatter.result({
  "duration": 8060055089,
  "error_message": "java.lang.AssertionError: Batches should be in descending order according to name, but they aren\u0027t!\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.project2.batches.testBatchesTab.batches_should_be_in_descending_order_according_to_name(testBatchesTab.java:375)\r\n\tat ✽.Then batches should be in descending order according to name(src/test/resources/batches/batches_tab_batch_ordering.feature:107)\r\n",
  "status": "failed"
});
});