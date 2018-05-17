$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/batch_timeline.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Michael Sikorski"
    },
    {
      "line": 2,
      "value": "#Feature: Batches Timeline"
    }
  ],
  "line": 4,
  "name": "Batch Timeline",
  "description": "\r\nI want to use the Batch Timeline to filter batches\r\naccording to start date, end date, curriculum, focus,\r\nlocation, building. I should also be able to hide\r\nconcluded batches, hide batchless trainers, and \r\nchange the number of trainers per page.",
  "id": "batch-timeline",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@BatchTimelineTest"
    }
  ]
});
formatter.scenario({
  "line": 12,
  "name": "Log in and go to batches tab",
  "description": "",
  "id": "batch-timeline;log-in-and-go-to-batches-tab",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I have logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I click on the batches tab",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I am on the batches tab",
  "keyword": "Then "
});
formatter.match({
  "location": "TestBatchTimeline.i_have_logged_in()"
});
formatter.result({
  "duration": 6123967928,
  "status": "passed"
});
formatter.match({
  "location": "TestBatchTimeline.i_click_on_the_batches_tab()"
});
formatter.result({
  "duration": 5197948599,
  "status": "passed"
});
formatter.match({
  "location": "TestBatchTimeline.i_am_on_the_batches_tab()"
});
formatter.result({
  "duration": 56068584,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Option to change number of trainers per page",
  "description": "",
  "id": "batch-timeline;option-to-change-number-of-trainers-per-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "I am on the batches tab",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "There is an option to change number of trainers per page",
  "keyword": "Then "
});
formatter.match({
  "location": "TestBatchTimeline.i_am_on_the_batches_tab()"
});
formatter.result({
  "duration": 13954279,
  "status": "passed"
});
formatter.match({
  "location": "TestBatchTimeline.there_is_an_option_to_change_number_of_trainers_per_page()"
});
formatter.result({
  "duration": 2070316621,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Change number of trainers per page",
  "description": "",
  "id": "batch-timeline;change-number-of-trainers-per-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "I am on the batches tab",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "There is an option to change number of trainers per page",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I set the number of trainers per page to \"4\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "The timeline should contain \"4\" trainers",
  "keyword": "Then "
});
formatter.match({
  "location": "TestBatchTimeline.i_am_on_the_batches_tab()"
});
formatter.result({
  "duration": 60140800,
  "status": "passed"
});
formatter.match({
  "location": "TestBatchTimeline.there_is_an_option_to_change_number_of_trainers_per_page()"
});
formatter.result({
  "duration": 55778223,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 42
    }
  ],
  "location": "TestBatchTimeline.i_set_the_number_of_trainers_per_page_to(String)"
});
formatter.result({
  "duration": 307851240,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 29
    }
  ],
  "location": "TestBatchTimeline.the_timeline_should_contain_trainers(String)"
});
formatter.result({
  "duration": 10046459136,
  "error_message": "java.lang.AssertionError: There should be 4 trainers in the timeline, but there aren\u0027t! expected [4] but found [0]\r\n\tat org.testng.Assert.fail(Assert.java:93)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:512)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:134)\r\n\tat org.testng.Assert.assertEquals(Assert.java:115)\r\n\tat org.testng.Assert.assertEquals(Assert.java:388)\r\n\tat com.project2.batchTimeline.TestBatchTimeline.the_timeline_should_contain_trainers(TestBatchTimeline.java:104)\r\n\tat ✽.Then The timeline should contain \"4\" trainers(src/test/resources/batch_timeline.feature:25)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 27,
  "name": "Option to filter Batch timeline by start date",
  "description": "",
  "id": "batch-timeline;option-to-filter-batch-timeline-by-start-date",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "I am on the batches tab",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "There is an option to filter batches by start date",
  "keyword": "Then "
});
formatter.match({
  "location": "TestBatchTimeline.i_am_on_the_batches_tab()"
});
formatter.result({
  "duration": 13748497,
  "status": "passed"
});
formatter.match({
  "location": "TestBatchTimeline.there_is_an_option_to_filter_batches_by_start_date()"
});
formatter.result({
  "duration": 44772101,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Option to filter Batch timeline by end date",
  "description": "",
  "id": "batch-timeline;option-to-filter-batch-timeline-by-end-date",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "I am on the batches tab",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "There is an option to filter batches by end date",
  "keyword": "Then "
});
formatter.match({
  "location": "TestBatchTimeline.i_am_on_the_batches_tab()"
});
formatter.result({
  "duration": 15951685,
  "status": "passed"
});
formatter.match({
  "location": "TestBatchTimeline.there_is_an_option_to_filter_batches_by_end_date()"
});
formatter.result({
  "duration": 42787533,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Option to filter Batch timeline by curriculum",
  "description": "",
  "id": "batch-timeline;option-to-filter-batch-timeline-by-curriculum",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 36,
  "name": "I am on the batches tab",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "There is an option to filter batches by curriculum",
  "keyword": "Then "
});
formatter.match({
  "location": "TestBatchTimeline.i_am_on_the_batches_tab()"
});
formatter.result({
  "duration": 6127770,
  "status": "passed"
});
formatter.match({
  "location": "TestBatchTimeline.there_is_an_option_to_filter_batches_by_curriculum()"
});
formatter.result({
  "duration": 20313884,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Option to filter Batch timeline by focus",
  "description": "",
  "id": "batch-timeline;option-to-filter-batch-timeline-by-focus",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 40,
  "name": "I am on the batches tab",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "There is an option to filter batches by focus",
  "keyword": "Then "
});
formatter.match({
  "location": "TestBatchTimeline.i_am_on_the_batches_tab()"
});
formatter.result({
  "duration": 6028843,
  "status": "passed"
});
formatter.match({
  "location": "TestBatchTimeline.there_is_an_option_to_filter_batches_by_focus()"
});
formatter.result({
  "duration": 18349327,
  "status": "passed"
});
});