#Author: Michael Sikorski
#Feature: Batches Timeline
@BatchTimelineTest
Feature: Batch Timeline
  
  I want to use the Batch Timeline to filter batches
  according to start date, end date, curriculum, focus,
  location, building. I should also be able to hide
  concluded batches, hide batchless trainers, and 
  change the number of trainers per page.
  
  Scenario: Log in and go to batches tab
  	Given I have logged in
  	And I click on the batches tab
  	Then I am on the batches tab

	Scenario: Option to change number of trainers per page
		Given I am on the batches tab
		Then There is an option to change number of trainers per page
	
	Scenario: Change number of trainers per page
		Given I am on the batches tab
		And There is an option to change number of trainers per page
		And I set the number of trainers per page to "4"
		Then The timeline should contain "4" trainers
		
	Scenario: Option to filter Batch timeline by start date
		Given I am on the batches tab
		Then There is an option to filter batches by start date
		
	Scenario: Option to filter Batch timeline by end date
		Given I am on the batches tab
		Then There is an option to filter batches by end date
		
	Scenario: Option to filter Batch timeline by curriculum
		Given I am on the batches tab
		Then There is an option to filter batches by curriculum
		
	Scenario: Option to filter Batch timeline by focus
		Given I am on the batches tab
		Then There is an option to filter batches by focus
